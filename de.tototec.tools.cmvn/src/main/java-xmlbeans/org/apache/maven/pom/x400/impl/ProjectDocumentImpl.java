/*
 * An XML document type.
 * Localname: project
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.ProjectDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * A document containing one project(@http://maven.apache.org/POM/4.0.0) element.
 *
 * This is a complex type.
 */
public class ProjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.ProjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECT$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "project");
    
    
    /**
     * Gets the "project" element
     */
    public org.apache.maven.pom.x400.Model getProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model target = null;
            target = (org.apache.maven.pom.x400.Model)get_store().find_element_user(PROJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "project" element
     */
    public void setProject(org.apache.maven.pom.x400.Model project)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model target = null;
            target = (org.apache.maven.pom.x400.Model)get_store().find_element_user(PROJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.Model)get_store().add_element_user(PROJECT$0);
            }
            target.set(project);
        }
    }
    
    /**
     * Appends and returns a new empty "project" element
     */
    public org.apache.maven.pom.x400.Model addNewProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.Model target = null;
            target = (org.apache.maven.pom.x400.Model)get_store().add_element_user(PROJECT$0);
            return target;
        }
    }
}
