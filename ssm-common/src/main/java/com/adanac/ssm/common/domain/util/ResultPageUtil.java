package com.adanac.ssm.common.domain.util;

/**
 * @author Jimmy Shan
 * @date 2014-09-05
 * @desc 翻页工具类
 */
public class ResultPageUtil
{
    private Integer pageStart = 1;//起始位置从1开始

    private Integer totalCount = 0;//总的记录数初始值

    private Integer pageNo = 1;//当前页赋值,默认为1

    private Integer pageSize = 20;//每页显示记录数，默认20

    private Integer totalPage = 1;//设置总页数初始值

    /**
     * @desc 设置总页数
     */
    public void calTotalNumPages()
    {
        totalPage = totalCount / pageSize;
        if (totalPage < 1)
        {
            totalPage = 1;
        }
        else
        {
            if ((totalCount % pageSize) != 0)
            {
                totalPage = totalCount / pageSize + 1;
            }
            else
            {
                totalPage = totalCount / pageSize;
            }
        }
    }

    /**
     * @desc 初始pageStart值
     */
    public void initPageStart()
    {
        try
        {
            pageStart = pageNo;
            if (pageStart <= 0)
            {
                pageNo = 1;
                pageStart = 1;
            }
        }
        catch (Exception e)
        {
            pageNo = 1;
            pageStart = 1;
        }
    }

    /**
     * @desc 计算pageStart偏移量
     */
    public void calPageStart()
    {
        if (pageNo > 1)
        {
            pageStart = (pageNo - 1) * pageSize;
        }
        if (pageNo <= 1)
        {
            pageStart = 0;
        }
    }

    public ResultPageUtil()
    {
    }

    /**
     * @param pagesize 每页显示记录数
     * @param pageno 当前页数
     * @param cont 总记录数
     */
    public ResultPageUtil(Integer pagesize, Integer pageno, Integer cont)
    {
        this.pageSize = pagesize;
        this.pageNo = pageno;
        initPageStart();
        this.totalCount = cont;
        calTotalNumPages();
        calPageStart();
    }

    public ResultPageUtil(Integer pStart, Integer tCount, Integer pNo, Integer pSize, Integer tPage)
    {
        this.pageStart = pStart;
        this.totalCount = tCount;
        this.pageNo = pNo;
        this.pageSize = pSize;
        this.totalPage = tPage;
    }

    public Integer getPageStart()
    {
        return pageStart;
    }

    public void setPageStart(Integer pageStart)
    {
        this.pageStart = pageStart;
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount)
    {
        this.totalCount = totalCount;
    }

    public Integer getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(Integer pageNo)
    {
        this.pageNo = pageNo;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage()
    {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage)
    {
        this.totalPage = totalPage;
    }

}
