/**
  * Copyright 2019 bejson.com 
  */
package com.wust.pojo.kubernetes;
import java.util.List;

/**
 * Auto-generated: 2019-02-20 21:8:53
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Containers {

    private String name;
    private String image;
    private List<String> command;
    private List<String> args;
    private String workingDir;
    private List<Ports> ports;
    private List<EnvFrom> envFrom;
    private List<Env> env;
    private Resources resources;
    private List<VolumeMounts> volumeMounts;
    private List<VolumeDevices> volumeDevices;
    private LivenessProbe livenessProbe;
    private ReadinessProbe readinessProbe;
    private Lifecycle lifecycle;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private String imagePullPolicy;
    private SecurityContext securityContext;
    private boolean stdin;
    private boolean stdinOnce;
    private boolean tty;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setCommand(List<String> command) {
         this.command = command;
     }
     public List<String> getCommand() {
         return command;
     }

    public void setArgs(List<String> args) {
         this.args = args;
     }
     public List<String> getArgs() {
         return args;
     }

    public void setWorkingDir(String workingDir) {
         this.workingDir = workingDir;
     }
     public String getWorkingDir() {
         return workingDir;
     }

    public void setPorts(List<Ports> ports) {
         this.ports = ports;
     }
     public List<Ports> getPorts() {
         return ports;
     }

    public void setEnvFrom(List<EnvFrom> envFrom) {
         this.envFrom = envFrom;
     }
     public List<EnvFrom> getEnvFrom() {
         return envFrom;
     }

    public void setEnv(List<Env> env) {
         this.env = env;
     }
     public List<Env> getEnv() {
         return env;
     }

    public void setResources(Resources resources) {
         this.resources = resources;
     }
     public Resources getResources() {
         return resources;
     }

    public void setVolumeMounts(List<VolumeMounts> volumeMounts) {
         this.volumeMounts = volumeMounts;
     }
     public List<VolumeMounts> getVolumeMounts() {
         return volumeMounts;
     }

    public void setVolumeDevices(List<VolumeDevices> volumeDevices) {
         this.volumeDevices = volumeDevices;
     }
     public List<VolumeDevices> getVolumeDevices() {
         return volumeDevices;
     }

    public void setLivenessProbe(LivenessProbe livenessProbe) {
         this.livenessProbe = livenessProbe;
     }
     public LivenessProbe getLivenessProbe() {
         return livenessProbe;
     }

    public void setReadinessProbe(ReadinessProbe readinessProbe) {
         this.readinessProbe = readinessProbe;
     }
     public ReadinessProbe getReadinessProbe() {
         return readinessProbe;
     }

    public void setLifecycle(Lifecycle lifecycle) {
         this.lifecycle = lifecycle;
     }
     public Lifecycle getLifecycle() {
         return lifecycle;
     }

    public void setTerminationMessagePath(String terminationMessagePath) {
         this.terminationMessagePath = terminationMessagePath;
     }
     public String getTerminationMessagePath() {
         return terminationMessagePath;
     }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
         this.terminationMessagePolicy = terminationMessagePolicy;
     }
     public String getTerminationMessagePolicy() {
         return terminationMessagePolicy;
     }

    public void setImagePullPolicy(String imagePullPolicy) {
         this.imagePullPolicy = imagePullPolicy;
     }
     public String getImagePullPolicy() {
         return imagePullPolicy;
     }

    public void setSecurityContext(SecurityContext securityContext) {
         this.securityContext = securityContext;
     }
     public SecurityContext getSecurityContext() {
         return securityContext;
     }

    public void setStdin(boolean stdin) {
         this.stdin = stdin;
     }
     public boolean getStdin() {
         return stdin;
     }

    public void setStdinOnce(boolean stdinOnce) {
         this.stdinOnce = stdinOnce;
     }
     public boolean getStdinOnce() {
         return stdinOnce;
     }

    public void setTty(boolean tty) {
         this.tty = tty;
     }
     public boolean getTty() {
         return tty;
     }

}