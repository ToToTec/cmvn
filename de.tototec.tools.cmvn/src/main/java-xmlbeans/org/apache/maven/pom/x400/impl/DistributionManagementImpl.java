/*
 * XML Type:  DistributionManagement
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.DistributionManagement
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML DistributionManagement(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class DistributionManagementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.DistributionManagement
{
    private static final long serialVersionUID = 1L;
    
    public DistributionManagementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPOSITORY$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "repository");
    private static final javax.xml.namespace.QName SNAPSHOTREPOSITORY$2 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "snapshotRepository");
    private static final javax.xml.namespace.QName SITE$4 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "site");
    private static final javax.xml.namespace.QName DOWNLOADURL$6 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "downloadUrl");
    private static final javax.xml.namespace.QName RELOCATION$8 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "relocation");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "status");
    
    
    /**
     * Gets the "repository" element
     */
    public org.apache.maven.pom.x400.DeploymentRepository getRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().find_element_user(REPOSITORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "repository" element
     */
    public boolean isSetRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPOSITORY$0) != 0;
        }
    }
    
    /**
     * Sets the "repository" element
     */
    public void setRepository(org.apache.maven.pom.x400.DeploymentRepository repository)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().find_element_user(REPOSITORY$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().add_element_user(REPOSITORY$0);
            }
            target.set(repository);
        }
    }
    
    /**
     * Appends and returns a new empty "repository" element
     */
    public org.apache.maven.pom.x400.DeploymentRepository addNewRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().add_element_user(REPOSITORY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "repository" element
     */
    public void unsetRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPOSITORY$0, 0);
        }
    }
    
    /**
     * Gets the "snapshotRepository" element
     */
    public org.apache.maven.pom.x400.DeploymentRepository getSnapshotRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().find_element_user(SNAPSHOTREPOSITORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "snapshotRepository" element
     */
    public boolean isSetSnapshotRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SNAPSHOTREPOSITORY$2) != 0;
        }
    }
    
    /**
     * Sets the "snapshotRepository" element
     */
    public void setSnapshotRepository(org.apache.maven.pom.x400.DeploymentRepository snapshotRepository)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().find_element_user(SNAPSHOTREPOSITORY$2, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().add_element_user(SNAPSHOTREPOSITORY$2);
            }
            target.set(snapshotRepository);
        }
    }
    
    /**
     * Appends and returns a new empty "snapshotRepository" element
     */
    public org.apache.maven.pom.x400.DeploymentRepository addNewSnapshotRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DeploymentRepository target = null;
            target = (org.apache.maven.pom.x400.DeploymentRepository)get_store().add_element_user(SNAPSHOTREPOSITORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "snapshotRepository" element
     */
    public void unsetSnapshotRepository()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SNAPSHOTREPOSITORY$2, 0);
        }
    }
    
    /**
     * Gets the "site" element
     */
    public org.apache.maven.pom.x400.Site getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Site target = null;
            target = (org.apache.maven.pom.x400.Site)get_store().find_element_user(SITE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "site" element
     */
    public boolean isSetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITE$4) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.apache.maven.pom.x400.Site site)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Site target = null;
            target = (org.apache.maven.pom.x400.Site)get_store().find_element_user(SITE$4, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Site)get_store().add_element_user(SITE$4);
            }
            target.set(site);
        }
    }
    
    /**
     * Appends and returns a new empty "site" element
     */
    public org.apache.maven.pom.x400.Site addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Site target = null;
            target = (org.apache.maven.pom.x400.Site)get_store().add_element_user(SITE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "site" element
     */
    public void unsetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITE$4, 0);
        }
    }
    
    /**
     * Gets the "downloadUrl" element
     */
    public java.lang.String getDownloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOWNLOADURL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "downloadUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetDownloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOWNLOADURL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "downloadUrl" element
     */
    public boolean isSetDownloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOWNLOADURL$6) != 0;
        }
    }
    
    /**
     * Sets the "downloadUrl" element
     */
    public void setDownloadUrl(java.lang.String downloadUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOWNLOADURL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOWNLOADURL$6);
            }
            target.setStringValue(downloadUrl);
        }
    }
    
    /**
     * Sets (as xml) the "downloadUrl" element
     */
    public void xsetDownloadUrl(org.apache.xmlbeans.XmlString downloadUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOWNLOADURL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOWNLOADURL$6);
            }
            target.set(downloadUrl);
        }
    }
    
    /**
     * Unsets the "downloadUrl" element
     */
    public void unsetDownloadUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOWNLOADURL$6, 0);
        }
    }
    
    /**
     * Gets the "relocation" element
     */
    public org.apache.maven.pom.x400.Relocation getRelocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Relocation target = null;
            target = (org.apache.maven.pom.x400.Relocation)get_store().find_element_user(RELOCATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relocation" element
     */
    public boolean isSetRelocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELOCATION$8) != 0;
        }
    }
    
    /**
     * Sets the "relocation" element
     */
    public void setRelocation(org.apache.maven.pom.x400.Relocation relocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Relocation target = null;
            target = (org.apache.maven.pom.x400.Relocation)get_store().find_element_user(RELOCATION$8, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Relocation)get_store().add_element_user(RELOCATION$8);
            }
            target.set(relocation);
        }
    }
    
    /**
     * Appends and returns a new empty "relocation" element
     */
    public org.apache.maven.pom.x400.Relocation addNewRelocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Relocation target = null;
            target = (org.apache.maven.pom.x400.Relocation)get_store().add_element_user(RELOCATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "relocation" element
     */
    public void unsetRelocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELOCATION$8, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$10);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$10, 0);
        }
    }
}
