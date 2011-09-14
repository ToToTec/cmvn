/*
 * XML Type:  ActivationOS
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ActivationOS
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML ActivationOS(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ActivationOSImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ActivationOS
{
    private static final long serialVersionUID = 1L;
    
    public ActivationOSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "name");
    private static final javax.xml.namespace.QName FAMILY$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "family");
    private static final javax.xml.namespace.QName ARCH$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "arch");
    private static final javax.xml.namespace.QName VERSION$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "version");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "family" element
     */
    public java.lang.String getFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "family" element
     */
    public org.apache.xmlbeans.XmlString xgetFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAMILY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "family" element
     */
    public boolean isSetFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$2) != 0;
        }
    }
    
    /**
     * Sets the "family" element
     */
    public void setFamily(java.lang.String family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAMILY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAMILY$2);
            }
            target.setStringValue(family);
        }
    }
    
    /**
     * Sets (as xml) the "family" element
     */
    public void xsetFamily(org.apache.xmlbeans.XmlString family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAMILY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAMILY$2);
            }
            target.set(family);
        }
    }
    
    /**
     * Unsets the "family" element
     */
    public void unsetFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$2, 0);
        }
    }
    
    /**
     * Gets the "arch" element
     */
    public java.lang.String getArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arch" element
     */
    public org.apache.xmlbeans.XmlString xgetArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCH$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "arch" element
     */
    public boolean isSetArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCH$4) != 0;
        }
    }
    
    /**
     * Sets the "arch" element
     */
    public void setArch(java.lang.String arch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCH$4);
            }
            target.setStringValue(arch);
        }
    }
    
    /**
     * Sets (as xml) the "arch" element
     */
    public void xsetArch(org.apache.xmlbeans.XmlString arch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARCH$4);
            }
            target.set(arch);
        }
    }
    
    /**
     * Unsets the "arch" element
     */
    public void unsetArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCH$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
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
            return get_store().count_elements(VERSION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$6);
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
            get_store().remove_element(VERSION$6, 0);
        }
    }
}
