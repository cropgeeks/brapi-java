package uk.ac.hutton.ics.brapi.resource.image;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.location.GeometryPoint;

public class Image extends BrapiObject
{
	private String          copyright;
	private String          description;
	private List<String>    descriptiveOntologyTerms;
	private List<Reference> externalReferences;
	private String          imageDbId;
	private String          imageFileName;
	private Integer         imageFileSize;
	private Integer         imageHeight;
	private GeometryPoint   imageLocation;
	private String          imageName;
	private Timestamp       imageTimeStamp;
	private URI             imageURL;
	private Integer         imageWidth;
	private String          mimeType;
	private List<String>    observationDbIds;
	private String          observationUnitDbId;

	public String getCopyright()
	{
		return copyright;
	}

	public Image setCopyright(String copyright)
	{
		this.copyright = copyright;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Image setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public List<String> getDescriptiveOntologyTerms()
	{
		return descriptiveOntologyTerms;
	}

	public Image setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms)
	{
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Image setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getImageDbId()
	{
		return imageDbId;
	}

	public Image setImageDbId(String imageDbId)
	{
		this.imageDbId = imageDbId;
		return this;
	}

	public String getImageFileName()
	{
		return imageFileName;
	}

	public Image setImageFileName(String imageFileName)
	{
		this.imageFileName = imageFileName;
		return this;
	}

	public Integer getImageFileSize()
	{
		return imageFileSize;
	}

	public Image setImageFileSize(Integer imageFileSize)
	{
		this.imageFileSize = imageFileSize;
		return this;
	}

	public Integer getImageHeight()
	{
		return imageHeight;
	}

	public Image setImageHeight(Integer imageHeight)
	{
		this.imageHeight = imageHeight;
		return this;
	}

	public GeometryPoint getImageLocation()
	{
		return imageLocation;
	}

	public Image setImageLocation(GeometryPoint imageLocation)
	{
		this.imageLocation = imageLocation;
		return this;
	}

	public String getImageName()
	{
		return imageName;
	}

	public Image setImageName(String imageName)
	{
		this.imageName = imageName;
		return this;
	}

	public Timestamp getImageTimeStamp()
	{
		return imageTimeStamp;
	}

	public Image setImageTimeStamp(Timestamp imageTimeStamp)
	{
		this.imageTimeStamp = imageTimeStamp;
		return this;
	}

	public URI getImageURL()
	{
		return imageURL;
	}

	public Image setImageURL(URI imageURL)
	{
		this.imageURL = imageURL;
		return this;
	}

	public Integer getImageWidth()
	{
		return imageWidth;
	}

	public Image setImageWidth(Integer imageWidth)
	{
		this.imageWidth = imageWidth;
		return this;
	}

	public String getMimeType()
	{
		return mimeType;
	}

	public Image setMimeType(String mimeType)
	{
		this.mimeType = mimeType;
		return this;
	}

	public List<String> getObservationDbIds()
	{
		return observationDbIds;
	}

	public Image setObservationDbIds(List<String> observationDbIds)
	{
		this.observationDbIds = observationDbIds;
		return this;
	}

	public String getObservationUnitDbId()
	{
		return observationUnitDbId;
	}

	public Image setObservationUnitDbId(String observationUnitDbId)
	{
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}
}
