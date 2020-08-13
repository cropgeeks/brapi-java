package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.core.location.CoordinatesPoint;

public class ObservationUnitPosition
{
	private String                 entryType;
	private CoordinatesPoint       geoCoordinates;
	private ObservationLevel       observationLevel;
	private List<ObservationLevel> observationLevelRelationships;
	private String                 positionCoordinateX;
	private String                 positionCoordinateXType;
	private String                 positionCoordinateY;
	private String                 positionCoordinateYType;

	public String getEntryType()
	{
		return entryType;
	}

	public ObservationUnitPosition setEntryType(String entryType)
	{
		this.entryType = entryType;
		return this;
	}

	public CoordinatesPoint getGeoCoordinates()
	{
		return geoCoordinates;
	}

	public ObservationUnitPosition setGeoCoordinates(CoordinatesPoint geoCoordinates)
	{
		this.geoCoordinates = geoCoordinates;
		return this;
	}

	public ObservationLevel getObservationLevel()
	{
		return observationLevel;
	}

	public ObservationUnitPosition setObservationLevel(ObservationLevel observationLevel)
	{
		this.observationLevel = observationLevel;
		return this;
	}

	public List<ObservationLevel> getObservationLevelRelationships()
	{
		return observationLevelRelationships;
	}

	public ObservationUnitPosition setObservationLevelRelationships(List<ObservationLevel> observationLevelRelationships)
	{
		this.observationLevelRelationships = observationLevelRelationships;
		return this;
	}

	public String getPositionCoordinateX()
	{
		return positionCoordinateX;
	}

	public ObservationUnitPosition setPositionCoordinateX(String positionCoordinateX)
	{
		this.positionCoordinateX = positionCoordinateX;
		return this;
	}

	public String getPositionCoordinateXType()
	{
		return positionCoordinateXType;
	}

	public ObservationUnitPosition setPositionCoordinateXType(String positionCoordinateXType)
	{
		this.positionCoordinateXType = positionCoordinateXType;
		return this;
	}

	public String getPositionCoordinateY()
	{
		return positionCoordinateY;
	}

	public ObservationUnitPosition setPositionCoordinateY(String positionCoordinateY)
	{
		this.positionCoordinateY = positionCoordinateY;
		return this;
	}

	public String getPositionCoordinateYType()
	{
		return positionCoordinateYType;
	}

	public ObservationUnitPosition setPositionCoordinateYType(String positionCoordinateYType)
	{
		this.positionCoordinateYType = positionCoordinateYType;
		return this;
	}
}
