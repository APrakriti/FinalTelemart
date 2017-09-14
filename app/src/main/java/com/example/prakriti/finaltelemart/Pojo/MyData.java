package com.example.prakriti.finaltelemart.Pojo;

import java.io.Serializable;

/**
 * Created by Prakriti on 9/1/2017.
 */

public class MyData implements Serializable {
    Integer id, count, menu_order, parent, image_id;
   String name, slug, description, display, _, date_created, date_created_gmt, date_modified, date_modified_gmt, src, title, alt, self_href, collection_href;

    public MyData(Integer id, Integer count, Integer menu_order, Integer parent, Integer image_id, String name, String slug, String description, String display , String date_created, String date_created_gmt, String date_modified, String date_modified_gmt, String src, String title, String alt, String self_href, String collection_href) {
        this.id = id;
        this.count = count;
        this.menu_order = menu_order;
        this.parent = parent;
        this.image_id = image_id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.display = display;

        this.date_created = date_created;
        this.date_created_gmt = date_created_gmt;
        this.date_modified = date_modified;
        this.date_modified_gmt = date_modified_gmt;
        this.src = src;
        this.title = title;
        this.alt = alt;
        this.self_href = self_href;
        this.collection_href = collection_href;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(Integer menu_order) {
        this.menu_order = menu_order;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }



    public String getDate_created() {
        return date_created;
    }

    public void setData_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_created_gmt() {
        return date_created_gmt;
    }

    public void setDate_created_gmt(String date_created_gmt) {
        this.date_created_gmt = date_created_gmt;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public String getDate_modified_gmt() {
        return date_modified_gmt;
    }

    public void setDate_modified_gmt(String date_modified_gmt) {
        this.date_modified_gmt = date_modified_gmt;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getSelf_href() {
        return self_href;
    }

    public void setSelf_href(String self_href) {
        this.self_href = self_href;
    }

    public String getCollection_href() {
        return collection_href;
    }

    public void setCollection_href(String collection_href) {
        this.collection_href = collection_href;
    }
}

