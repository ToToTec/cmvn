/*
 * XML Type:  Prerequisites
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Prerequisites
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Prerequisites(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class PrerequisitesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Prerequisites
{
    private static final long serialVersionUID = 1L;
    
    public PrerequisitesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAVEN$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "maven");
    
    
    /**
     * Gets the "maven" element
     */
    public java.lang.String getMaven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAVEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maven" element
     */
    public org.apache.xmlbeans.XmlString xgetMaven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAVEN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "maven" element
     */
    public boolean isSetMaven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAVEN$0) != 0;
        }
    }
    
    /**
     * Sets the "maven" element
     */
    public void setMaven(java.lang.String maven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAVEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAVEN$0);
            }
            target.setStringValue(maven);
        }
    }
    
    /**
     * Sets (as xml) the "maven" element
     */
    public void xsetMaven(org.apache.xmlbeans.XmlString maven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAVEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAVEN$0);
            }
            target.set(maven);
        }
    }
    
    /**
     * Unsets the "maven" element
     */
    public void unsetMaven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAVEN$0, 0);
        }
    }
}
