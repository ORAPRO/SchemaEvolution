package com.schemaevolution.constants;

public interface SEConstants {

	public static final int ONE =1;
	
	// Property file keys
	public static final String BASE_LOC = "BASE_LOC";
	public static final String INBOX = "INBOX";

	public static final String CTL_FILE_EXT = "CTL_FILE_EXT";
	public static final String META_FILE_EXT = "META_FILE_EXT";
	public static final String DAT_FILE_EXT = "DAT_FILE_EXT";

	public static final String HDFS_CONTROL_FOLDER_NAME = "CONTROL_FOLDER_NAME";
	public static final String HDFS_META_FOLDER_NAME = "META_FOLDER_NAME";
	public static final String HDFS_DATA_FOLDER_NAME = "DATA_FOLDER_NAME";

	// File Extensions
	public static final String EXTENSION_CTL = "ctl";
	public static final String EXTENSION_META = "meta";
	public static final String EXTENSION_DATA = "dat";

	
	
	// Separators 
	public static final String SEPERATOR_PIPE = "|";
	public static final String SEPERATOR_TAB = "\t";
	public static final String SEPERATOR_COMMA = ",";
	public static final String SEPERATOR_EQUAL = "=";
	public static final String SEPERATOR_DOT = ".";
	public static final String FALSE = "N";
	public static final String EMPTY = "";
	public static final int ZERO = 0;
	
	//Control File Indexes
	public static final int CTL_SOURCENAME_IDX=0;
	public static final int CTL_SOURCESCHEMANAME_IDX=1;
	public static final int CTL_ENTITYNAME_IDX=2;
	public static final int CTL_RECORDCOUNT_IDX=3;
	public static final int CTL_EXTRACTDATE_IDX=4;
	public static final int CTL_EXTRACTTIME_IDX=5;
	public static final int CTL_FILETIMESTAMP_IDX=6;
	public static final int CTL_EXTRACTDATETIME_IDX=7;
	public static final int CTL_ETLLANDINGDIRECTORY_IDX=8;
	public static final int CTL_FILELOADTYPE_IDX=9;
	public static final int CTL_ETLAPPUSERID_IDX=10;
	public static final int CTL_EXTRACTSTATUS_IDX=11;
	public static final int CTL_SOURCETIMEZONE_IDX=12;
	public static final int CTL_EFFECTIVEDATE_IDX=13;
	public static final int CTL_DATAFILEEXTENSION_IDX=14;
	public static final int CTL_ADDITIONALFILESEXTENSIONS_IDX=15;
	public static final int CTL_FILEFORMATTYPE_IDX=16;
	public static final int CTL_FIELDDELIMITER_IDX=17;
	public static final int CTL_SOURCEWATERMARK_1_IDX=18;
	public static final int CTL_SOURCEWATERMARK_2_IDX=19;
	public static final int CTL_ETLPROCESS_IDX=20;
	public static final int CTL_FREQUENCY_IDX=21;
	public static final int CTL_RECORDDELIMITER_IDX=22;

	public static final String TRIGGER_FILE_NAME_EXT = "TRIGGER_FILE_NAME_EXT";

	public static final String FILE_SEPARATOR_NAME = "file.separator";
	public static final String FILE_SEPARATOR=System.getProperty(FILE_SEPARATOR_NAME);

	public static final String HDFS_BASE_LOC = "HDFS_BASE_LOC";
	public static final String ARCHIVE_LOC = "ARCHIVE";
	public static final String FAILED_LOC = "FAILED";

	public static final String PROPERTY_FILE_NAME = "PRTS.properties";

	public static final String PROJECT_TIME_FORMAT = "yyyyMMdd";

	public static final String HDFS_INBOX_LOC = "HDFS_INBOX";

	public static final String DESTINATION_FORMAT = "DESTINATION_FORMAT";

	public static final String CLASS_AVRO_FORMAT = "org.avroservice.AvroStorageFormat";

	public static final String DESTINATION_FORMAT_AVRO = "avro"; // Important Note::: The value is in properties file name for  PROPERTY_FILE_NAME key DESTINATION_FORMAT

	public static final String ENABLE_HDFS = "ENABLE_HDFS"; //environment fpr enabling hdfs

	public static final String ENABLE_CONTROL_PROCESS = "ENABLE_CONTROL_PROCESS";

	public static final String ENABLE_MOVE_FILES = "ENABLE_MOVE_FILES";

	public interface AVROConstants{
		
		public static final String TYPE="type";
		public static final String TYPE_RECORD="record";
		public static final String TABLE_NAME="name";
		public static final String SOURCE_NAME="source";
		public static final String NAMESPACE="namespace";
		public static final String DOC="doc";
		public static final String FIELDS="fields";
		public static final String FIELD_NAME="name";
		public static final String FIELD_DOC="doc";
		public static final String FIELD_TYPE="type";
		public static final String FIELD_DEFAULT="default";
		
		
		//Columns
		public static final String FIELD_SOURCENAME="sourceName";
		public static final String FIELD_SCHEMANAME="schemaName";
		public static final String FIELD_TABLENAME="tableName";
		public static final String FIELD_COLUMNNAME="columnName";
		public static final String FIELD_DATATYPE="dataType";
		public static final String FIELD_DATALENGTH="dataLength";
		public static final String FIELD_DATASCALE="dataScale";
		public static final String FIELD_FORMAT="format";
		public static final String FIELD_PRIMARYKEY="primaryKey";
		public static final String FIELD_COLUMNID="columnId";		
		
	}
	
}
