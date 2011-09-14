/*
 * XML Type:  DistributionManagement
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.DistributionManagement
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML DistributionManagement(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface DistributionManagement extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DistributionManagement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("distributionmanagement8391type");
    
    /**
     * Gets the "repository" element
     */
    org.apache.maven.pom.x400.DeploymentRepository getRepository();
    
    /**
     * True if has "repository" element
     */
    boolean isSetRepository();
    
    /**
     * Sets the "repository" element
     */
    void setRepository(org.apache.maven.pom.x400.DeploymentRepository repository);
    
    /**
     * Appends and returns a new empty "repository" element
     */
    org.apache.maven.pom.x400.DeploymentRepository addNewRepository();
    
    /**
     * Unsets the "repository" element
     */
    void unsetRepository();
    
    /**
     * Gets the "snapshotRepository" element
     */
    org.apache.maven.pom.x400.DeploymentRepository getSnapshotRepository();
    
    /**
     * True if has "snapshotRepository" element
     */
    boolean isSetSnapshotRepository();
    
    /**
     * Sets the "snapshotRepository" element
     */
    void setSnapshotRepository(org.apache.maven.pom.x400.DeploymentRepository snapshotRepository);
    
    /**
     * Appends and returns a new empty "snapshotRepository" element
     */
    org.apache.maven.pom.x400.DeploymentRepository addNewSnapshotRepository();
    
    /**
     * Unsets the "snapshotRepository" element
     */
    void unsetSnapshotRepository();
    
    /**
     * Gets the "site" element
     */
    org.apache.maven.pom.x400.Site getSite();
    
    /**
     * True if has "site" element
     */
    boolean isSetSite();
    
    /**
     * Sets the "site" element
     */
    void setSite(org.apache.maven.pom.x400.Site site);
    
    /**
     * Appends and returns a new empty "site" element
     */
    org.apache.maven.pom.x400.Site addNewSite();
    
    /**
     * Unsets the "site" element
     */
    void unsetSite();
    
    /**
     * Gets the "downloadUrl" element
     */
    java.lang.String getDownloadUrl();
    
    /**
     * Gets (as xml) the "downloadUrl" element
     */
    org.apache.xmlbeans.XmlString xgetDownloadUrl();
    
    /**
     * True if has "downloadUrl" element
     */
    boolean isSetDownloadUrl();
    
    /**
     * Sets the "downloadUrl" element
     */
    void setDownloadUrl(java.lang.String downloadUrl);
    
    /**
     * Sets (as xml) the "downloadUrl" element
     */
    void xsetDownloadUrl(org.apache.xmlbeans.XmlString downloadUrl);
    
    /**
     * Unsets the "downloadUrl" element
     */
    void unsetDownloadUrl();
    
    /**
     * Gets the "relocation" element
     */
    org.apache.maven.pom.x400.Relocation getRelocation();
    
    /**
     * True if has "relocation" element
     */
    boolean isSetRelocation();
    
    /**
     * Sets the "relocation" element
     */
    void setRelocation(org.apache.maven.pom.x400.Relocation relocation);
    
    /**
     * Appends and returns a new empty "relocation" element
     */
    org.apache.maven.pom.x400.Relocation addNewRelocation();
    
    /**
     * Unsets the "relocation" element
     */
    void unsetRelocation();
    
    /**
     * Gets the "status" element
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.xmlbeans.XmlString xgetStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.xmlbeans.XmlString status);
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.DistributionManagement newInstance() {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.DistributionManagement parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.DistributionManagement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.DistributionManagement parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.DistributionManagement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
