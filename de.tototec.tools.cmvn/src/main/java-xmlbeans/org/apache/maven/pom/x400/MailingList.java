/*
 * XML Type:  MailingList
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.MailingList
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML MailingList(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface MailingList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MailingList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("mailinglistb3c1type");
    
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
     * Gets the "subscribe" element
     */
    java.lang.String getSubscribe();
    
    /**
     * Gets (as xml) the "subscribe" element
     */
    org.apache.xmlbeans.XmlString xgetSubscribe();
    
    /**
     * True if has "subscribe" element
     */
    boolean isSetSubscribe();
    
    /**
     * Sets the "subscribe" element
     */
    void setSubscribe(java.lang.String subscribe);
    
    /**
     * Sets (as xml) the "subscribe" element
     */
    void xsetSubscribe(org.apache.xmlbeans.XmlString subscribe);
    
    /**
     * Unsets the "subscribe" element
     */
    void unsetSubscribe();
    
    /**
     * Gets the "unsubscribe" element
     */
    java.lang.String getUnsubscribe();
    
    /**
     * Gets (as xml) the "unsubscribe" element
     */
    org.apache.xmlbeans.XmlString xgetUnsubscribe();
    
    /**
     * True if has "unsubscribe" element
     */
    boolean isSetUnsubscribe();
    
    /**
     * Sets the "unsubscribe" element
     */
    void setUnsubscribe(java.lang.String unsubscribe);
    
    /**
     * Sets (as xml) the "unsubscribe" element
     */
    void xsetUnsubscribe(org.apache.xmlbeans.XmlString unsubscribe);
    
    /**
     * Unsets the "unsubscribe" element
     */
    void unsetUnsubscribe();
    
    /**
     * Gets the "post" element
     */
    java.lang.String getPost();
    
    /**
     * Gets (as xml) the "post" element
     */
    org.apache.xmlbeans.XmlString xgetPost();
    
    /**
     * True if has "post" element
     */
    boolean isSetPost();
    
    /**
     * Sets the "post" element
     */
    void setPost(java.lang.String post);
    
    /**
     * Sets (as xml) the "post" element
     */
    void xsetPost(org.apache.xmlbeans.XmlString post);
    
    /**
     * Unsets the "post" element
     */
    void unsetPost();
    
    /**
     * Gets the "archive" element
     */
    java.lang.String getArchive();
    
    /**
     * Gets (as xml) the "archive" element
     */
    org.apache.xmlbeans.XmlString xgetArchive();
    
    /**
     * True if has "archive" element
     */
    boolean isSetArchive();
    
    /**
     * Sets the "archive" element
     */
    void setArchive(java.lang.String archive);
    
    /**
     * Sets (as xml) the "archive" element
     */
    void xsetArchive(org.apache.xmlbeans.XmlString archive);
    
    /**
     * Unsets the "archive" element
     */
    void unsetArchive();
    
    /**
     * Gets the "otherArchives" element
     */
    org.apache.maven.pom.x400.MailingList.OtherArchives getOtherArchives();
    
    /**
     * True if has "otherArchives" element
     */
    boolean isSetOtherArchives();
    
    /**
     * Sets the "otherArchives" element
     */
    void setOtherArchives(org.apache.maven.pom.x400.MailingList.OtherArchives otherArchives);
    
    /**
     * Appends and returns a new empty "otherArchives" element
     */
    org.apache.maven.pom.x400.MailingList.OtherArchives addNewOtherArchives();
    
    /**
     * Unsets the "otherArchives" element
     */
    void unsetOtherArchives();
    
    /**
     * An XML otherArchives(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface OtherArchives extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OtherArchives.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("otherarchives3f4eelemtype");
        
        /**
         * Gets array of all "otherArchive" elements
         */
        java.lang.String[] getOtherArchiveArray();
        
        /**
         * Gets ith "otherArchive" element
         */
        java.lang.String getOtherArchiveArray(int i);
        
        /**
         * Gets (as xml) array of all "otherArchive" elements
         */
        org.apache.xmlbeans.XmlString[] xgetOtherArchiveArray();
        
        /**
         * Gets (as xml) ith "otherArchive" element
         */
        org.apache.xmlbeans.XmlString xgetOtherArchiveArray(int i);
        
        /**
         * Returns number of "otherArchive" element
         */
        int sizeOfOtherArchiveArray();
        
        /**
         * Sets array of all "otherArchive" element
         */
        void setOtherArchiveArray(java.lang.String[] otherArchiveArray);
        
        /**
         * Sets ith "otherArchive" element
         */
        void setOtherArchiveArray(int i, java.lang.String otherArchive);
        
        /**
         * Sets (as xml) array of all "otherArchive" element
         */
        void xsetOtherArchiveArray(org.apache.xmlbeans.XmlString[] otherArchiveArray);
        
        /**
         * Sets (as xml) ith "otherArchive" element
         */
        void xsetOtherArchiveArray(int i, org.apache.xmlbeans.XmlString otherArchive);
        
        /**
         * Inserts the value as the ith "otherArchive" element
         */
        void insertOtherArchive(int i, java.lang.String otherArchive);
        
        /**
         * Appends the value as the last "otherArchive" element
         */
        void addOtherArchive(java.lang.String otherArchive);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherArchive" element
         */
        org.apache.xmlbeans.XmlString insertNewOtherArchive(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherArchive" element
         */
        org.apache.xmlbeans.XmlString addNewOtherArchive();
        
        /**
         * Removes the ith "otherArchive" element
         */
        void removeOtherArchive(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.MailingList.OtherArchives newInstance() {
              return (org.apache.maven.pom.x400.MailingList.OtherArchives) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.MailingList.OtherArchives newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.MailingList.OtherArchives) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.MailingList newInstance() {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.MailingList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.MailingList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.MailingList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.MailingList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.MailingList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.MailingList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
