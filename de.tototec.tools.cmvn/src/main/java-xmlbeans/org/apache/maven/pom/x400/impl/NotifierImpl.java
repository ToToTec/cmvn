/*
 * XML Type:  Notifier
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.Notifier
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML Notifier(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class NotifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Notifier
{
    private static final long serialVersionUID = 1L;
    
    public NotifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "type");
    private static final javax.xml.namespace.QName SENDONERROR$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "sendOnError");
    private static final javax.xml.namespace.QName SENDONFAILURE$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "sendOnFailure");
    private static final javax.xml.namespace.QName SENDONSUCCESS$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "sendOnSuccess");
    private static final javax.xml.namespace.QName SENDONWARNING$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "sendOnWarning");
    private static final javax.xml.namespace.QName ADDRESS$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "address");
    private static final javax.xml.namespace.QName CONFIGURATION$12 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "configuration");
    
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "sendOnError" element
     */
    public boolean getSendOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONERROR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendOnError" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONERROR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "sendOnError" element
     */
    public boolean isSetSendOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDONERROR$2) != 0;
        }
    }
    
    /**
     * Sets the "sendOnError" element
     */
    public void setSendOnError(boolean sendOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDONERROR$2);
            }
            target.setBooleanValue(sendOnError);
        }
    }
    
    /**
     * Sets (as xml) the "sendOnError" element
     */
    public void xsetSendOnError(org.apache.xmlbeans.XmlBoolean sendOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDONERROR$2);
            }
            target.set(sendOnError);
        }
    }
    
    /**
     * Unsets the "sendOnError" element
     */
    public void unsetSendOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDONERROR$2, 0);
        }
    }
    
    /**
     * Gets the "sendOnFailure" element
     */
    public boolean getSendOnFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONFAILURE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendOnFailure" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendOnFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONFAILURE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "sendOnFailure" element
     */
    public boolean isSetSendOnFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDONFAILURE$4) != 0;
        }
    }
    
    /**
     * Sets the "sendOnFailure" element
     */
    public void setSendOnFailure(boolean sendOnFailure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONFAILURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDONFAILURE$4);
            }
            target.setBooleanValue(sendOnFailure);
        }
    }
    
    /**
     * Sets (as xml) the "sendOnFailure" element
     */
    public void xsetSendOnFailure(org.apache.xmlbeans.XmlBoolean sendOnFailure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONFAILURE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDONFAILURE$4);
            }
            target.set(sendOnFailure);
        }
    }
    
    /**
     * Unsets the "sendOnFailure" element
     */
    public void unsetSendOnFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDONFAILURE$4, 0);
        }
    }
    
    /**
     * Gets the "sendOnSuccess" element
     */
    public boolean getSendOnSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONSUCCESS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendOnSuccess" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendOnSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONSUCCESS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "sendOnSuccess" element
     */
    public boolean isSetSendOnSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDONSUCCESS$6) != 0;
        }
    }
    
    /**
     * Sets the "sendOnSuccess" element
     */
    public void setSendOnSuccess(boolean sendOnSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONSUCCESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDONSUCCESS$6);
            }
            target.setBooleanValue(sendOnSuccess);
        }
    }
    
    /**
     * Sets (as xml) the "sendOnSuccess" element
     */
    public void xsetSendOnSuccess(org.apache.xmlbeans.XmlBoolean sendOnSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONSUCCESS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDONSUCCESS$6);
            }
            target.set(sendOnSuccess);
        }
    }
    
    /**
     * Unsets the "sendOnSuccess" element
     */
    public void unsetSendOnSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDONSUCCESS$6, 0);
        }
    }
    
    /**
     * Gets the "sendOnWarning" element
     */
    public boolean getSendOnWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONWARNING$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendOnWarning" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendOnWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONWARNING$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "sendOnWarning" element
     */
    public boolean isSetSendOnWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDONWARNING$8) != 0;
        }
    }
    
    /**
     * Sets the "sendOnWarning" element
     */
    public void setSendOnWarning(boolean sendOnWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDONWARNING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDONWARNING$8);
            }
            target.setBooleanValue(sendOnWarning);
        }
    }
    
    /**
     * Sets (as xml) the "sendOnWarning" element
     */
    public void xsetSendOnWarning(org.apache.xmlbeans.XmlBoolean sendOnWarning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDONWARNING$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDONWARNING$8);
            }
            target.set(sendOnWarning);
        }
    }
    
    /**
     * Unsets the "sendOnWarning" element
     */
    public void unsetSendOnWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDONWARNING$8, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$10);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$10);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.maven.pom.x400.Notifier.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Notifier.Configuration target = null;
            target = (org.apache.maven.pom.x400.Notifier.Configuration)get_store().find_element_user(CONFIGURATION$12, 0);
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
            return get_store().count_elements(CONFIGURATION$12) != 0;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.maven.pom.x400.Notifier.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Notifier.Configuration target = null;
            target = (org.apache.maven.pom.x400.Notifier.Configuration)get_store().find_element_user(CONFIGURATION$12, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Notifier.Configuration)get_store().add_element_user(CONFIGURATION$12);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.maven.pom.x400.Notifier.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Notifier.Configuration target = null;
            target = (org.apache.maven.pom.x400.Notifier.Configuration)get_store().add_element_user(CONFIGURATION$12);
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
            get_store().remove_element(CONFIGURATION$12, 0);
        }
    }
    /**
     * An XML configuration(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.Notifier.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
