/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Volumes {

    private String name;
    private HostPath hostPath;
    private EmptyDir emptyDir;
    private GcePersistentDisk gcePersistentDisk;
    private AwsElasticBlockStore awsElasticBlockStore;
    private GitRepo gitRepo;
    private Secret secret;
    private Nfs nfs;
    private Iscsi iscsi;
    private Glusterfs glusterfs;
    private PersistentVolumeClaim persistentVolumeClaim;
    private Rbd rbd;
    private FlexVolume flexVolume;
    private Cinder cinder;
    private Cephfs cephfs;
    private Flocker flocker;
    private DownwardAPI downwardAPI;
    private Fc fc;
    private AzureFile azureFile;
    private ConfigMap configMap;
    private VsphereVolume vsphereVolume;
    private Quobyte quobyte;
    private AzureDisk azureDisk;
    private PhotonPersistentDisk photonPersistentDisk;
    private Projected projected;
    private PortworxVolume portworxVolume;
    private ScaleIO scaleIO;
    private Storageos storageos;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setHostPath(HostPath hostPath) {
         this.hostPath = hostPath;
     }
     public HostPath getHostPath() {
         return hostPath;
     }

    public void setEmptyDir(EmptyDir emptyDir) {
         this.emptyDir = emptyDir;
     }
     public EmptyDir getEmptyDir() {
         return emptyDir;
     }

    public void setGcePersistentDisk(GcePersistentDisk gcePersistentDisk) {
         this.gcePersistentDisk = gcePersistentDisk;
     }
     public GcePersistentDisk getGcePersistentDisk() {
         return gcePersistentDisk;
     }

    public void setAwsElasticBlockStore(AwsElasticBlockStore awsElasticBlockStore) {
         this.awsElasticBlockStore = awsElasticBlockStore;
     }
     public AwsElasticBlockStore getAwsElasticBlockStore() {
         return awsElasticBlockStore;
     }

    public void setGitRepo(GitRepo gitRepo) {
         this.gitRepo = gitRepo;
     }
     public GitRepo getGitRepo() {
         return gitRepo;
     }

    public void setSecret(Secret secret) {
         this.secret = secret;
     }
     public Secret getSecret() {
         return secret;
     }

    public void setNfs(Nfs nfs) {
         this.nfs = nfs;
     }
     public Nfs getNfs() {
         return nfs;
     }

    public void setIscsi(Iscsi iscsi) {
         this.iscsi = iscsi;
     }
     public Iscsi getIscsi() {
         return iscsi;
     }

    public void setGlusterfs(Glusterfs glusterfs) {
         this.glusterfs = glusterfs;
     }
     public Glusterfs getGlusterfs() {
         return glusterfs;
     }

    public void setPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
         this.persistentVolumeClaim = persistentVolumeClaim;
     }
     public PersistentVolumeClaim getPersistentVolumeClaim() {
         return persistentVolumeClaim;
     }

    public void setRbd(Rbd rbd) {
         this.rbd = rbd;
     }
     public Rbd getRbd() {
         return rbd;
     }

    public void setFlexVolume(FlexVolume flexVolume) {
         this.flexVolume = flexVolume;
     }
     public FlexVolume getFlexVolume() {
         return flexVolume;
     }

    public void setCinder(Cinder cinder) {
         this.cinder = cinder;
     }
     public Cinder getCinder() {
         return cinder;
     }

    public void setCephfs(Cephfs cephfs) {
         this.cephfs = cephfs;
     }
     public Cephfs getCephfs() {
         return cephfs;
     }

    public void setFlocker(Flocker flocker) {
         this.flocker = flocker;
     }
     public Flocker getFlocker() {
         return flocker;
     }

    public void setDownwardAPI(DownwardAPI downwardAPI) {
         this.downwardAPI = downwardAPI;
     }
     public DownwardAPI getDownwardAPI() {
         return downwardAPI;
     }

    public void setFc(Fc fc) {
         this.fc = fc;
     }
     public Fc getFc() {
         return fc;
     }

    public void setAzureFile(AzureFile azureFile) {
         this.azureFile = azureFile;
     }
     public AzureFile getAzureFile() {
         return azureFile;
     }

    public void setConfigMap(ConfigMap configMap) {
         this.configMap = configMap;
     }
     public ConfigMap getConfigMap() {
         return configMap;
     }

    public void setVsphereVolume(VsphereVolume vsphereVolume) {
         this.vsphereVolume = vsphereVolume;
     }
     public VsphereVolume getVsphereVolume() {
         return vsphereVolume;
     }

    public void setQuobyte(Quobyte quobyte) {
         this.quobyte = quobyte;
     }
     public Quobyte getQuobyte() {
         return quobyte;
     }

    public void setAzureDisk(AzureDisk azureDisk) {
         this.azureDisk = azureDisk;
     }
     public AzureDisk getAzureDisk() {
         return azureDisk;
     }

    public void setPhotonPersistentDisk(PhotonPersistentDisk photonPersistentDisk) {
         this.photonPersistentDisk = photonPersistentDisk;
     }
     public PhotonPersistentDisk getPhotonPersistentDisk() {
         return photonPersistentDisk;
     }

    public void setProjected(Projected projected) {
         this.projected = projected;
     }
     public Projected getProjected() {
         return projected;
     }

    public void setPortworxVolume(PortworxVolume portworxVolume) {
         this.portworxVolume = portworxVolume;
     }
     public PortworxVolume getPortworxVolume() {
         return portworxVolume;
     }

    public void setScaleIO(ScaleIO scaleIO) {
         this.scaleIO = scaleIO;
     }
     public ScaleIO getScaleIO() {
         return scaleIO;
     }

    public void setStorageos(Storageos storageos) {
         this.storageos = storageos;
     }
     public Storageos getStorageos() {
         return storageos;
     }

}