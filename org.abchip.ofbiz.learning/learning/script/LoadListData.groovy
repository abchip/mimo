// java.util.* (HashMap and ArrayList) imported by default
ArrayList listOfRecords = new ArrayList();
for(int i=1; i<=5; i++){
   HashMap row = new HashMap();
    row.put("firstName", "First" + i);
    row.put("lastName", "Last" + i);
    listOfRecords.add(row);
}
context.put("listOfRecords", listOfRecords);
