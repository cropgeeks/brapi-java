package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Pagination
{
	private int  pageSize;
	private int  page;
	private long totalCount;
	private int  totalPages;

	public Pagination(int pageSize, int page, long totalCount, int desiredPageSize)
	{
		this.pageSize = pageSize;
		this.page = page;
		this.totalCount = totalCount;
		this.totalPages = (int) Math.ceil(totalCount / (float) desiredPageSize);
	}
}
