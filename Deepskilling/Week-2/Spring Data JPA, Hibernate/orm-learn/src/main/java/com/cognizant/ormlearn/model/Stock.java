package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private int id;

    @Column(name = "st_code", unique = true, nullable = false, length = 10)
    private String code;

    @Column(name = "st_name", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<StockPriceHistory> priceHistoryList;

    public Stock() {}

    public int getId() { return id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<StockPriceHistory> getPriceHistoryList() { return priceHistoryList; }
    public void setPriceHistoryList(List<StockPriceHistory> priceHistoryList) { this.priceHistoryList = priceHistoryList; }

    @Override
    public String toString() {
        return String.format("Stock[%s - %s, History Items: %d]", code, name, priceHistoryList.size());
    }
}
