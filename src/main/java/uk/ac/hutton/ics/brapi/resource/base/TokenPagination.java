package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TokenPagination
{
	private int    pageSize;
	private int    currentPage;
	private long   totalCount;
	private int    totalPages;
	private String currentPageToken;
	private String nextPageToken;
	private String prevPageToken;

	public TokenPagination(int pageSize, String currentPageToken, long totalCount, int desiredPageSize)
	{
		this.pageSize = pageSize;
		this.currentPageToken = currentPageToken;
		this.totalCount = totalCount;
		this.totalPages = (int) Math.ceil(totalCount / (float) desiredPageSize);

		// If we can, generate values for prevPageToken and nextPageToken
		int currentPage = Integer.parseInt(currentPageToken);
		if (currentPage >= 1)
			prevPageToken = String.valueOf(currentPage - 1);
		if (currentPage < totalPages - 1)
			nextPageToken = String.valueOf(currentPage + 1);
	}
}
