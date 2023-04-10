import javax.xml.bind.annotation.*;

@XmlRootElement(name="socio")
@XmlType(propOrder = {"nombreSocio","direccion","fechaAlta" })
@XmlAccessorType(XmlAccessType.FIELD)

public class Socio {
    @XmlAttribute(name = "id", required = true)
    private Integer id;
    @XmlElement(name="nombre")
    private String nombreSocio;
    private String direccion;
    @XmlElement(name="alta")
    private String fechaAlta;

    public Socio() {

    }

    public Socio(Integer id, String nombreSocio, String direccion, String fechaAlta) {
        this.id = id;
        this.nombreSocio = nombreSocio;
        this.direccion = direccion;
        this.fechaAlta = fechaAlta;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreSocio() {
        return this.nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "{" +
                " identificacion='" + getId() + "'" +
                ", nombreSocio='" + getNombreSocio() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", fechaAlta='" + getFechaAlta() + "'" +
                "}";
    }

}