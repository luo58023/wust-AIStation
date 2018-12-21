/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.image;
import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Auto-generated: 2018-12-19 23:2:0
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Library implements Serializable {

    private int id;
    private String name;
    private int project_id;
    private String description;
    private int pull_count;
    private int star_count;
    private int tags_count;
    private List<Labels> labels;
    private String creation_time;
    private String update_time;

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setProject_id(int project_id) {
         this.project_id = project_id;
     }
     public int getProject_id() {
         return project_id;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setPull_count(int pull_count) {
         this.pull_count = pull_count;
     }
     public int getPull_count() {
         return pull_count;
     }

    public void setStar_count(int star_count) {
         this.star_count = star_count;
     }
     public int getStar_count() {
         return star_count;
     }

    public void setTags_count(int tags_count) {
         this.tags_count = tags_count;
     }
     public int getTags_count() {
         return tags_count;
     }

    public void setLabels(List<Labels> labels) {
         this.labels = labels;
     }
     public List<Labels> getLabels() {
         return labels;
     }

    public void setCreation_time(String creation_time) {
         this.creation_time = creation_time;
     }
     public String getCreation_time() {
         return creation_time;
     }

    public void setUpdate_time(String update_time) {
         this.update_time = update_time;
     }
     public String getUpdate_time() {
         return update_time;
     }

     @Override
     public String toString(){
        return JSON.toJSONString(this);
     }
}