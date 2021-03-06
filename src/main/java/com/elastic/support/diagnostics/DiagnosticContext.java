package com.elastic.support.diagnostics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class DiagnosticContext{

    InputParams inputParams;
    RestModule restModule;
    Map config;
    List<String> messages = new ArrayList<String>();
    String version="";
    String clusterName="";
    String outputDir="";
    String tempDir="";
    String manifest="";
    String nodeString="";
    String hostNode="";
    String pid;
    Set<String> hostIpList;

    private static final String verTwo = "2(\\.\\d+)+";

    public Set<String> getHostIpList() {
        return hostIpList;
    }

    public void setHostIpList(Set<String> hostIpList) {
        this.hostIpList = hostIpList;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getHostNode() {
        return hostNode;
    }

    public void setHostNode(String hostNode) {
        this.hostNode = hostNode;
    }

    public String getNodeString() {
        return nodeString;
    }

    public void setNodeString(String nodeString) {
        this.nodeString = nodeString;
    }

    public String getTempDir() {
        return tempDir;
    }

    public void setTempDir(String tempDir) {
        this.tempDir = tempDir;
    }

    public void addMessage(String msg){
        messages.add(msg);
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public InputParams getInputParams() {
        return inputParams;
    }

    public void setInputParams(InputParams inputParams) {
        this.inputParams = inputParams;
    }

    public RestModule getRestModule() {
        return restModule;
    }

    public void setRestModule(RestModule restModule) {
        this.restModule = restModule;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Map getConfig() {
        return config;
    }

    public void setConfig(Map config) {
        this.config = config;
    }

    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public boolean isVersionTwoOrGreater(){
        return Pattern.matches(verTwo, version);
    }
}
