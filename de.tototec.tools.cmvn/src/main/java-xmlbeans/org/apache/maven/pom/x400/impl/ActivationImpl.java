/*
 * XML Type:  Activation
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Activation
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Activation(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class ActivationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Activation
{
    private static final long serialVersionUID = 1L;
    
    public ActivationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVEBYDEFAULT$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "activeByDefault");
    private static final javax.xml.namespace.QName JDK$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "jdk");
    private static final javax.xml.namespace.QName OS$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "os");
    private static final javax.xml.namespace.QName PROPERTY$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "property");
    private static final javax.xml.namespace.QName FILE$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "file");
    
    
    /**
     * Gets the "activeByDefault" element
     */
    public boolean getActiveByDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVEBYDEFAULT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "activeByDefault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetActiveByDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVEBYDEFAULT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "activeByDefault" element
     */
    public boolean isSetActiveByDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVEBYDEFAULT$0) != 0;
        }
    }
    
    /**
     * Sets the "activeByDefault" element
     */
    public void setActiveByDefault(boolean activeByDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVEBYDEFAULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVEBYDEFAULT$0);
            }
            target.setBooleanValue(activeByDefault);
        }
    }
    
    /**
     * Sets (as xml) the "activeByDefault" element
     */
    public void xsetActiveByDefault(org.apache.xmlbeans.XmlBoolean activeByDefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVEBYDEFAULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVEBYDEFAULT$0);
            }
            target.set(activeByDefault);
        }
    }
    
    /**
     * Unsets the "activeByDefault" element
     */
    public void unsetActiveByDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVEBYDEFAULT$0, 0);
        }
    }
    
    /**
     * Gets the "jdk" element
     */
    public java.lang.String getJdk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JDK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "jdk" element
     */
    public org.apache.xmlbeans.XmlString xgetJdk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JDK$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "jdk" element
     */
    public boolean isSetJdk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JDK$2) != 0;
        }
    }
    
    /**
     * Sets the "jdk" element
     */
    public void setJdk(java.lang.String jdk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JDK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JDK$2);
            }
            target.setStringValue(jdk);
        }
    }
    
    /**
     * Sets (as xml) the "jdk" element
     */
    public void xsetJdk(org.apache.xmlbeans.XmlString jdk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JDK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JDK$2);
            }
            target.set(jdk);
        }
    }
    
    /**
     * Unsets the "jdk" element
     */
    public void unsetJdk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JDK$2, 0);
        }
    }
    
    /**
     * Gets the "os" element
     */
    public org.apache.maven.pom.x400.ActivationOS getOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationOS target = null;
            target = (org.apache.maven.pom.x400.ActivationOS)get_store().find_element_user(OS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "os" element
     */
    public boolean isSetOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OS$4) != 0;
        }
    }
    
    /**
     * Sets the "os" element
     */
    public void setOs(org.apache.maven.pom.x400.ActivationOS os)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationOS target = null;
            target = (org.apache.maven.pom.x400.ActivationOS)get_store().find_element_user(OS$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ActivationOS)get_store().add_element_user(OS$4);
            }
            target.set(os);
        }
    }
    
    /**
     * Appends and returns a new empty "os" element
     */
    public org.apache.maven.pom.x400.ActivationOS addNewOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationOS target = null;
            target = (org.apache.maven.pom.x400.ActivationOS)get_store().add_element_user(OS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "os" element
     */
    public void unsetOs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OS$4, 0);
        }
    }
    
    /**
     * Gets the "property" element
     */
    public org.apache.maven.pom.x400.ActivationProperty getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationProperty target = null;
            target = (org.apache.maven.pom.x400.ActivationProperty)get_store().find_element_user(PROPERTY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "property" element
     */
    public boolean isSetProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$6) != 0;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(org.apache.maven.pom.x400.ActivationProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationProperty target = null;
            target = (org.apache.maven.pom.x400.ActivationProperty)get_store().find_element_user(PROPERTY$6, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ActivationProperty)get_store().add_element_user(PROPERTY$6);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public org.apache.maven.pom.x400.ActivationProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationProperty target = null;
            target = (org.apache.maven.pom.x400.ActivationProperty)get_store().add_element_user(PROPERTY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "property" element
     */
    public void unsetProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$6, 0);
        }
    }
    
    /**
     * Gets the "file" element
     */
    public org.apache.maven.pom.x400.ActivationFile getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationFile target = null;
            target = (org.apache.maven.pom.x400.ActivationFile)get_store().find_element_user(FILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "file" element
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILE$8) != 0;
        }
    }
    
    /**
     * Sets the "file" element
     */
    public void setFile(org.apache.maven.pom.x400.ActivationFile file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationFile target = null;
            target = (org.apache.maven.pom.x400.ActivationFile)get_store().find_element_user(FILE$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.ActivationFile)get_store().add_element_user(FILE$8);
            }
            target.set(file);
        }
    }
    
    /**
     * Appends and returns a new empty "file" element
     */
    public org.apache.maven.pom.x400.ActivationFile addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.ActivationFile target = null;
            target = (org.apache.maven.pom.x400.ActivationFile)get_store().add_element_user(FILE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "file" element
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILE$8, 0);
        }
    }
}
