package com.wust.util;

public class K8sUrlInfo {
    //k8s常用Api的url
    //创建
    private static final String CREATE_POD_URL = "/api/v1/namespaces/{namespace}/pods";
    private static final String CREATE_DEPLOYMENT_URL = "/apis/apps/v1/namespaces/{namespace}/deployments";
    private static final String CREATE_DAEMONSET_URL = "/apis/apps/v1/namespaces/{namespace}/daemonsets";
    private static final String CREATE_STATEFULSET_URL = "/apis/apps/v1/namespaces/{namespace}/statefulsets";
    private static final String CREATE_CONFIGMAP_URL = "/api/v1/namespaces/{namespace}/configmaps";
    private static final String CREATE_PVC_URL = "/api/v1/namespaces/{namespace}/persistentvolumeclaims";
    private static final String CREATE_SECRET_URL = "/api/v1/namespaces/{namespace}/secrets";
    private static final String CREATE_SERVICE_URL = "/api/v1/namespaces/{namespace}/services";
    private static final String CREATE_INGRESS_URL = "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses";

    //删除和更新
    private static final String UPDATE_POD_URL = "/api/v1/namespaces/{namespace}/pods/{name}";
    private static final String UPDATE_DEPLOYMENT_URL = "/apis/apps/v1/namespaces/{namespace}/deployments/{name}";
    private static final String UPDATE_DAEMONSET_URL = "/apis/apps/v1/namespaces/{namespace}/daemonsets/{name}";
    private static final String UPDATE_STATEFULSET_URL = "/apis/apps/v1/namespaces/{namespace}/statefulsets/{name}";
    private static final String UPDATE_CONFIGMAP_URL = "/api/v1/namespaces/{namespace}/configmaps/{name}";
    private static final String UPDATE_PVC_URL = "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}";
    private static final String UPDATE_SECRET_URL = "/api/v1/namespaces/{namespace}/secrets/{name}";
    private static final String UPDATE_SERVICE_URL = "/api/v1/namespaces/{namespace}/services/{name}";
    private static final String UPDATE_INGRESS_URL = "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}";

    public static String getCreateUrl(String kind){
        return getString(kind, CREATE_POD_URL, CREATE_DEPLOYMENT_URL, CREATE_DAEMONSET_URL, CREATE_STATEFULSET_URL, CREATE_CONFIGMAP_URL, CREATE_PVC_URL, CREATE_SERVICE_URL, CREATE_SECRET_URL, CREATE_INGRESS_URL);
    }

    public static String getUpdateUrl(String kind){
        return getString(kind, UPDATE_POD_URL, UPDATE_DEPLOYMENT_URL, UPDATE_DAEMONSET_URL, UPDATE_STATEFULSET_URL, UPDATE_CONFIGMAP_URL, UPDATE_PVC_URL, UPDATE_SERVICE_URL, UPDATE_SECRET_URL, UPDATE_INGRESS_URL);
    }

    private static String getString(String kind, String pod, String deployment, String daemonSet, String statefulSet, String configMap, String pvc, String service, String secret, String ingress) {
        switch (kind){
            case "Pod":
                return pod;
            case "Deployment":
                return deployment;
            case "DaemonSet":
                return daemonSet;
            case "StatefulSet":
                return statefulSet;
            case "ConfigMap":
                return configMap;
            case "PersistentVolumeClaim":
                return pvc;
            case "Service":
                return service;
            case "Secret":
                return secret;
            case "Ingress":
                return ingress;
            default:
                return kind + "类型不支持！";
        }
    }
}
