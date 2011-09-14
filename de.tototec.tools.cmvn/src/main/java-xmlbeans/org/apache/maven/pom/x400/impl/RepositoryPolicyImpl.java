/*
 * XML Type:  RepositoryPolicy
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.RepositoryPolicy
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML RepositoryPolicy(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class RepositoryPolicyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.RepositoryPolicy
{
    private static final long serialVersionUID = 1L;
    
    public RepositoryPolicyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENABLED$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "enabled");
    private static final javax.xml.namespace.QName UPDATEPOLICY$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "updatePolicy");
    private static final javax.xml.namespace.QName CHECKSUMPOLICY$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "checksumPolicy");
    
    
    /**
     * Gets the "enabled" element
     */
    public boolean getEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "enabled" element
     */
    public boolean isSetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLED$0) != 0;
        }
    }
    
    /**
     * Sets the "enabled" element
     */
    public void setEnabled(boolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLED$0);
            }
            target.setBooleanValue(enabled);
        }
    }
    
    /**
     * Sets (as xml) the "enabled" element
     */
    public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENABLED$0);
            }
            target.set(enabled);
        }
    }
    
    /**
     * Unsets the "enabled" element
     */
    public void unsetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLED$0, 0);
        }
    }
    
    /**
     * Gets the "updatePolicy" element
     */
    public java.lang.String getUpdatePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEPOLICY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "updatePolicy" element
     */
    public org.apache.xmlbeans.XmlString xgetUpdatePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATEPOLICY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "updatePolicy" element
     */
    public boolean isSetUpdatePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATEPOLICY$2) != 0;
        }
    }
    
    /**
     * Sets the "updatePolicy" element
     */
    public void setUpdatePolicy(java.lang.String updatePolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATEPOLICY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATEPOLICY$2);
            }
            target.setStringValue(updatePolicy);
        }
    }
    
    /**
     * Sets (as xml) the "updatePolicy" element
     */
    public void xsetUpdatePolicy(org.apache.xmlbeans.XmlString updatePolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UPDATEPOLICY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UPDATEPOLICY$2);
            }
            target.set(updatePolicy);
        }
    }
    
    /**
     * Unsets the "updatePolicy" element
     */
    public void unsetUpdatePolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATEPOLICY$2, 0);
        }
    }
    
    /**
     * Gets the "checksumPolicy" element
     */
    public java.lang.String getChecksumPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKSUMPOLICY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "checksumPolicy" element
     */
    public org.apache.xmlbeans.XmlString xgetChecksumPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKSUMPOLICY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "checksumPolicy" element
     */
    public boolean isSetChecksumPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKSUMPOLICY$4) != 0;
        }
    }
    
    /**
     * Sets the "checksumPolicy" element
     */
    public void setChecksumPolicy(java.lang.String checksumPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKSUMPOLICY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKSUMPOLICY$4);
            }
            target.setStringValue(checksumPolicy);
        }
    }
    
    /**
     * Sets (as xml) the "checksumPolicy" element
     */
    public void xsetChecksumPolicy(org.apache.xmlbeans.XmlString checksumPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHECKSUMPOLICY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHECKSUMPOLICY$4);
            }
            target.set(checksumPolicy);
        }
    }
    
    /**
     * Unsets the "checksumPolicy" element
     */
    public void unsetChecksumPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKSUMPOLICY$4, 0);
        }
    }
}
