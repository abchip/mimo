var path = require("path");
var webpack = require("webpack");

module.exports = function(env) {

	var pack = require("./package.json");
	var MiniCssExtractPlugin = require("mini-css-extract-plugin");

	var production = !!(env && env.production === "true");
	var asmodule = !!(env && env.module === "true");
	var standalone = !!(env && env.standalone === "true");

	var babelSettings = {
		extends: path.join(__dirname, '/.babelrc')
	};

	var config = {
		mode: production ? "production" : "development",
		entry: {
			app: "./mimo-biz/app.ts"
		},
		output: {
			path: path.join(__dirname, "codebase"),
			publicPath:"/codebase/",
			filename: "[name].js",
			chunkFilename: "[name].bundle.js"
		},
		module: {
			rules: [
				{
	                test: /\.ts$/,
	                loader: "ts-loader"
	            },
				{
					test: /\.js$/,
					use: "babel-loader?" + JSON.stringify(babelSettings)
				},
				{
					test: /\.(svg|png|jpg|gif)$/,
					use: "url-loader?limit=25000"
				},
				{
					test: /\.(less|css)$/,
					use: [ MiniCssExtractPlugin.loader, "css-loader", "less-loader" ]
				}
			]
		},
		stats:"minimal",
		node: {
		      fs: "empty"
		},
		resolve: {
			extensions: [".ts", ".js"],
			modules: ["./mimo-biz", "./mimo", "node_modules"],
			alias:{
				"mimo-views":path.resolve(__dirname, "mimo/views"),
				"jet-views":path.resolve(__dirname, "mimo-biz/views"),
				"jet-locales":path.resolve(__dirname, "mimo-biz/config/locales")
			}
		},
		plugins: [
			new MiniCssExtractPlugin({
				filename:"[name].css"
			}),
			new webpack.DefinePlugin({
				VERSION: `"${pack.version}"`,
				APPNAME: `"${pack.name}"`,
				PRODUCTION : production,
				BUILD_AS_MODULE : (asmodule || standalone)
			})
		],
		devServer:{
			stats:"errors-only"
		}
	};

	if (!production){
		config.devtool = "inline-source-map";
	}
	else {
		config.devtool = "source-map";
	}

	if (asmodule){
		if (!standalone){
			config.externals = config.externals || {};
			config.externals = [ "webix-jet" ];
		}

		const out = config.output;
		out.library = pack.name.replace(/[^a-z0-9]/gi, "");
		out.libraryTarget= "umd";
	}

	return config;
}