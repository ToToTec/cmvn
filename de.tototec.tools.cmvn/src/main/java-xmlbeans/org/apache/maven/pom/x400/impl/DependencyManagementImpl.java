/*
 * XML Type:  DependencyManagement
 * Namespace: http://maven.apache.org/POM/4.0.0
 * Java type: org.apache.maven.pom.x400.DependencyManagement
 *
 * Automatically generated - do not modify.
 */
package org.apache.maven.pom.x400.impl;
/**
 * An XML DependencyManagement(@http://maven.apache.org/POM/4.0.0).
 *
 * This is a complex type.
 */
public class DependencyManagementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.DependencyManagement
{
    private static final long serialVersionUID = 1L;
    
    public DependencyManagementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDENCIES$0 = 
        new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependencies");
    
    
    /**
     * Gets the "dependencies" element
     */
    public org.apache.maven.pom.x400.DependencyManagement.Dependencies getDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement.Dependencies target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement.Dependencies)get_store().find_element_user(DEPENDENCIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dependencies" element
     */
    public boolean isSetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENCIES$0) != 0;
        }
    }
    
    /**
     * Sets the "dependencies" element
     */
    public void setDependencies(org.apache.maven.pom.x400.DependencyManagement.Dependencies dependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement.Dependencies target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement.Dependencies)get_store().find_element_user(DEPENDENCIES$0, 0);
            if (target == null)
            {
                target = (org.apache.maven.pom.x400.DependencyManagement.Dependencies)get_store().add_element_user(DEPENDENCIES$0);
            }
            target.set(dependencies);
        }
    }
    
    /**
     * Appends and returns a new empty "dependencies" element
     */
    public org.apache.maven.pom.x400.DependencyManagement.Dependencies addNewDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.maven.pom.x400.DependencyManagement.Dependencies target = null;
            target = (org.apache.maven.pom.x400.DependencyManagement.Dependencies)get_store().add_element_user(DEPENDENCIES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dependencies" element
     */
    public void unsetDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENCIES$0, 0);
        }
    }
    /**
     * An XML dependencies(@http://maven.apache.org/POM/4.0.0).
     *
     * This is a complex type.
     */
    public static class DependenciesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.maven.pom.x400.DependencyManagement.Dependencies
    {
        private static final long serialVersionUID = 1L;
        
        public DependenciesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPENDENCY$0 = 
            new javax.xml.namespace.QName("http://maven.apache.org/POM/4.0.0", "dependency");
        
        
        /**
         * Gets array of all "dependency" elements
         */
        public org.apache.maven.pom.x400.Dependency[] getDependencyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPENDENCY$0, targetList);
                org.apache.maven.pom.x400.Dependency[] result = new org.apache.maven.pom.x400.Dependency[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency getDependencyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().find_element_user(DEPENDENCY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dependency" element
         */
        public int sizeOfDependencyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPENDENCY$0);
            }
        }
        
        /**
         * Sets array of all "dependency" element
         */
        public void setDependencyArray(org.apache.maven.pom.x400.Dependency[] dependencyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dependencyArray, DEPENDENCY$0);
            }
        }
        
        /**
         * Sets ith "dependency" element
         */
        public void setDependencyArray(int i, org.apache.maven.pom.x400.Dependency dependency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().find_element_user(DEPENDENCY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dependency);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency insertNewDependency(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().insert_element_user(DEPENDENCY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dependency" element
         */
        public org.apache.maven.pom.x400.Dependency addNewDependency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.maven.pom.x400.Dependency target = null;
                target = (org.apache.maven.pom.x400.Dependency)get_store().add_element_user(DEPENDENCY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dependency" element
         */
        public void removeDependency(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPENDENCY$0, i);
            }
        }
    }
}
