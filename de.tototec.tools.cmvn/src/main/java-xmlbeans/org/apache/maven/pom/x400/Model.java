/*
 * XML Type:  Model
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Model
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400;


/**
 * An XML Model(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public interface Model extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Model.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("model9a21type");
    
    /**
     * Gets the "parent" element
     */
    org.apache.maven.pom.x400.Parent getParent();
    
    /**
     * True if has "parent" element
     */
    boolean isSetParent();
    
    /**
     * Sets the "parent" element
     */
    void setParent(org.apache.maven.pom.x400.Parent parent);
    
    /**
     * Appends and returns a new empty "parent" element
     */
    org.apache.maven.pom.x400.Parent addNewParent();
    
    /**
     * Unsets the "parent" element
     */
    void unsetParent();
    
    /**
     * Gets the "modelVersion" element
     */
    java.lang.String getModelVersion();
    
    /**
     * Gets (as xml) the "modelVersion" element
     */
    org.apache.xmlbeans.XmlString xgetModelVersion();
    
    /**
     * True if has "modelVersion" element
     */
    boolean isSetModelVersion();
    
    /**
     * Sets the "modelVersion" element
     */
    void setModelVersion(java.lang.String modelVersion);
    
    /**
     * Sets (as xml) the "modelVersion" element
     */
    void xsetModelVersion(org.apache.xmlbeans.XmlString modelVersion);
    
    /**
     * Unsets the "modelVersion" element
     */
    void unsetModelVersion();
    
    /**
     * Gets the "groupId" element
     */
    java.lang.String getGroupId();
    
    /**
     * Gets (as xml) the "groupId" element
     */
    org.apache.xmlbeans.XmlString xgetGroupId();
    
    /**
     * True if has "groupId" element
     */
    boolean isSetGroupId();
    
    /**
     * Sets the "groupId" element
     */
    void setGroupId(java.lang.String groupId);
    
    /**
     * Sets (as xml) the "groupId" element
     */
    void xsetGroupId(org.apache.xmlbeans.XmlString groupId);
    
    /**
     * Unsets the "groupId" element
     */
    void unsetGroupId();
    
    /**
     * Gets the "artifactId" element
     */
    java.lang.String getArtifactId();
    
    /**
     * Gets (as xml) the "artifactId" element
     */
    org.apache.xmlbeans.XmlString xgetArtifactId();
    
    /**
     * True if has "artifactId" element
     */
    boolean isSetArtifactId();
    
    /**
     * Sets the "artifactId" element
     */
    void setArtifactId(java.lang.String artifactId);
    
    /**
     * Sets (as xml) the "artifactId" element
     */
    void xsetArtifactId(org.apache.xmlbeans.XmlString artifactId);
    
    /**
     * Unsets the "artifactId" element
     */
    void unsetArtifactId();
    
    /**
     * Gets the "packaging" element
     */
    java.lang.String getPackaging();
    
    /**
     * Gets (as xml) the "packaging" element
     */
    org.apache.xmlbeans.XmlString xgetPackaging();
    
    /**
     * True if has "packaging" element
     */
    boolean isSetPackaging();
    
    /**
     * Sets the "packaging" element
     */
    void setPackaging(java.lang.String packaging);
    
    /**
     * Sets (as xml) the "packaging" element
     */
    void xsetPackaging(org.apache.xmlbeans.XmlString packaging);
    
    /**
     * Unsets the "packaging" element
     */
    void unsetPackaging();
    
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
     * Gets the "version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
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
     * Gets the "prerequisites" element
     */
    org.apache.maven.pom.x400.Prerequisites getPrerequisites();
    
    /**
     * True if has "prerequisites" element
     */
    boolean isSetPrerequisites();
    
    /**
     * Sets the "prerequisites" element
     */
    void setPrerequisites(org.apache.maven.pom.x400.Prerequisites prerequisites);
    
    /**
     * Appends and returns a new empty "prerequisites" element
     */
    org.apache.maven.pom.x400.Prerequisites addNewPrerequisites();
    
    /**
     * Unsets the "prerequisites" element
     */
    void unsetPrerequisites();
    
    /**
     * Gets the "issueManagement" element
     */
    org.apache.maven.pom.x400.IssueManagement getIssueManagement();
    
    /**
     * True if has "issueManagement" element
     */
    boolean isSetIssueManagement();
    
    /**
     * Sets the "issueManagement" element
     */
    void setIssueManagement(org.apache.maven.pom.x400.IssueManagement issueManagement);
    
    /**
     * Appends and returns a new empty "issueManagement" element
     */
    org.apache.maven.pom.x400.IssueManagement addNewIssueManagement();
    
    /**
     * Unsets the "issueManagement" element
     */
    void unsetIssueManagement();
    
    /**
     * Gets the "ciManagement" element
     */
    org.apache.maven.pom.x400.CiManagement getCiManagement();
    
    /**
     * True if has "ciManagement" element
     */
    boolean isSetCiManagement();
    
    /**
     * Sets the "ciManagement" element
     */
    void setCiManagement(org.apache.maven.pom.x400.CiManagement ciManagement);
    
    /**
     * Appends and returns a new empty "ciManagement" element
     */
    org.apache.maven.pom.x400.CiManagement addNewCiManagement();
    
    /**
     * Unsets the "ciManagement" element
     */
    void unsetCiManagement();
    
    /**
     * Gets the "inceptionYear" element
     */
    java.lang.String getInceptionYear();
    
    /**
     * Gets (as xml) the "inceptionYear" element
     */
    org.apache.xmlbeans.XmlString xgetInceptionYear();
    
    /**
     * True if has "inceptionYear" element
     */
    boolean isSetInceptionYear();
    
    /**
     * Sets the "inceptionYear" element
     */
    void setInceptionYear(java.lang.String inceptionYear);
    
    /**
     * Sets (as xml) the "inceptionYear" element
     */
    void xsetInceptionYear(org.apache.xmlbeans.XmlString inceptionYear);
    
    /**
     * Unsets the "inceptionYear" element
     */
    void unsetInceptionYear();
    
    /**
     * Gets the "mailingLists" element
     */
    org.apache.maven.pom.x400.Model.MailingLists getMailingLists();
    
    /**
     * True if has "mailingLists" element
     */
    boolean isSetMailingLists();
    
    /**
     * Sets the "mailingLists" element
     */
    void setMailingLists(org.apache.maven.pom.x400.Model.MailingLists mailingLists);
    
    /**
     * Appends and returns a new empty "mailingLists" element
     */
    org.apache.maven.pom.x400.Model.MailingLists addNewMailingLists();
    
    /**
     * Unsets the "mailingLists" element
     */
    void unsetMailingLists();
    
    /**
     * Gets the "developers" element
     */
    org.apache.maven.pom.x400.Model.Developers getDevelopers();
    
    /**
     * True if has "developers" element
     */
    boolean isSetDevelopers();
    
    /**
     * Sets the "developers" element
     */
    void setDevelopers(org.apache.maven.pom.x400.Model.Developers developers);
    
    /**
     * Appends and returns a new empty "developers" element
     */
    org.apache.maven.pom.x400.Model.Developers addNewDevelopers();
    
    /**
     * Unsets the "developers" element
     */
    void unsetDevelopers();
    
    /**
     * Gets the "contributors" element
     */
    org.apache.maven.pom.x400.Model.Contributors getContributors();
    
    /**
     * True if has "contributors" element
     */
    boolean isSetContributors();
    
    /**
     * Sets the "contributors" element
     */
    void setContributors(org.apache.maven.pom.x400.Model.Contributors contributors);
    
    /**
     * Appends and returns a new empty "contributors" element
     */
    org.apache.maven.pom.x400.Model.Contributors addNewContributors();
    
    /**
     * Unsets the "contributors" element
     */
    void unsetContributors();
    
    /**
     * Gets the "licenses" element
     */
    org.apache.maven.pom.x400.Model.Licenses getLicenses();
    
    /**
     * True if has "licenses" element
     */
    boolean isSetLicenses();
    
    /**
     * Sets the "licenses" element
     */
    void setLicenses(org.apache.maven.pom.x400.Model.Licenses licenses);
    
    /**
     * Appends and returns a new empty "licenses" element
     */
    org.apache.maven.pom.x400.Model.Licenses addNewLicenses();
    
    /**
     * Unsets the "licenses" element
     */
    void unsetLicenses();
    
    /**
     * Gets the "scm" element
     */
    org.apache.maven.pom.x400.Scm getScm();
    
    /**
     * True if has "scm" element
     */
    boolean isSetScm();
    
    /**
     * Sets the "scm" element
     */
    void setScm(org.apache.maven.pom.x400.Scm scm);
    
    /**
     * Appends and returns a new empty "scm" element
     */
    org.apache.maven.pom.x400.Scm addNewScm();
    
    /**
     * Unsets the "scm" element
     */
    void unsetScm();
    
    /**
     * Gets the "organization" element
     */
    org.apache.maven.pom.x400.Organization getOrganization();
    
    /**
     * True if has "organization" element
     */
    boolean isSetOrganization();
    
    /**
     * Sets the "organization" element
     */
    void setOrganization(org.apache.maven.pom.x400.Organization organization);
    
    /**
     * Appends and returns a new empty "organization" element
     */
    org.apache.maven.pom.x400.Organization addNewOrganization();
    
    /**
     * Unsets the "organization" element
     */
    void unsetOrganization();
    
    /**
     * Gets the "build" element
     */
    org.apache.maven.pom.x400.Build getBuild();
    
    /**
     * True if has "build" element
     */
    boolean isSetBuild();
    
    /**
     * Sets the "build" element
     */
    void setBuild(org.apache.maven.pom.x400.Build build);
    
    /**
     * Appends and returns a new empty "build" element
     */
    org.apache.maven.pom.x400.Build addNewBuild();
    
    /**
     * Unsets the "build" element
     */
    void unsetBuild();
    
    /**
     * Gets the "profiles" element
     */
    org.apache.maven.pom.x400.Model.Profiles getProfiles();
    
    /**
     * True if has "profiles" element
     */
    boolean isSetProfiles();
    
    /**
     * Sets the "profiles" element
     */
    void setProfiles(org.apache.maven.pom.x400.Model.Profiles profiles);
    
    /**
     * Appends and returns a new empty "profiles" element
     */
    org.apache.maven.pom.x400.Model.Profiles addNewProfiles();
    
    /**
     * Unsets the "profiles" element
     */
    void unsetProfiles();
    
    /**
     * Gets the "modules" element
     */
    org.apache.maven.pom.x400.Model.Modules getModules();
    
    /**
     * True if has "modules" element
     */
    boolean isSetModules();
    
    /**
     * Sets the "modules" element
     */
    void setModules(org.apache.maven.pom.x400.Model.Modules modules);
    
    /**
     * Appends and returns a new empty "modules" element
     */
    org.apache.maven.pom.x400.Model.Modules addNewModules();
    
    /**
     * Unsets the "modules" element
     */
    void unsetModules();
    
    /**
     * Gets the "repositories" element
     */
    org.apache.maven.pom.x400.Model.Repositories getRepositories();
    
    /**
     * True if has "repositories" element
     */
    boolean isSetRepositories();
    
    /**
     * Sets the "repositories" element
     */
    void setRepositories(org.apache.maven.pom.x400.Model.Repositories repositories);
    
    /**
     * Appends and returns a new empty "repositories" element
     */
    org.apache.maven.pom.x400.Model.Repositories addNewRepositories();
    
    /**
     * Unsets the "repositories" element
     */
    void unsetRepositories();
    
    /**
     * Gets the "pluginRepositories" element
     */
    org.apache.maven.pom.x400.Model.PluginRepositories getPluginRepositories();
    
    /**
     * True if has "pluginRepositories" element
     */
    boolean isSetPluginRepositories();
    
    /**
     * Sets the "pluginRepositories" element
     */
    void setPluginRepositories(org.apache.maven.pom.x400.Model.PluginRepositories pluginRepositories);
    
    /**
     * Appends and returns a new empty "pluginRepositories" element
     */
    org.apache.maven.pom.x400.Model.PluginRepositories addNewPluginRepositories();
    
    /**
     * Unsets the "pluginRepositories" element
     */
    void unsetPluginRepositories();
    
    /**
     * Gets the "dependencies" element
     */
    org.apache.maven.pom.x400.Model.Dependencies getDependencies();
    
    /**
     * True if has "dependencies" element
     */
    boolean isSetDependencies();
    
    /**
     * Sets the "dependencies" element
     */
    void setDependencies(org.apache.maven.pom.x400.Model.Dependencies dependencies);
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    org.apache.maven.pom.x400.Model.Dependencies addNewDependencies();
    
    /**
     * Unsets the "dependencies" element
     */
    void unsetDependencies();
    
    /**
     * Gets the "reports" element
     */
    org.apache.maven.pom.x400.Model.Reports getReports();
    
    /**
     * True if has "reports" element
     */
    boolean isSetReports();
    
    /**
     * Sets the "reports" element
     */
    void setReports(org.apache.maven.pom.x400.Model.Reports reports);
    
    /**
     * Appends and returns a new empty "reports" element
     */
    org.apache.maven.pom.x400.Model.Reports addNewReports();
    
    /**
     * Unsets the "reports" element
     */
    void unsetReports();
    
    /**
     * Gets the "reporting" element
     */
    org.apache.maven.pom.x400.Reporting getReporting();
    
    /**
     * True if has "reporting" element
     */
    boolean isSetReporting();
    
    /**
     * Sets the "reporting" element
     */
    void setReporting(org.apache.maven.pom.x400.Reporting reporting);
    
    /**
     * Appends and returns a new empty "reporting" element
     */
    org.apache.maven.pom.x400.Reporting addNewReporting();
    
    /**
     * Unsets the "reporting" element
     */
    void unsetReporting();
    
    /**
     * Gets the "dependencyManagement" element
     */
    org.apache.maven.pom.x400.DependencyManagement getDependencyManagement();
    
    /**
     * True if has "dependencyManagement" element
     */
    boolean isSetDependencyManagement();
    
    /**
     * Sets the "dependencyManagement" element
     */
    void setDependencyManagement(org.apache.maven.pom.x400.DependencyManagement dependencyManagement);
    
    /**
     * Appends and returns a new empty "dependencyManagement" element
     */
    org.apache.maven.pom.x400.DependencyManagement addNewDependencyManagement();
    
    /**
     * Unsets the "dependencyManagement" element
     */
    void unsetDependencyManagement();
    
    /**
     * Gets the "distributionManagement" element
     */
    org.apache.maven.pom.x400.DistributionManagement getDistributionManagement();
    
    /**
     * True if has "distributionManagement" element
     */
    boolean isSetDistributionManagement();
    
    /**
     * Sets the "distributionManagement" element
     */
    void setDistributionManagement(org.apache.maven.pom.x400.DistributionManagement distributionManagement);
    
    /**
     * Appends and returns a new empty "distributionManagement" element
     */
    org.apache.maven.pom.x400.DistributionManagement addNewDistributionManagement();
    
    /**
     * Unsets the "distributionManagement" element
     */
    void unsetDistributionManagement();
    
    /**
     * Gets the "properties" element
     */
    org.apache.maven.pom.x400.Model.Properties getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(org.apache.maven.pom.x400.Model.Properties properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    org.apache.maven.pom.x400.Model.Properties addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * An XML mailingLists(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface MailingLists extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MailingLists.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("mailinglistsc6c7elemtype");
        
        /**
         * Gets array of all "mailingList" elements
         */
        org.apache.maven.pom.x400.MailingList[] getMailingListArray();
        
        /**
         * Gets ith "mailingList" element
         */
        org.apache.maven.pom.x400.MailingList getMailingListArray(int i);
        
        /**
         * Returns number of "mailingList" element
         */
        int sizeOfMailingListArray();
        
        /**
         * Sets array of all "mailingList" element
         */
        void setMailingListArray(org.apache.maven.pom.x400.MailingList[] mailingListArray);
        
        /**
         * Sets ith "mailingList" element
         */
        void setMailingListArray(int i, org.apache.maven.pom.x400.MailingList mailingList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "mailingList" element
         */
        org.apache.maven.pom.x400.MailingList insertNewMailingList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "mailingList" element
         */
        org.apache.maven.pom.x400.MailingList addNewMailingList();
        
        /**
         * Removes the ith "mailingList" element
         */
        void removeMailingList(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.MailingLists newInstance() {
              return (org.apache.maven.pom.x400.Model.MailingLists) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.MailingLists newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.MailingLists) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML developers(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Developers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Developers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("developers6066elemtype");
        
        /**
         * Gets array of all "developer" elements
         */
        org.apache.maven.pom.x400.Developer[] getDeveloperArray();
        
        /**
         * Gets ith "developer" element
         */
        org.apache.maven.pom.x400.Developer getDeveloperArray(int i);
        
        /**
         * Returns number of "developer" element
         */
        int sizeOfDeveloperArray();
        
        /**
         * Sets array of all "developer" element
         */
        void setDeveloperArray(org.apache.maven.pom.x400.Developer[] developerArray);
        
        /**
         * Sets ith "developer" element
         */
        void setDeveloperArray(int i, org.apache.maven.pom.x400.Developer developer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "developer" element
         */
        org.apache.maven.pom.x400.Developer insertNewDeveloper(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "developer" element
         */
        org.apache.maven.pom.x400.Developer addNewDeveloper();
        
        /**
         * Removes the ith "developer" element
         */
        void removeDeveloper(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Developers newInstance() {
              return (org.apache.maven.pom.x400.Model.Developers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Developers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Developers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML contributors(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Contributors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contributors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("contributors80b5elemtype");
        
        /**
         * Gets array of all "contributor" elements
         */
        org.apache.maven.pom.x400.Contributor[] getContributorArray();
        
        /**
         * Gets ith "contributor" element
         */
        org.apache.maven.pom.x400.Contributor getContributorArray(int i);
        
        /**
         * Returns number of "contributor" element
         */
        int sizeOfContributorArray();
        
        /**
         * Sets array of all "contributor" element
         */
        void setContributorArray(org.apache.maven.pom.x400.Contributor[] contributorArray);
        
        /**
         * Sets ith "contributor" element
         */
        void setContributorArray(int i, org.apache.maven.pom.x400.Contributor contributor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contributor" element
         */
        org.apache.maven.pom.x400.Contributor insertNewContributor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contributor" element
         */
        org.apache.maven.pom.x400.Contributor addNewContributor();
        
        /**
         * Removes the ith "contributor" element
         */
        void removeContributor(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Contributors newInstance() {
              return (org.apache.maven.pom.x400.Model.Contributors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Contributors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Contributors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML licenses(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Licenses extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Licenses.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("licenses858felemtype");
        
        /**
         * Gets array of all "license" elements
         */
        org.apache.maven.pom.x400.License[] getLicenseArray();
        
        /**
         * Gets ith "license" element
         */
        org.apache.maven.pom.x400.License getLicenseArray(int i);
        
        /**
         * Returns number of "license" element
         */
        int sizeOfLicenseArray();
        
        /**
         * Sets array of all "license" element
         */
        void setLicenseArray(org.apache.maven.pom.x400.License[] licenseArray);
        
        /**
         * Sets ith "license" element
         */
        void setLicenseArray(int i, org.apache.maven.pom.x400.License license);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "license" element
         */
        org.apache.maven.pom.x400.License insertNewLicense(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "license" element
         */
        org.apache.maven.pom.x400.License addNewLicense();
        
        /**
         * Removes the ith "license" element
         */
        void removeLicense(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Licenses newInstance() {
              return (org.apache.maven.pom.x400.Model.Licenses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Licenses newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Licenses) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML profiles(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Profiles extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Profiles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("profiles2f27elemtype");
        
        /**
         * Gets array of all "profile" elements
         */
        org.apache.maven.pom.x400.Profile[] getProfileArray();
        
        /**
         * Gets ith "profile" element
         */
        org.apache.maven.pom.x400.Profile getProfileArray(int i);
        
        /**
         * Returns number of "profile" element
         */
        int sizeOfProfileArray();
        
        /**
         * Sets array of all "profile" element
         */
        void setProfileArray(org.apache.maven.pom.x400.Profile[] profileArray);
        
        /**
         * Sets ith "profile" element
         */
        void setProfileArray(int i, org.apache.maven.pom.x400.Profile profile);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "profile" element
         */
        org.apache.maven.pom.x400.Profile insertNewProfile(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "profile" element
         */
        org.apache.maven.pom.x400.Profile addNewProfile();
        
        /**
         * Removes the ith "profile" element
         */
        void removeProfile(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Profiles newInstance() {
              return (org.apache.maven.pom.x400.Model.Profiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Profiles newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Profiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML modules(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Modules extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("modulesbe54elemtype");
        
        /**
         * Gets array of all "module" elements
         */
        java.lang.String[] getModuleArray();
        
        /**
         * Gets ith "module" element
         */
        java.lang.String getModuleArray(int i);
        
        /**
         * Gets (as xml) array of all "module" elements
         */
        org.apache.xmlbeans.XmlString[] xgetModuleArray();
        
        /**
         * Gets (as xml) ith "module" element
         */
        org.apache.xmlbeans.XmlString xgetModuleArray(int i);
        
        /**
         * Returns number of "module" element
         */
        int sizeOfModuleArray();
        
        /**
         * Sets array of all "module" element
         */
        void setModuleArray(java.lang.String[] moduleArray);
        
        /**
         * Sets ith "module" element
         */
        void setModuleArray(int i, java.lang.String module);
        
        /**
         * Sets (as xml) array of all "module" element
         */
        void xsetModuleArray(org.apache.xmlbeans.XmlString[] moduleArray);
        
        /**
         * Sets (as xml) ith "module" element
         */
        void xsetModuleArray(int i, org.apache.xmlbeans.XmlString module);
        
        /**
         * Inserts the value as the ith "module" element
         */
        void insertModule(int i, java.lang.String module);
        
        /**
         * Appends the value as the last "module" element
         */
        void addModule(java.lang.String module);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "module" element
         */
        org.apache.xmlbeans.XmlString insertNewModule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "module" element
         */
        org.apache.xmlbeans.XmlString addNewModule();
        
        /**
         * Removes the ith "module" element
         */
        void removeModule(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Modules newInstance() {
              return (org.apache.maven.pom.x400.Model.Modules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Modules newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Modules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML repositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Repositories extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Repositories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("repositoriesbb25elemtype");
        
        /**
         * Gets array of all "repository" elements
         */
        org.apache.maven.pom.x400.Repository[] getRepositoryArray();
        
        /**
         * Gets ith "repository" element
         */
        org.apache.maven.pom.x400.Repository getRepositoryArray(int i);
        
        /**
         * Returns number of "repository" element
         */
        int sizeOfRepositoryArray();
        
        /**
         * Sets array of all "repository" element
         */
        void setRepositoryArray(org.apache.maven.pom.x400.Repository[] repositoryArray);
        
        /**
         * Sets ith "repository" element
         */
        void setRepositoryArray(int i, org.apache.maven.pom.x400.Repository repository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "repository" element
         */
        org.apache.maven.pom.x400.Repository insertNewRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "repository" element
         */
        org.apache.maven.pom.x400.Repository addNewRepository();
        
        /**
         * Removes the ith "repository" element
         */
        void removeRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Repositories newInstance() {
              return (org.apache.maven.pom.x400.Model.Repositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Repositories newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Repositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML pluginRepositories(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface PluginRepositories extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PluginRepositories.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("pluginrepositoriesc038elemtype");
        
        /**
         * Gets array of all "pluginRepository" elements
         */
        org.apache.maven.pom.x400.Repository[] getPluginRepositoryArray();
        
        /**
         * Gets ith "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository getPluginRepositoryArray(int i);
        
        /**
         * Returns number of "pluginRepository" element
         */
        int sizeOfPluginRepositoryArray();
        
        /**
         * Sets array of all "pluginRepository" element
         */
        void setPluginRepositoryArray(org.apache.maven.pom.x400.Repository[] pluginRepositoryArray);
        
        /**
         * Sets ith "pluginRepository" element
         */
        void setPluginRepositoryArray(int i, org.apache.maven.pom.x400.Repository pluginRepository);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository insertNewPluginRepository(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pluginRepository" element
         */
        org.apache.maven.pom.x400.Repository addNewPluginRepository();
        
        /**
         * Removes the ith "pluginRepository" element
         */
        void removePluginRepository(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.PluginRepositories newInstance() {
              return (org.apache.maven.pom.x400.Model.PluginRepositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.PluginRepositories newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.PluginRepositories) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML dependencies(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Dependencies extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dependencies.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("dependencies75a6elemtype");
        
        /**
         * Gets array of all "dependency" elements
         */
        org.apache.maven.pom.x400.Dependency[] getDependencyArray();
        
        /**
         * Gets ith "dependency" element
         */
        org.apache.maven.pom.x400.Dependency getDependencyArray(int i);
        
        /**
         * Returns number of "dependency" element
         */
        int sizeOfDependencyArray();
        
        /**
         * Sets array of all "dependency" element
         */
        void setDependencyArray(org.apache.maven.pom.x400.Dependency[] dependencyArray);
        
        /**
         * Sets ith "dependency" element
         */
        void setDependencyArray(int i, org.apache.maven.pom.x400.Dependency dependency);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependency" element
         */
        org.apache.maven.pom.x400.Dependency insertNewDependency(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependency" element
         */
        org.apache.maven.pom.x400.Dependency addNewDependency();
        
        /**
         * Removes the ith "dependency" element
         */
        void removeDependency(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Dependencies newInstance() {
              return (org.apache.maven.pom.x400.Model.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Dependencies newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Dependencies) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML reports(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public interface Reports extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reports.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("reportsa28celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Reports newInstance() {
              return (org.apache.maven.pom.x400.Model.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Reports newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Reports) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Properties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB7B99D13014573E0177E6C86F82551D1").resolveHandle("properties1f30elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.maven.pom.x400.Model.Properties newInstance() {
              return (org.apache.maven.pom.x400.Model.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.maven.pom.x400.Model.Properties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.maven.pom.x400.Model.Properties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.maven.pom.x400.Model newInstance() {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.maven.pom.x400.Model newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.maven.pom.x400.Model parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.maven.pom.x400.Model parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.maven.pom.x400.Model parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.maven.pom.x400.Model parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.maven.pom.x400.Model parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Model parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.maven.pom.x400.Model parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.maven.pom.x400.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
