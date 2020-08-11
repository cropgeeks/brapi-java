package uk.ac.hutton.ics.brapi.resource.base;

public class DataFile
{
	private String fileDescription;
	private String fileMD5Hash;
	private String fileName;
	private long   fileSize;
	private String fileType;
	private String fileURL;

	public String getFileDescription()
	{
		return fileDescription;
	}

	public DataFile setFileDescription(String fileDescription)
	{
		this.fileDescription = fileDescription;
		return this;
	}

	public String getFileMD5Hash()
	{
		return fileMD5Hash;
	}

	public DataFile setFileMD5Hash(String fileMD5Hash)
	{
		this.fileMD5Hash = fileMD5Hash;
		return this;
	}

	public String getFileName()
	{
		return fileName;
	}

	public DataFile setFileName(String fileName)
	{
		this.fileName = fileName;
		return this;
	}

	public long getFileSize()
	{
		return fileSize;
	}

	public DataFile setFileSize(long fileSize)
	{
		this.fileSize = fileSize;
		return this;
	}

	public String getFileType()
	{
		return fileType;
	}

	public DataFile setFileType(String fileType)
	{
		this.fileType = fileType;
		return this;
	}

	public String getFileURL()
	{
		return fileURL;
	}

	public DataFile setFileURL(String fileURL)
	{
		this.fileURL = fileURL;
		return this;
	}
}
