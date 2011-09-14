/*
 * XML Type:  ActivationFile
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ActivationFile
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML ActivationFile(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ActivationFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ActivationFile
{
    private static final long serialVersionUID = 1L;
    
    public ActivationFileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISSING$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "missing");
    private static final javax.xml.namespace.QName EXISTS$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "exists");
    
    
    /**
     * Gets the "missing" element
     */
    public java.lang.String getMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "missing" element
     */
    public org.apache.xmlbeans.XmlString xgetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSING$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "missing" element
     */
    public boolean isSetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSING$0) != 0;
        }
    }
    
    /**
     * Sets the "missing" element
     */
    public void setMissing(java.lang.String missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSING$0);
            }
            target.setStringValue(missing);
        }
    }
    
    /**
     * Sets (as xml) the "missing" element
     */
    public void xsetMissing(org.apache.xmlbeans.XmlString missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MISSING$0);
            }
            target.set(missing);
        }
    }
    
    /**
     * Unsets the "missing" element
     */
    public void unsetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSING$0, 0);
        }
    }
    
    /**
     * Gets the "exists" element
     */
    public java.lang.String getExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "exists" element
     */
    public org.apache.xmlbeans.XmlString xgetExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "exists" element
     */
    public boolean isSetExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXISTS$2) != 0;
        }
    }
    
    /**
     * Sets the "exists" element
     */
    public void setExists(java.lang.String exists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTS$2);
            }
            target.setStringValue(exists);
        }
    }
    
    /**
     * Sets (as xml) the "exists" element
     */
    public void xsetExists(org.apache.xmlbeans.XmlString exists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXISTS$2);
            }
            target.set(exists);
        }
    }
    
    /**
     * Unsets the "exists" element
     */
    public void unsetExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXISTS$2, 0);
        }
    }
}
