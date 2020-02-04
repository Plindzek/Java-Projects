/**
 * 
 */
package io.github.plindzek;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Adam
 *
 */
@Entity
@Table(name = "Car")
public class Car {
    
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer id;
    private String name;
    private boolean lpgPowered;
    private double onOn100km;
    private double lpgOn100Km;
    private double pbOn100Km;

    /*
     * Hibernate needs this constructor
     */
    Car() {
    }

    @Override
    public String toString() {
	return "Car [" + name + "]";
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean isLpgPowered() { return lpgPowered; }

    public void setLpgPowered(boolean lpgPowered) { this.lpgPowered = lpgPowered; }

    public double getOnOn100km() { return onOn100km; }

    public void setOnOn100km(double onOn100km) { this.onOn100km = onOn100km; }

    public double getLpgOn100Km() { return lpgOn100Km; }

    public void setLpgOn100Km(double lpgOn100Km) { this.lpgOn100Km = lpgOn100Km; }

    public double getPbOn100Km() { return pbOn100Km; }

    public void setPbOn100Km(double pbOn100Km) { this.pbOn100Km = pbOn100Km; }

}