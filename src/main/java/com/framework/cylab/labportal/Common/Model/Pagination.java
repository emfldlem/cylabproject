package com.framework.cylab.labportal.Common.Model;

import lombok.Data;

@Data
public class Pagination {

    int page;
    int pageSize = 10;
    int totalCount;
    int totalPages;
    int end;
    int start;
    Object data;


    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        totalPages = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            totalPages++;
        }
        if (totalPages == 0) {
            totalPages = 1;
        }
        end = page * pageSize >= totalCount ? totalCount : page * pageSize;
        start = (page - 1) * pageSize + 1;
        if (start > end) {
            start = 0;
            end = 0;
        }
    }




}
