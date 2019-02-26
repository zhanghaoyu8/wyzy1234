package com.upc.model;

import java.util.List;

public class MedicineDataGrid {
  private int total;
  private List<Medicine> rows;

  public int getTotal() {
    return total;
  }

  public List<Medicine> getRows() {
    return rows;
  }

  public void setRows(List<Medicine> rows) {
    this.rows = rows;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}