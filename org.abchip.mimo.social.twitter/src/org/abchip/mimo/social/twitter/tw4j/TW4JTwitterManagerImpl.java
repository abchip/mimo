package org.abchip.mimo.social.twitter.tw4j;
	
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceHelper;
import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterManager;

import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.SymbolEntity;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.URLEntity;
import twitter4j.UserMentionEntity;

public class TW4JTwitterManagerImpl implements TwitterManager {

	private Twitter twitter = null;
	
	@PostConstruct
	private void init() {

/*		ConfigurationBuilder configuration = new ConfigurationBuilder();
		configuration.setDebugEnabled(true).setOAuthConsumerKey("yourConsumeKey")
								.setOAuthConsumerSecret("yourConsumerSecret")
								.setOAuthAccessToken("yourAccessToken")
								.setOAuthAccessTokenSecret("yourTokenSecret");
		twitter = new TwitterFactory(configuration.build()).getInstance();*/
		twitter = new TwitterFactory().getInstance();
	}
	
	@Override
	public EntityIterator<Tweet> search(ContextProvider contextProvider, String language, String query, int maxNumber) {

		List<Tweet> tweets = new ArrayList<Tweet>();
		
		try {
			Query twitterQuery = new Query(query + " -filter:retweets");
			twitterQuery.setLang(language);
			twitterQuery.setResultType(Query.RECENT);
			if(maxNumber > 0)
				twitterQuery.setCount(maxNumber);
			
			QueryResult result = twitter.search(twitterQuery);
			List<Status> resultTweets = result.getTweets();
			for (Status tweetStatus : resultTweets) {
				Tweet tweet = org.abchip.mimo.social.twitter.TwitterFactory.eINSTANCE.createTweet();
				tweet.setId(tweetStatus.getId());
				tweet.setUser(tweetStatus.getUser().getScreenName());
				tweet.setLanguage(tweetStatus.getLang());
				tweet.setText(tweetStatus.getText());
				tweet.setDate(tweetStatus.getCreatedAt());
				if (tweetStatus.getGeoLocation() != null)
					tweet.setGeolocation(tweetStatus.getGeoLocation().toString());
				for (HashtagEntity hashtagEntity : tweetStatus.getHashtagEntities())
					tweet.getHashtags().add(hashtagEntity.getText());
	
				for (MediaEntity mediaEntity : tweetStatus.getMediaEntities())
					tweet.getMedias().add(mediaEntity.getText());
	
				if (tweetStatus.getPlace() != null)
					tweet.setPlace(tweetStatus.getPlace().getFullName());
	
				for (SymbolEntity symbolEntity : tweetStatus.getSymbolEntities())
					tweet.getSymbols().add(symbolEntity.getText());
	
				for (URLEntity urlEntity : tweetStatus.getURLEntities())
					tweet.getEntities().add(urlEntity.getText());
	
				for (UserMentionEntity userMentionEntity : tweetStatus.getUserMentionEntities())
					tweet.getUserMentions().add(userMentionEntity.getScreenName());
	
				tweets.add(tweet);
			}
		} catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
		
		return ResourceHelper.wrapIterator(tweets);
	}
}
