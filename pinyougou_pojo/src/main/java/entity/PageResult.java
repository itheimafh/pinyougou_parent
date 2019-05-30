package entity;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {
    private  long pages;
    private List<T> rows;

    public  PageResult(){

    }
    public PageResult(long pages, List<T> rows) {
        super();
        this.pages = pages;
        this.rows = rows;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
