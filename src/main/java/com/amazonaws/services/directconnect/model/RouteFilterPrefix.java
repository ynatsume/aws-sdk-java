/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * A route filter prefix that the customer can advertise through Border Gateway Protocol (BGP) over a public virtual interface.
 * </p>
 */
public class RouteFilterPrefix  implements Serializable  {

    /**
     * CIDR notation for the advertised route. Multiple routes are separated
     * by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     */
    private String cidr;

    /**
     * CIDR notation for the advertised route. Multiple routes are separated
     * by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     *
     * @return CIDR notation for the advertised route. Multiple routes are separated
     *         by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     */
    public String getCidr() {
        return cidr;
    }
    
    /**
     * CIDR notation for the advertised route. Multiple routes are separated
     * by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     *
     * @param cidr CIDR notation for the advertised route. Multiple routes are separated
     *         by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }
    
    /**
     * CIDR notation for the advertised route. Multiple routes are separated
     * by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidr CIDR notation for the advertised route. Multiple routes are separated
     *         by commas <p>Example: 10.10.10.0/24,10.10.11.0/24
     */
    public RouteFilterPrefix withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCidr() != null) sb.append("Cidr: " + getCidr() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RouteFilterPrefix == false) return false;
        RouteFilterPrefix other = (RouteFilterPrefix)obj;
        
        if (other.getCidr() == null ^ this.getCidr() == null) return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false) return false; 
        return true;
    }
    
}
    