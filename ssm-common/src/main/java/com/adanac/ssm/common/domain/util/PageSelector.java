package com.adanac.ssm.common.domain.util;

import java.io.Serializable;

/**
 * @author aiheng@jd.com
 * @date 2014年9月15日 上午10:49:23
 * @desc 分页类
 */
public class PageSelector implements Serializable
{

    private static final long serialVersionUID = -6069730383231276663L;

    private int pageNo = 1; //当前页

    private int totalCount; //总记录数

    private int pageSize = 15; //每页条数

    private int pageCount = 1; //总页数

    private int nextPageNo; //下一页

    private int prevPageNo; //上一页

    private int start = 0; //limit开始行

    private int rows = pageSize; //limit行数

    public int getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
        // 在设置totalCount后，计算其他分页信息
        if (totalCount > 0)
        {
            pageCount = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
            nextPageNo = Math.min(pageNo + 1, pageCount);
            prevPageNo = Math.max(pageNo - 1, 1);
            start = (pageNo - 1) * pageSize;
            rows = pageSize;
        }
        else
        {
            pageCount = 1;
            nextPageNo = 1;
            prevPageNo = 1;
            start = 0;
            rows = pageSize;
        }
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }

    public int getNextPageNo()
    {
        return nextPageNo;
    }

    public void setNextPageNo(int nextPageNo)
    {
        this.nextPageNo = nextPageNo;
    }

    public int getPrevPageNo()
    {
        return prevPageNo;
    }

    public void setPrevPageNo(int prevPageNo)
    {
        this.prevPageNo = prevPageNo;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

}
