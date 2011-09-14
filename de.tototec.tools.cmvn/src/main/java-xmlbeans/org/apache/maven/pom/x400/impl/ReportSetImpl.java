/*
 * XML Type:  ReportSet
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ReportSet
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML ReportSet(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ReportSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportSet
{
    private static final long serialVersionUID = 1L;
    
    public ReportSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "id");
    private static final javax.xml.namespace.QName CONFIGURATION$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "configuration");
    private static final javax.xml.namespace.QName INHERITED$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "inherited");
    private static final javax.xml.namespace.QName REPORTS$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "reports");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.maven.pom.x400.ReportSet.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Configuration)get_store().find_element_user(CONFIGURATION$2, 0);
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
            return get_store().count_elements(CONFIGURATION$2) != 0;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.maven.pom.x400.ReportSet.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Configuration)get_store().find_element_user(CONFIGURATION$2, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ReportSet.Configuration)get_store().add_element_user(CONFIGURATION$2);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.maven.pom.x400.ReportSet.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Configuration target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Configuration)get_store().add_element_user(CONFIGURATION$2);
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
            get_store().remove_element(CONFIGURATION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$4, 0);
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
            return get_store().count_elements(INHERITED$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INHERITED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INHERITED$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INHERITED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INHERITED$4);
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
            get_store().remove_element(INHERITED$4, 0);
        }
    }
    
    /**
     * Gets the "reports" element
     */
    public org.apache.maven.pom.x400.ReportSet.Reports getReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Reports target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Reports)get_store().find_element_user(REPORTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reports" element
     */
    public boolean isSetReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTS$6) != 0;
        }
    }
    
    /**
     * Sets the "reports" element
     */
    public void setReports(org.apache.maven.pom.x400.ReportSet.Reports reports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Reports target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Reports)get_store().find_element_user(REPORTS$6, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ReportSet.Reports)get_store().add_element_user(REPORTS$6);
            }
            target.set(reports);
        }
    }
    
    /**
     * Appends and returns a new empty "reports" element
     */
    public org.apache.maven.pom.x400.ReportSet.Reports addNewReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ReportSet.Reports target = null;
            target = (org.apache.maven.pom.x400.ReportSet.Reports)get_store().add_element_user(REPORTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reports" element
     */
    public void unsetReports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTS$6, 0);
        }
    }
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportSet.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML reports(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ReportsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ReportSet.Reports
    {
        private static final long serialVersionUID = 1L;
        
        public ReportsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORT$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "report");
        
        
        /**
         * Gets array of all "report" elements
         */
        public java.lang.String[] getReportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORT$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "report" element
         */
        public java.lang.String getReportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "report" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetReportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORT$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "report" element
         */
        public org.apache.xmlbeans.XmlString xgetReportArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "report" element
         */
        public int sizeOfReportArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORT$0);
            }
        }
        
        /**
         * Sets array of all "report" element
         */
        public void setReportArray(java.lang.String[] reportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportArray, REPORT$0);
            }
        }
        
        /**
         * Sets ith "report" element
         */
        public void setReportArray(int i, java.lang.String report)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(report);
            }
        }
        
        /**
         * Sets (as xml) array of all "report" element
         */
        public void xsetReportArray(org.apache.xmlbeans.XmlString[]reportArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportArray, REPORT$0);
            }
        }
        
        /**
         * Sets (as xml) ith "report" element
         */
        public void xsetReportArray(int i, org.apache.xmlbeans.XmlString report)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(report);
            }
        }
        
        /**
         * Inserts the value as the ith "report" element
         */
        public void insertReport(int i, java.lang.String report)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REPORT$0, i);
                target.setStringValue(report);
            }
        }
        
        /**
         * Appends the value as the last "report" element
         */
        public void addReport(java.lang.String report)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORT$0);
                target.setStringValue(report);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "report" element
         */
        public org.apache.xmlbeans.XmlString insertNewReport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REPORT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "report" element
         */
        public org.apache.xmlbeans.XmlString addNewReport()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "report" element
         */
        public void removeReport(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORT$0, i);
            }
        }
    }
}
