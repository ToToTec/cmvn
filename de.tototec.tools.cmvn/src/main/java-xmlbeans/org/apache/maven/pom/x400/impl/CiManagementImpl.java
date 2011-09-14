/*
 * XML Type:  CiManagement
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.CiManagement
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML CiManagement(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class CiManagementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.CiManagement
{
    private static final long serialVersionUID = 1L;
    
    public CiManagementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "system");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "url");
    private static final javax.xml.namespace.QName NOTIFIERS$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "notifiers");
    
    
    /**
     * Gets the "system" element
     */
    public java.lang.String getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "system" element
     */
    public org.apache.xmlbeans.XmlString xgetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEM$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "system" element
     */
    public boolean isSetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(java.lang.String system)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEM$0);
            }
            target.setStringValue(system);
        }
    }
    
    /**
     * Sets (as xml) the "system" element
     */
    public void xsetSystem(org.apache.xmlbeans.XmlString system)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYSTEM$0);
            }
            target.set(system);
        }
    }
    
    /**
     * Unsets the "system" element
     */
    public void unsetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$2) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$2);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$2);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$2, 0);
        }
    }
    
    /**
     * Gets the "notifiers" element
     */
    public org.apache.maven.pom.x400.CiManagement.Notifiers getNotifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement.Notifiers target = null;
            target = (org.apache.maven.pom.x400.CiManagement.Notifiers)get_store().find_element_user(NOTIFIERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notifiers" element
     */
    public boolean isSetNotifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFIERS$4) != 0;
        }
    }
    
    /**
     * Sets the "notifiers" element
     */
    public void setNotifiers(org.apache.maven.pom.x400.CiManagement.Notifiers notifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement.Notifiers target = null;
            target = (org.apache.maven.pom.x400.CiManagement.Notifiers)get_store().find_element_user(NOTIFIERS$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.CiManagement.Notifiers)get_store().add_element_user(NOTIFIERS$4);
            }
            target.set(notifiers);
        }
    }
    
    /**
     * Appends and returns a new empty "notifiers" element
     */
    public org.apache.maven.pom.x400.CiManagement.Notifiers addNewNotifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.CiManagement.Notifiers target = null;
            target = (org.apache.maven.pom.x400.CiManagement.Notifiers)get_store().add_element_user(NOTIFIERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "notifiers" element
     */
    public void unsetNotifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFIERS$4, 0);
        }
    }
    /**
     * An XML notifiers(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class NotifiersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.CiManagement.Notifiers
    {
        private static final long serialVersionUID = 1L;
        
        public NotifiersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOTIFIER$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "notifier");
        
        
        /**
         * Gets array of all "notifier" elements
         */
        public org.apache.maven.pom.x400.Notifier[] getNotifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOTIFIER$0, targetList);
                org.apache.maven.pom.x400.Notifier[] result = new org.apache.maven.pom.x400.Notifier[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "notifier" element
         */
        public org.apache.maven.pom.x400.Notifier getNotifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Notifier target = null;
                target = (org.apache.maven.pom.x400.Notifier)get_store().find_element_user(NOTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "notifier" element
         */
        public int sizeOfNotifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "notifier" element
         */
        public void setNotifierArray(org.apache.maven.pom.x400.Notifier[] notifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(notifierArray, NOTIFIER$0);
            }
        }
        
        /**
         * Sets ith "notifier" element
         */
        public void setNotifierArray(int i, org.apache.maven.pom.x400.Notifier notifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Notifier target = null;
                target = (org.apache.maven.pom.x400.Notifier)get_store().find_element_user(NOTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(notifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "notifier" element
         */
        public org.apache.maven.pom.x400.Notifier insertNewNotifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Notifier target = null;
                target = (org.apache.maven.pom.x400.Notifier)get_store().insert_element_user(NOTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "notifier" element
         */
        public org.apache.maven.pom.x400.Notifier addNewNotifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Notifier target = null;
                target = (org.apache.maven.pom.x400.Notifier)get_store().add_element_user(NOTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "notifier" element
         */
        public void removeNotifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTIFIER$0, i);
            }
        }
    }
}
