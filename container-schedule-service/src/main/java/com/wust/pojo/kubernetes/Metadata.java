/**
  * Copyright 2018 bejson.com 
  */
package com.wust.pojo.kubernetes;
import java.util.List;

/**
 * Auto-generated: 2018-12-28 20:22:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Metadata {

    private String name;
    private String generateName;
    private String namespace;
    private String selfLink;
    private String uid;
    private String resourceVersion;
    private int generation;
    private String creationTimestamp;
    private String deletionTimestamp;
    private int deletionGracePeriodSeconds;
    private String labels;
    private String annotations;
    private List<OwnerReferences> ownerReferences;
    private Initializers initializers;
    private List<String> finalizers;
    private String clusterName;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setGenerateName(String generateName) {
         this.generateName = generateName;
     }
     public String getGenerateName() {
         return generateName;
     }

    public void setNamespace(String namespace) {
         this.namespace = namespace;
     }
     public String getNamespace() {
         return namespace;
     }

    public void setSelfLink(String selfLink) {
         this.selfLink = selfLink;
     }
     public String getSelfLink() {
         return selfLink;
     }

    public void setUid(String uid) {
         this.uid = uid;
     }
     public String getUid() {
         return uid;
     }

    public void setResourceVersion(String resourceVersion) {
         this.resourceVersion = resourceVersion;
     }
     public String getResourceVersion() {
         return resourceVersion;
     }

    public void setGeneration(int generation) {
         this.generation = generation;
     }
     public int getGeneration() {
         return generation;
     }

    public void setCreationTimestamp(String creationTimestamp) {
         this.creationTimestamp = creationTimestamp;
     }
     public String getCreationTimestamp() {
         return creationTimestamp;
     }

    public void setDeletionTimestamp(String deletionTimestamp) {
         this.deletionTimestamp = deletionTimestamp;
     }
     public String getDeletionTimestamp() {
         return deletionTimestamp;
     }

    public void setDeletionGracePeriodSeconds(int deletionGracePeriodSeconds) {
         this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
     }
     public int getDeletionGracePeriodSeconds() {
         return deletionGracePeriodSeconds;
     }

    public void setLabels(String labels) {
         this.labels = labels;
     }
     public String getLabels() {
         return labels;
     }

    public void setAnnotations(String annotations) {
         this.annotations = annotations;
     }
     public String getAnnotations() {
         return annotations;
     }

    public void setOwnerReferences(List<OwnerReferences> ownerReferences) {
         this.ownerReferences = ownerReferences;
     }
     public List<OwnerReferences> getOwnerReferences() {
         return ownerReferences;
     }

    public void setInitializers(Initializers initializers) {
         this.initializers = initializers;
     }
     public Initializers getInitializers() {
         return initializers;
     }

    public void setFinalizers(List<String> finalizers) {
         this.finalizers = finalizers;
     }
     public List<String> getFinalizers() {
         return finalizers;
     }

    public void setClusterName(String clusterName) {
         this.clusterName = clusterName;
     }
     public String getClusterName() {
         return clusterName;
     }

}