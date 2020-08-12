package uk.ac.hutton.ics.brapi.resource.image;

import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.location.CoordinatesPoint;

public class ImageSearch
{
	private List<String>     descriptiveOntologyTerms;
	private List<String>     externalReferenceIDs;
	private List<String>     externalReferenceSources;
	private List<String>     imageDbIds;
	private List<String>     imageFileNames;
	private Integer          imageFileSizeMax;
	private Integer          imageFileSizeMin;
	private Integer          imageHeightMax;
	private Integer          imageHeightMin;
	private CoordinatesPoint imageLocation;
	private List<String>     imageNames;
	private Timestamp        imageTimeStampRangeEnd;
	private Timestamp        imageTimeStampRangeStart;
	private Integer          imageWidthMax;
	private Integer          imageWidthMin;
	private List<String>     mimeTypes;
	private List<String>     observationDbIds;
	private List<String>     observationUnitDbIds;

	public List<String> getDescriptiveOntologyTerms()
	{
		return descriptiveOntologyTerms;
	}

	public ImageSearch setDescriptiveOntologyTerms(List<String> descriptiveOntologyTerms)
	{
		this.descriptiveOntologyTerms = descriptiveOntologyTerms;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ImageSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ImageSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getImageDbIds()
	{
		return imageDbIds;
	}

	public ImageSearch setImageDbIds(List<String> imageDbIds)
	{
		this.imageDbIds = imageDbIds;
		return this;
	}

	public List<String> getImageFileNames()
	{
		return imageFileNames;
	}

	public ImageSearch setImageFileNames(List<String> imageFileNames)
	{
		this.imageFileNames = imageFileNames;
		return this;
	}

	public Integer getImageFileSizeMax()
	{
		return imageFileSizeMax;
	}

	public ImageSearch setImageFileSizeMax(Integer imageFileSizeMax)
	{
		this.imageFileSizeMax = imageFileSizeMax;
		return this;
	}

	public Integer getImageFileSizeMin()
	{
		return imageFileSizeMin;
	}

	public ImageSearch setImageFileSizeMin(Integer imageFileSizeMin)
	{
		this.imageFileSizeMin = imageFileSizeMin;
		return this;
	}

	public Integer getImageHeightMax()
	{
		return imageHeightMax;
	}

	public ImageSearch setImageHeightMax(Integer imageHeightMax)
	{
		this.imageHeightMax = imageHeightMax;
		return this;
	}

	public Integer getImageHeightMin()
	{
		return imageHeightMin;
	}

	public ImageSearch setImageHeightMin(Integer imageHeightMin)
	{
		this.imageHeightMin = imageHeightMin;
		return this;
	}

	public CoordinatesPoint getImageLocation()
	{
		return imageLocation;
	}

	public ImageSearch setImageLocation(CoordinatesPoint imageLocation)
	{
		this.imageLocation = imageLocation;
		return this;
	}

	public List<String> getImageNames()
	{
		return imageNames;
	}

	public ImageSearch setImageNames(List<String> imageNames)
	{
		this.imageNames = imageNames;
		return this;
	}

	public Timestamp getImageTimeStampRangeEnd()
	{
		return imageTimeStampRangeEnd;
	}

	public ImageSearch setImageTimeStampRangeEnd(Timestamp imageTimeStampRangeEnd)
	{
		this.imageTimeStampRangeEnd = imageTimeStampRangeEnd;
		return this;
	}

	public Timestamp getImageTimeStampRangeStart()
	{
		return imageTimeStampRangeStart;
	}

	public ImageSearch setImageTimeStampRangeStart(Timestamp imageTimeStampRangeStart)
	{
		this.imageTimeStampRangeStart = imageTimeStampRangeStart;
		return this;
	}

	public Integer getImageWidthMax()
	{
		return imageWidthMax;
	}

	public ImageSearch setImageWidthMax(Integer imageWidthMax)
	{
		this.imageWidthMax = imageWidthMax;
		return this;
	}

	public Integer getImageWidthMin()
	{
		return imageWidthMin;
	}

	public ImageSearch setImageWidthMin(Integer imageWidthMin)
	{
		this.imageWidthMin = imageWidthMin;
		return this;
	}

	public List<String> getMimeTypes()
	{
		return mimeTypes;
	}

	public ImageSearch setMimeTypes(List<String> mimeTypes)
	{
		this.mimeTypes = mimeTypes;
		return this;
	}

	public List<String> getObservationDbIds()
	{
		return observationDbIds;
	}

	public ImageSearch setObservationDbIds(List<String> observationDbIds)
	{
		this.observationDbIds = observationDbIds;
		return this;
	}

	public List<String> getObservationUnitDbIds()
	{
		return observationUnitDbIds;
	}

	public ImageSearch setObservationUnitDbIds(List<String> observationUnitDbIds)
	{
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}
}
