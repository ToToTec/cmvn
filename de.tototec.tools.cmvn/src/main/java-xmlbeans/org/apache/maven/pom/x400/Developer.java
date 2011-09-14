/*
 * XML Type:  Developer
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Developer
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Developer(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Developer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Developer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("developer9b02type");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "email" element
     */
    java.lang.String getEmail();
    
    /**
     * Gets (as xml) the "email" element
     */
    org.apache.xmlbeans.XmlString xgetEmail();
    
    /**
     * True if has "email" element
     */
    boolean isSetEmail();
    
    /**
     * Sets the "email" element
     */
    void setEmail(java.lang.String email);
    
    /**
     * Sets (as xml) the "email" element
     */
    void xsetEmail(org.apache.xmlbeans.XmlString email);
    
    /**
     * Unsets the "email" element
     */
    void unsetEmail();
    
    /**
     * Gets the "url" element
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "url" element
     */
    org.apache.xmlbeans.XmlString xgetUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "url" element
     */
    void xsetUrl(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
    /**
     * Gets the "organization" element
     */
    java.lang.String getOrganization();
    
    /**
     * Gets (as xml) the "organization" element
     */
    org.apache.xmlbeans.XmlString xgetOrganization();
    
    /**
     * True if has "organization" element
     */
    boolean isSetOrganization();
    
    /**
     * Sets the "organization" element
     */
    void setOrganization(java.lang.String organization);
    
    /**
     * Sets (as xml) the "organization" element
     */
    void xsetOrganization(org.apache.xmlbeans.XmlString organization);
    
    /**
     * Unsets the "organization" element
     */
    void unsetOrganization();
    
    /**
     * Gets the "organizationUrl" element
     */
    java.lang.String getOrganizationUrl();
    
    /**
     * Gets (as xml) the "organizationUrl" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationUrl();
    
    /**
     * True if has "organizationUrl" element
     */
    boolean isSetOrganizationUrl();
    
    /**
     * Sets the "organizationUrl" element
     */
    void setOrganizationUrl(java.lang.String organizationUrl);
    
    /**
     * Sets (as xml) the "organizationUrl" element
     */
    void xsetOrganizationUrl(org.apache.xmlbeans.XmlString organizationUrl);
    
    /**
     * Unsets the "organizationUrl" element
     */
    void unsetOrganizationUrl();
    
    /**
     * Gets the "roles" element
     */
    org.apache.maven.pom.x400.Developer.Roles getRoles();
    
    /**
     * True if has "roles" element
     */
    boolean isSetRoles();
    
    /**
     * Sets the "roles" element
     */
    void setRoles(org.apache.maven.pom.x400.Developer.Roles roles);
    
    /**
     * Appends and returns a new empty "roles" element
     */
    org.apache.maven.pom.x400.Developer.Roles addNewRoles();
    
    /**
     * Unsets the "roles" element
     */
    void unsetRoles();
    
    /**
     * Gets the "timezone" element
     */
    java.lang.String getTimezone();
    
    /**
     * Gets (as xml) the "timezone" element
     */
    org.apache.xmlbeans.XmlString xgetTimezone();
    
    /**
     * True if has "timezone" element
     */
    boolean isSetTimezone();
    
    /**
     * Sets the "timezone" element
     */
    void setTimezone(java.lang.String timezone);
    
    /**
     * Sets (as xml) the "timezone" element
     */
    void xsetTimezone(org.apache.xmlbeans.XmlString timezone);
    
    /**
     * Unsets the "timezone" element
     */
    void unsetTimezone();
    
    /**
     * Gets the "properties" element
     */
    org.apache.maven.pom.x400.Developer.Properties getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(org.apache.maven.pom.x400.Developer.Properties properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    org.apache.maven.pom.x400.Developer.Properties addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * An XML roles(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Roles extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Roles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("roles206belemtype");
        
        /**
         * Gets array of all "role" elements
         */
        java.lang.String[] getRoleArray();
        
        /**
         * Gets ith "role" element
         */
        java.lang.String getRoleArray(int i);
        
        /**
         * Gets (as xml) array of all "role" elements
         */
        org.apache.xmlbeans.XmlString[] xgetRoleArray();
        
        /**
         * Gets (as xml) ith "role" element
         */
        org.apache.xmlbeans.XmlString xgetRoleArray(int i);
        
        /**
         * Returns number of "role" element
         */
        int sizeOfRoleArray();
        
        /**
         * Sets array of all "role" element
         */
        void setRoleArray(java.lang.String[] roleArray);
        
        /**
         * Sets ith "role" element
         */
        void setRoleArray(int i, java.lang.String role);
        
        /**
         * Sets (as xml) array of all "role" element
         */
        void xsetRoleArray(org.apache.xmlbeans.XmlString[] roleArray);
        
        /**
         * Sets (as xml) ith "role" element
         */
        void xsetRoleArray(int i, org.apache.xmlbeans.XmlString role);
        
        /**
         * Inserts the value as the ith "role" element
         */
        void insertRole(int i, java.lang.String role);
        
        /**
         * Appends the value as the last "role" element
         */
        void addRole(java.lang.String role);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "role" element
         */
        org.apache.xmlbeans.XmlString insertNewRole(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "role" element
         */
        org.apache.xmlbeans.XmlString addNewRole();
        
        /**
         * Removes the ith "role" element
         */
        void removeRole(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Developer.Roles newInstance() {
              return (org.apache.maven.pom.x400.Developer.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Developer.Roles newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Developer.Roles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML properties(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Properties extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Properties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("properties0091elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Developer.Properties newInstance() {
              return (org.apache.maven.pom.x400.Developer.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Developer.Properties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Developer.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Developer newInstance() {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Developer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Developer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Developer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Developer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Developer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Developer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Developer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Developer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Developer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
