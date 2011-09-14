/*
 * XML Type:  ReportPlugin
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ReportPlugin
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML ReportPlugin(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ReportPluginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportPlugin
{
    private static final long serialVersionUID = 1L;
    
    public ReportPluginImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "groupId");
    private static final javax.xml.namespace.QName ARTIFACTID$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "artifactId");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    private static final javax.xml.namespace.QName INHERITED$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "inherited");
    private static final javax.xml.namespace.QName CONFIGURATION$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "configuration");
    private static final javax.xml.namespace.QName REPORTSETS$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reportSets");
    
    
    /**
     * Gets the "groupId" element
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupId" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "groupId" element
     */
    public boolean isSetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$0) != 0;
        }
    }
    
    /**
     * Sets the "groupId" element
     */
    public void setGroupId(java.lang.String groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPID$0);
            }
            target.setStringValue(groupId);
        }
    }
    
    /**
     * Sets (as xml) the "groupId" element
     */
    public void xsetGroupId(org.apache.xmlbeans.XmlString groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPID$0);
            }
            target.set(groupId);
        }
    }
    
    /**
     * Unsets the "groupId" element
     */
    public void unsetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$0, 0);
        }
    }
    
    /**
     * Gets the "artifactId" element
     */
    public java.lang.String getArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "artifactId" element
     */
    public org.apache.xmlbeans.XmlString xgetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "artifactId" element
     */
    public boolean isSetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIFACTID$2) != 0;
        }
    }
    
    /**
     * Sets the "artifactId" element
     */
    public void setArtifactId(java.lang.String artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARTIFACTID$2);
            }
            target.setStringValue(artifactId);
        }
    }
    
    /**
     * Sets (as xml) the "artifactId" element
     */
    public void xsetArtifactId(org.apache.xmlbeans.XmlString artifactId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARTIFACTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARTIFACTID$2);
            }
            target.set(artifactId);
        }
    }
    
    /**
     * Unsets the "artifactId" element
     */
    public void unsetArtifactId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIFACTID$2, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$4, 0);
        }
    }
    
    /**
     * Gets the "inherited" element
     */
    public java.lang.String getInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inherited" element
     */
    public org.apache.xmlbeans.XmlString xgetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "inherited" element
     */
    public boolean isSetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INHERITED$6) != 0;
        }
    }
    
    /**
     * Sets the "inherited" element
     */
    public void setInherited(java.lang.String inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITED$6);
            }
            target.setStringValue(inherited);
        }
    }
    
    /**
     * Sets (as xml) the "inherited" element
     */
    public void xsetInherited(org.apache.xmlbeans.XmlString inherited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INHERITED$6);
            }
            target.set(inherited);
        }
    }
    
    /**
     * Unsets the "inherited" element
     */
    public void unsetInherited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INHERITED$6, 0);
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.maven.pom.x400.ReportPlugin.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.Configuration)get_store().find_element_user(CONFIGURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "configuration" element
     */
    public boolean isSetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIGURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.maven.pom.x400.ReportPlugin.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.Configuration)get_store().find_element_user(CONFIGURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ReportPlugin.Configuration)get_store().add_element_user(CONFIGURATION$8);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.maven.pom.x400.ReportPlugin.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.Configuration)get_store().add_element_user(CONFIGURATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "configuration" element
     */
    public void unsetConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIGURATION$8, 0);
        }
    }
    
    /**
     * Gets the "reportSets" element
     */
    public org.apache.maven.pom.x400.ReportPlugin.ReportSets getReportSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.ReportSets target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.ReportSets)get_store().find_element_user(REPORTSETS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportSets" element
     */
    public boolean isSetReportSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSETS$10) != 0;
        }
    }
    
    /**
     * Sets the "reportSets" element
     */
    public void setReportSets(org.apache.maven.pom.x400.ReportPlugin.ReportSets reportSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.ReportSets target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.ReportSets)get_store().find_element_user(REPORTSETS$10, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ReportPlugin.ReportSets)get_store().add_element_user(REPORTSETS$10);
            }
            target.set(reportSets);
        }
    }
    
    /**
     * Appends and returns a new empty "reportSets" element
     */
    public org.apache.maven.pom.x400.ReportPlugin.ReportSets addNewReportSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportPlugin.ReportSets target = null;
            target = (org.apache.maven.pom.x400.ReportPlugin.ReportSets)get_store().add_element_user(REPORTSETS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "reportSets" element
     */
    public void unsetReportSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSETS$10, 0);
        }
    }
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportPlugin.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML reportSets(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ReportSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportPlugin.ReportSets
    {
        private static final long serialVersionUID = 1L;
        
        public ReportSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTSET$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reportSet");
        
        
        /**
         * Gets array of all "reportSet" elements
         */
        public org.apache.maven.pom.x400.ReportSet[] getReportSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTSET$0, targetList);
                org.apache.maven.pom.x400.ReportSet[] result = new org.apache.maven.pom.x400.ReportSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reportSet" element
         */
        public org.apache.maven.pom.x400.ReportSet getReportSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportSet target = null;
                target = (org.apache.maven.pom.x400.ReportSet)get_store().find_element_user(REPORTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reportSet" element
         */
        public int sizeOfReportSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTSET$0);
            }
        }
        
        /**
         * Sets array of all "reportSet" element
         */
        public void setReportSetArray(org.apache.maven.pom.x400.ReportSet[] reportSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportSetArray, REPORTSET$0);
            }
        }
        
        /**
         * Sets ith "reportSet" element
         */
        public void setReportSetArray(int i, org.apache.maven.pom.x400.ReportSet reportSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportSet target = null;
                target = (org.apache.maven.pom.x400.ReportSet)get_store().find_element_user(REPORTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportSet" element
         */
        public org.apache.maven.pom.x400.ReportSet insertNewReportSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportSet target = null;
                target = (org.apache.maven.pom.x400.ReportSet)get_store().insert_element_user(REPORTSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportSet" element
         */
        public org.apache.maven.pom.x400.ReportSet addNewReportSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.ReportSet target = null;
                target = (org.apache.maven.pom.x400.ReportSet)get_store().add_element_user(REPORTSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "reportSet" element
         */
        public void removeReportSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTSET$0, i);
            }
        }
    }
}
