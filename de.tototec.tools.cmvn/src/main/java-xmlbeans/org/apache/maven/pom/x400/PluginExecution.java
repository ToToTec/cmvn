/*
 * XML Type:  PluginExecution
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.PluginExecution
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML PluginExecution(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface PluginExecution extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PluginExecution.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("pluginexecutionc45dtype");
    
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
     * Gets the "phase" element
     */
    java.lang.String getPhase();
    
    /**
     * Gets (as xml) the "phase" element
     */
    org.apache.xmlbeans.XmlString xgetPhase();
    
    /**
     * True if has "phase" element
     */
    boolean isSetPhase();
    
    /**
     * Sets the "phase" element
     */
    void setPhase(java.lang.String phase);
    
    /**
     * Sets (as xml) the "phase" element
     */
    void xsetPhase(org.apache.xmlbeans.XmlString phase);
    
    /**
     * Unsets the "phase" element
     */
    void unsetPhase();
    
    /**
     * Gets the "goals" element
     */
    org.apache.maven.pom.x400.PluginExecution.Goals getGoals();
    
    /**
     * True if has "goals" element
     */
    boolean isSetGoals();
    
    /**
     * Sets the "goals" element
     */
    void setGoals(org.apache.maven.pom.x400.PluginExecution.Goals goals);
    
    /**
     * Appends and returns a new empty "goals" element
     */
    org.apache.maven.pom.x400.PluginExecution.Goals addNewGoals();
    
    /**
     * Unsets the "goals" element
     */
    void unsetGoals();
    
    /**
     * Gets the "inherited" element
     */
    java.lang.String getInherited();
    
    /**
     * Gets (as xml) the "inherited" element
     */
    org.apache.xmlbeans.XmlString xgetInherited();
    
    /**
     * True if has "inherited" element
     */
    boolean isSetInherited();
    
    /**
     * Sets the "inherited" element
     */
    void setInherited(java.lang.String inherited);
    
    /**
     * Sets (as xml) the "inherited" element
     */
    void xsetInherited(org.apache.xmlbeans.XmlString inherited);
    
    /**
     * Unsets the "inherited" element
     */
    void unsetInherited();
    
    /**
     * Gets the "configuration" element
     */
    org.apache.maven.pom.x400.PluginExecution.Configuration getConfiguration();
    
    /**
     * True if has "configuration" element
     */
    boolean isSetConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(org.apache.maven.pom.x400.PluginExecution.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    org.apache.maven.pom.x400.PluginExecution.Configuration addNewConfiguration();
    
    /**
     * Unsets the "configuration" element
     */
    void unsetConfiguration();
    
    /**
     * An XML goals(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Goals extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Goals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("goals4089elemtype");
        
        /**
         * Gets array of all "goal" elements
         */
        java.lang.String[] getGoalArray();
        
        /**
         * Gets ith "goal" element
         */
        java.lang.String getGoalArray(int i);
        
        /**
         * Gets (as xml) array of all "goal" elements
         */
        org.apache.xmlbeans.XmlString[] xgetGoalArray();
        
        /**
         * Gets (as xml) ith "goal" element
         */
        org.apache.xmlbeans.XmlString xgetGoalArray(int i);
        
        /**
         * Returns number of "goal" element
         */
        int sizeOfGoalArray();
        
        /**
         * Sets array of all "goal" element
         */
        void setGoalArray(java.lang.String[] goalArray);
        
        /**
         * Sets ith "goal" element
         */
        void setGoalArray(int i, java.lang.String goal);
        
        /**
         * Sets (as xml) array of all "goal" element
         */
        void xsetGoalArray(org.apache.xmlbeans.XmlString[] goalArray);
        
        /**
         * Sets (as xml) ith "goal" element
         */
        void xsetGoalArray(int i, org.apache.xmlbeans.XmlString goal);
        
        /**
         * Inserts the value as the ith "goal" element
         */
        void insertGoal(int i, java.lang.String goal);
        
        /**
         * Appends the value as the last "goal" element
         */
        void addGoal(java.lang.String goal);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "goal" element
         */
        org.apache.xmlbeans.XmlString insertNewGoal(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "goal" element
         */
        org.apache.xmlbeans.XmlString addNewGoal();
        
        /**
         * Removes the ith "goal" element
         */
        void removeGoal(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.PluginExecution.Goals newInstance() {
              return (org.apache.maven.pom.x400.PluginExecution.Goals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.PluginExecution.Goals newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.PluginExecution.Goals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("configuration5abfelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.PluginExecution.Configuration newInstance() {
              return (org.apache.maven.pom.x400.PluginExecution.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.PluginExecution.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.PluginExecution.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.PluginExecution newInstance() {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.PluginExecution parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.PluginExecution parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.PluginExecution parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.PluginExecution parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.PluginExecution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
