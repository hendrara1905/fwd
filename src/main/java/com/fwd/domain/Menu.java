package com.fwd.domain;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    public static final String CAROUSEL_TYPE = "CAROUSEL";
    public static final String STATIC_RIGHT_TYPE = "STATIC-RIGHT";
    public static final String FIRST_MENU_TYPE = "FIRST-MENU";
    public static final String SECONDARY_MENU_TYPE = "SECONDARY-MENU";
    
    @Column(name = "button_text", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 100, scale = 0, precision = 0)
    @Basic
    private String buttonText;

    @Column(name = "image_path", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 65535, scale = 0, precision = 0)
    @Lob
    @Basic
    private String imagePath;
    
    @Transient
    private boolean imagePathChanged = false;

    @Column(name = "description", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 65535, scale = 0, precision = 0)
    @Lob
    @Basic
    private String description;

    @Column(name = "active", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Basic
    private boolean active;

    @Column(name = "id_menu", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMenu;

    @Column(name = "start_time", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date startTime;

    @Column(name = "short_description", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 65535, scale = 0, precision = 0)
    @Lob
    @Basic
    private String shortDescription;

    @Column(name = "end_time", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date endTime;

    @Column(name = "type", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 12, scale = 0, precision = 0)
    @Basic
    private String type;

    @Column(name = "title", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 100, scale = 0, precision = 0)
    @Basic
    private String title;

    @Column(name = "url", table = "menu", unique = false, updatable = true, insertable = true, nullable = true, length = 65535, scale = 0, precision = 0)
    @Lob
    @Basic
    private String url;

    @Column(name = "orders", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Basic
    private int orders;

    @Column(name = "data_href", table = "menu", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Basic
    private boolean dataHref;
    
    public Menu() {

    }

    public String getButtonText() {
        return this.buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrders() {
        return this.orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
    
    public boolean isDataHref() {
        return this.dataHref;
    }

    public void setDataHref(boolean dataHref) {
        this.dataHref = dataHref;
    }

    public boolean isImagePathChanged() {
        return imagePathChanged;
    }

    public void setImagePathChanged(boolean imagePathChanged) {
        this.imagePathChanged = imagePathChanged;
    }
    
}
