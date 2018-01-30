select * from OFBIZ.POSTAL_ADDRESS where PLANET_ID = 'juppiter';

update OFBIZ.POSTAL_ADDRESS set PLANET_ID = 'jupiter' where PLANET_ID = 'juppiter';

alter table OFBIZ.POSTAL_ADDRESS DROP COLUMN PLANET;