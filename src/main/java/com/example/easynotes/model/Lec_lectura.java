package com.example.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "LEC_LECTURA")
public class Lec_lectura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  IDLECTURA;
    public Long getIDLECTURA()
    {
        return this.IDLECTURA;
    }
    public void setIDLECTURA(Long value)
    {
        this.IDLECTURA = value;
    }

    private String  COD_UNICOM;
    public String getCOD_UNICOM()
    {
        return this.COD_UNICOM;
    }
    public void setCOD_UNICOM(String value)
    {
        this.COD_UNICOM = value;
    }

    private Integer  ANNO;
    public Integer getANNO()
    {
        return this.ANNO;
    }
    public void setANNO(Integer value)
    {
        this.ANNO = value;
    }

    private Integer  MES;
    public Integer getMES()
    {
        return this.MES;
    }
    public void setMES(Integer value)
    {
        this.MES = value;
    }

    private Integer  CICLO_FACT;
    public Integer getCICLO_FACT()
    {
        return this.CICLO_FACT;
    }
    public void setCICLO_FACT(Integer value)
    {
        this.CICLO_FACT = value;
    }

    private Integer  ID_RUTA;
    public Integer getID_RUTA()
    {
        return this.ID_RUTA;
    }
    public void setID_RUTA(Integer value)
    {
        this.ID_RUTA = value;
    }

    private Integer  NUM_ITIN;
    public Integer getNUM_ITIN()
    {
        return this.NUM_ITIN;
    }
    public void setNUM_ITIN(Integer value)
    {
        this.NUM_ITIN = value;
    }

    private Integer  AOL;
    public Integer getAOL()
    {
        return this.AOL;
    }
    public void setAOL(Integer value)
    {
        this.AOL = value;
    }

    private String  NOM_RAZ_SO;
    public String getNOM_RAZ_SO()
    {
        return this.NOM_RAZ_SO;
    }
    public void setNOM_RAZ_SO(String value)
    {
        this.NOM_RAZ_SO = value;
    }

    private String  NOM_LOCAL;
    public String getNOM_LOCAL()
    {
        return this.NOM_LOCAL;
    }
    public void setNOM_LOCAL(String value)
    {
        this.NOM_LOCAL = value;
    }

    private String  NOM_CALLE;
    public String getNOM_CALLE()
    {
        return this.NOM_CALLE;
    }
    public void setNOM_CALLE(String value)
    {
        this.NOM_CALLE = value;
    }

    private String  COMPL_DIR;
    public String getCOMPL_DIR()
    {
        return this.COMPL_DIR;
    }
    public void setCOMPL_DIR(String value)
    {
        this.COMPL_DIR = value;
    }

    private String  COD_MUNIC;
    public String getCOD_MUNIC()
    {
        return this.COD_MUNIC;
    }
    public void setCOD_MUNIC(String value)
    {
        this.COD_MUNIC = value;
    }

    private String  MZ_LT;
    public String getMZ_LT()
    {
        return this.MZ_LT;
    }
    public void setMZ_LT(String value)
    {
        this.MZ_LT = value;
    }

    private String  CGV;
    public String getCGV()
    {
        return this.CGV;
    }
    public void setCGV(String value)
    {
        this.CGV = value;
    }

    private String  ACC_PREDIO;
    public String getACC_PREDIO()
    {
        return this.ACC_PREDIO;
    }
    public void setACC_PREDIO(String value)
    {
        this.ACC_PREDIO = value;
    }

    private String  ACC_CAJA;
    public String getACC_CAJA()
    {
        return this.ACC_CAJA;
    }
    public void setACC_CAJA(String value)
    {
        this.ACC_CAJA = value;
    }

    private String  NUM_APA;
    public String getNUM_APA()
    {
        return this.NUM_APA;
    }
    public void setNUM_APA(String value)
    {
        this.NUM_APA = value;
    }

    private Integer  LECT_ANT;
    public Integer getLECT_ANT()
    {
        return this.LECT_ANT;
    }
    public void setLECT_ANT(Integer value)
    {
        this.LECT_ANT = value;
    }

    private Integer  NUM_RUE;
    public Integer getNUM_RUE()
    {
        return this.NUM_RUE;
    }
    public void setNUM_RUE(Integer value)
    {
        this.NUM_RUE = value;
    }

    private String  COD_TAR;
    public String getCOD_TAR()
    {
        return this.COD_TAR;
    }
    public void setCOD_TAR(String value)
    {
        this.COD_TAR = value;
    }

    private String  NIS;
    public String getNIS()
    {
        return this.NIS;
    }
    public void setNIS(String value)
    {
        this.NIS = value;
    }

    private String  COD_CNAE;
    public String getCOD_CNAE()
    {
        return this.COD_CNAE;
    }
    public void setCOD_CNAE(String value)
    {
        this.COD_CNAE = value;
    }

    private String  NUM_APA_OB;
    public String getNUM_APA_OB()
    {
        return this.NUM_APA_OB;
    }
    public void setNUM_APA_OB(String value)
    {
        this.NUM_APA_OB = value;
    }

    private String  OBS;
    public String getOBS()
    {
        return this.OBS;
    }
    public void setOBS(String value)
    {
        this.OBS = value;
    }

    private Integer  LECT;
    public Integer getLECT()
    {
        return this.LECT;
    }
    public void setLECT(Integer value)
    {
        this.LECT = value;
    }

    private String  INC_1;
    public String getINC_1()
    {
        return this.INC_1;
    }
    public void setINC_1(String value)
    {
        this.INC_1 = value;
    }

    private String  DET_1;
    public String getDET_1()
    {
        return this.DET_1;
    }
    public void setDET_1(String value)
    {
        this.DET_1 = value;
    }

    private byte[]  DET_1_FOTO;
    public byte[] getDET_1_FOTO()
    {
        return this.DET_1_FOTO;
    }
    public void setDET_1_FOTO(byte[] value)
    {
        this.DET_1_FOTO = value;
    }

    private String  INC_2;
    public String getINC_2()
    {
        return this.INC_2;
    }
    public void setINC_2(String value)
    {
        this.INC_2 = value;
    }

    private String  DET_2;
    public String getDET_2()
    {
        return this.DET_2;
    }
    public void setDET_2(String value)
    {
        this.DET_2 = value;
    }

    private byte[]  DET_2_FOTO;
    public byte[] getDET_2_FOTO()
    {
        return this.DET_2_FOTO;
    }
    public void setDET_2_FOTO(byte[] value)
    {
        this.DET_2_FOTO = value;
    }

    private String  INC_3;
    public String getINC_3()
    {
        return this.INC_3;
    }
    public void setINC_3(String value)
    {
        this.INC_3 = value;
    }

    private String  DET_3;
    public String getDET_3()
    {
        return this.DET_3;
    }
    public void setDET_3(String value)
    {
        this.DET_3 = value;
    }

    private byte[]  DET_3_FOTO;
    public byte[] getDET_3_FOTO()
    {
        return this.DET_3_FOTO;
    }
    public void setDET_3_FOTO(byte[] value)
    {
        this.DET_3_FOTO = value;
    }

    private java.sql.Date  FECHA_LECTURA;
    public java.sql.Date getFECHA_LECTURA()
    {
        return this.FECHA_LECTURA;
    }
    public void setFECHA_LECTURA(java.sql.Date value)
    {
        this.FECHA_LECTURA = value;
    }

    private String  COD_LECTOR;
    public String getCOD_LECTOR()
    {
        return this.COD_LECTOR;
    }
    public void setCOD_LECTOR(String value)
    {
        this.COD_LECTOR = value;
    }

    private String  MEDIO;
    public String getMEDIO()
    {
        return this.MEDIO;
    }
    public void setMEDIO(String value)
    {
        this.MEDIO = value;
    }

    private String  TIP_LECTURA;
    public String getTIP_LECTURA()
    {
        return this.TIP_LECTURA;
    }
    public void setTIP_LECTURA(String value)
    {
        this.TIP_LECTURA = value;
    }

    private String  FL_MIGRACION;
    public String getFL_MIGRACION()
    {
        return this.FL_MIGRACION;
    }
    public void setFL_MIGRACION(String value)
    {
        this.FL_MIGRACION = value;
    }

    private java.sql.Date  FEC_ASIGNACION;
    public java.sql.Date getFEC_ASIGNACION()
    {
        return this.FEC_ASIGNACION;
    }
    public void setFEC_ASIGNACION(java.sql.Date value)
    {
        this.FEC_ASIGNACION = value;
    }

    private Integer  ORDEN_ASIGNACION;
    public Integer getORDEN_ASIGNACION()
    {
        return this.ORDEN_ASIGNACION;
    }
    public void setORDEN_ASIGNACION(Integer value)
    {
        this.ORDEN_ASIGNACION = value;
    }

    private String  FL_NEXTEL;
    public String getFL_NEXTEL()
    {
        return this.FL_NEXTEL;
    }
    public void setFL_NEXTEL(String value)
    {
        this.FL_NEXTEL = value;
    }

    private Integer  COD_OBS;
    public Integer getCOD_OBS()
    {
        return this.COD_OBS;
    }
    public void setCOD_OBS(Integer value)
    {
        this.COD_OBS = value;
    }

    private Integer  ESTADO;
    public Integer getESTADO()
    {
        return this.ESTADO;
    }
    public void setESTADO(Integer value)
    {
        this.ESTADO = value;
    }

    private Integer  NUM_CORREL_AIM;
    public Integer getNUM_CORREL_AIM()
    {
        return this.NUM_CORREL_AIM;
    }
    public void setNUM_CORREL_AIM(Integer value)
    {
        this.NUM_CORREL_AIM = value;
    }

    private Integer  LECT_ENVIADA;
    public Integer getLECT_ENVIADA()
    {
        return this.LECT_ENVIADA;
    }
    public void setLECT_ENVIADA(Integer value)
    {
        this.LECT_ENVIADA = value;
    }

    private Integer  orden_excel;
    public Integer getorden_excel()
    {
        return this.orden_excel;
    }
    public void setorden_excel(Integer value)
    {
        this.orden_excel = value;
    }

    private Integer  FL_SP;
    public Integer getFL_SP()
    {
        return this.FL_SP;
    }
    public void setFL_SP(Integer value)
    {
        this.FL_SP = value;
    }

    private String  SD_COD_CNAE;
    public String getSD_COD_CNAE()
    {
        return this.SD_COD_CNAE;
    }
    public void setSD_COD_CNAE(String value)
    {
        this.SD_COD_CNAE = value;
    }

    private String  SD_NUM_APA_OB;
    public String getSD_NUM_APA_OB()
    {
        return this.SD_NUM_APA_OB;
    }
    public void setSD_NUM_APA_OB(String value)
    {
        this.SD_NUM_APA_OB = value;
    }

    private String  SD_OBS;
    public String getSD_OBS()
    {
        return this.SD_OBS;
    }
    public void setSD_OBS(String value)
    {
        this.SD_OBS = value;
    }

    private Integer  SD_LECT;
    public Integer getSD_LECT()
    {
        return this.SD_LECT;
    }
    public void setSD_LECT(Integer value)
    {
        this.SD_LECT = value;
    }

    private String  SD_INC_1;
    public String getSD_INC_1()
    {
        return this.SD_INC_1;
    }
    public void setSD_INC_1(String value)
    {
        this.SD_INC_1 = value;
    }

    private String  SD_DET_1;
    public String getSD_DET_1()
    {
        return this.SD_DET_1;
    }
    public void setSD_DET_1(String value)
    {
        this.SD_DET_1 = value;
    }

    private byte[]  SD_DET_1_FOTO;
    public byte[] getSD_DET_1_FOTO()
    {
        return this.SD_DET_1_FOTO;
    }
    public void setSD_DET_1_FOTO(byte[] value)
    {
        this.SD_DET_1_FOTO = value;
    }

    private String  SD_INC_2;
    public String getSD_INC_2()
    {
        return this.SD_INC_2;
    }
    public void setSD_INC_2(String value)
    {
        this.SD_INC_2 = value;
    }

    private String  SD_DET_2;
    public String getSD_DET_2()
    {
        return this.SD_DET_2;
    }
    public void setSD_DET_2(String value)
    {
        this.SD_DET_2 = value;
    }

    private byte[]  SD_DET_2_FOTO;
    public byte[] getSD_DET_2_FOTO()
    {
        return this.SD_DET_2_FOTO;
    }
    public void setSD_DET_2_FOTO(byte[] value)
    {
        this.SD_DET_2_FOTO = value;
    }

    private String  SD_INC_3;
    public String getSD_INC_3()
    {
        return this.SD_INC_3;
    }
    public void setSD_INC_3(String value)
    {
        this.SD_INC_3 = value;
    }

    private String  SD_DET_3;
    public String getSD_DET_3()
    {
        return this.SD_DET_3;
    }
    public void setSD_DET_3(String value)
    {
        this.SD_DET_3 = value;
    }

    private byte[]  SD_DET_3_FOTO;
    public byte[] getSD_DET_3_FOTO()
    {
        return this.SD_DET_3_FOTO;
    }
    public void setSD_DET_3_FOTO(byte[] value)
    {
        this.SD_DET_3_FOTO = value;
    }

    private java.sql.Date  SD_FECHA_LECTURA;
    public java.sql.Date getSD_FECHA_LECTURA()
    {
        return this.SD_FECHA_LECTURA;
    }
    public void setSD_FECHA_LECTURA(java.sql.Date value)
    {
        this.SD_FECHA_LECTURA = value;
    }

    private String  SD_COD_LECTOR;
    public String getSD_COD_LECTOR()
    {
        return this.SD_COD_LECTOR;
    }
    public void setSD_COD_LECTOR(String value)
    {
        this.SD_COD_LECTOR = value;
    }

    private String  SD_MEDIO;
    public String getSD_MEDIO()
    {
        return this.SD_MEDIO;
    }
    public void setSD_MEDIO(String value)
    {
        this.SD_MEDIO = value;
    }

    private Integer  SD_COD_OBS;
    public Integer getSD_COD_OBS()
    {
        return this.SD_COD_OBS;
    }
    public void setSD_COD_OBS(Integer value)
    {
        this.SD_COD_OBS = value;
    }

    private Integer  SD_NUM_CORREL_AIM;
    public Integer getSD_NUM_CORREL_AIM()
    {
        return this.SD_NUM_CORREL_AIM;
    }
    public void setSD_NUM_CORREL_AIM(Integer value)
    {
        this.SD_NUM_CORREL_AIM = value;
    }

    private byte[]  FOTO;
    public byte[] getFOTO()
    {
        return this.FOTO;
    }
    public void setFOTO(byte[] value)
    {
        this.FOTO = value;
    }

    @org.springframework.lang.Nullable
    private Integer  CONSUMO;
    public Integer getCONSUMO()
    {
        return this.CONSUMO;
    }
    public void setCONSUMO(Integer value)
    {
        this.CONSUMO = value;
    }

    private Integer  SD_LECT_ANT;
    public Integer getSD_LECT_ANT()
    {
        return this.SD_LECT_ANT;
    }
    public void setSD_LECT_ANT(Integer value)
    {
        this.SD_LECT_ANT = value;
    }

    private String  CUP;
    public String getCUP()
    {
        return this.CUP;
    }
    public void setCUP(String value)
    {
        this.CUP = value;
    }

    private String  SECTOR;
    public String getSECTOR()
    {
        return this.SECTOR;
    }
    public void setSECTOR(String value)
    {
        this.SECTOR = value;
    }

    private Integer  PROMEDIO;
    public Integer getPROMEDIO()
    {
        return this.PROMEDIO;
    }
    public void setPROMEDIO(Integer value)
    {
        this.PROMEDIO = value;
    }

    private String  DIG_USUARIO;
    public String getDIG_USUARIO()
    {
        return this.DIG_USUARIO;
    }
    public void setDIG_USUARIO(String value)
    {
        this.DIG_USUARIO = value;
    }

    private java.sql.Date  DIG_FECHA;
    public java.sql.Date getDIG_FECHA()
    {
        return this.DIG_FECHA;
    }
    public void setDIG_FECHA(java.sql.Date value)
    {
        this.DIG_FECHA = value;
    }

    private String  NOM_DIGIT_AIL;
    public String getNOM_DIGIT_AIL()
    {
        return this.NOM_DIGIT_AIL;
    }
    public void setNOM_DIGIT_AIL(String value)
    {
        this.NOM_DIGIT_AIL = value;
    }

    private String  NUM_ACT_INC;
    public String getNUM_ACT_INC()
    {
        return this.NUM_ACT_INC;
    }
    public void setNUM_ACT_INC(String value)
    {
        this.NUM_ACT_INC = value;
    }

    private String  SD_NUM_ACT_INC;
    public String getSD_NUM_ACT_INC()
    {
        return this.SD_NUM_ACT_INC;
    }
    public void setSD_NUM_ACT_INC(String value)
    {
        this.SD_NUM_ACT_INC = value;
    }

    private Integer  FLG_VALORIZA_LECTURA;
    public Integer getFLG_VALORIZA_LECTURA()
    {
        return this.FLG_VALORIZA_LECTURA;
    }
    public void setFLG_VALORIZA_LECTURA(Integer value)
    {
        this.FLG_VALORIZA_LECTURA = value;
    }

    private String  ASIG_USUARIO;
    public String getASIG_USUARIO()
    {
        return this.ASIG_USUARIO;
    }
    public void setASIG_USUARIO(String value)
    {
        this.ASIG_USUARIO = value;
    }

    private java.sql.Date  ASIG_FECHA;
    public java.sql.Date getASIG_FECHA()
    {
        return this.ASIG_FECHA;
    }
    public void setASIG_FECHA(java.sql.Date value)
    {
        this.ASIG_FECHA = value;
    }

    private Integer  ID_ASIGNACION;
    public Integer getID_ASIGNACION()
    {
        return this.ID_ASIGNACION;
    }
    public void setID_ASIGNACION(Integer value)
    {
        this.ID_ASIGNACION = value;
    }

    private Integer  COD_LECTOR_T;
    public Integer getCOD_LECTOR_T()
    {
        return this.COD_LECTOR_T;
    }
    public void setCOD_LECTOR_T(Integer value)
    {
        this.COD_LECTOR_T = value;
    }

    private BigDecimal  DIST_RUTA;
    public BigDecimal getDIST_RUTA()
    {
        return this.DIST_RUTA;
    }
    public void setDIST_RUTA(BigDecimal value)
    {
        this.DIST_RUTA = value;
    }

    private BigDecimal  CONV_PTO_LOTE_X;
    public BigDecimal getCONV_PTO_LOTE_X()
    {
        return this.CONV_PTO_LOTE_X;
    }
    public void setCONV_PTO_LOTE_X(BigDecimal value)
    {
        this.CONV_PTO_LOTE_X = value;
    }

    private BigDecimal  CONV_PTO_LOTE_Y;
    public BigDecimal getCONV_PTO_LOTE_Y()
    {
        return this.CONV_PTO_LOTE_Y;
    }
    public void setCONV_PTO_LOTE_Y(BigDecimal value)
    {
        this.CONV_PTO_LOTE_Y = value;
    }

    private java.sql.Date  TIEMPO_DESPLAZA;
    public java.sql.Date getTIEMPO_DESPLAZA()
    {
        return this.TIEMPO_DESPLAZA;
    }
    public void setTIEMPO_DESPLAZA(java.sql.Date value)
    {
        this.TIEMPO_DESPLAZA = value;
    }

    private Double  DISTANCIA_PROMEDIO;
    public Double getDISTANCIA_PROMEDIO()
    {
        return this.DISTANCIA_PROMEDIO;
    }
    public void setDISTANCIA_PROMEDIO(Double value)
    {
        this.DISTANCIA_PROMEDIO = value;
    }

    private BigDecimal  vlatitud;
    public BigDecimal getvlatitud()
    {
        return this.vlatitud;
    }
    public void setvlatitud(BigDecimal value)
    {
        this.vlatitud = value;
    }

    private BigDecimal  vlongitud;
    public BigDecimal getvlongitud()
    {
        return this.vlongitud;
    }
    public void setvlongitud(BigDecimal value)
    {
        this.vlongitud = value;
    }

    private String  RUTA_VIDEO;
    public String getRUTA_VIDEO()
    {
        return this.RUTA_VIDEO;
    }
    public void setRUTA_VIDEO(String value)
    {
        this.RUTA_VIDEO = value;
    }

    private String  NOMBRE_FOTO_NIS;
    public String getNOMBRE_FOTO_NIS()
    {
        return this.NOMBRE_FOTO_NIS;
    }
    public void setNOMBRE_FOTO_NIS(String value)
    {
        this.NOMBRE_FOTO_NIS = value;
    }

    private Boolean  FLG_COMPRIMIDO;
    public Boolean getFLG_COMPRIMIDO()
    {
        return this.FLG_COMPRIMIDO;
    }
    public void setFLG_COMPRIMIDO(Boolean value)
    {
        this.FLG_COMPRIMIDO = value;
    }

    private java.sql.Date  FECHA_COMPRIMIDO;
    public java.sql.Date getFECHA_COMPRIMIDO()
    {
        return this.FECHA_COMPRIMIDO;
    }
    public void setFECHA_COMPRIMIDO(java.sql.Date value)
    {
        this.FECHA_COMPRIMIDO = value;
    }

    private String  SD_GL_RUTA_FOTO_3;
    public String getSD_GL_RUTA_FOTO_3()
    {
        return this.SD_GL_RUTA_FOTO_3;
    }
    public void setSD_GL_RUTA_FOTO_3(String value)
    {
        this.SD_GL_RUTA_FOTO_3 = value;
    }

    private String  SD_GL_RUTA_FOTO_2;
    public String getSD_GL_RUTA_FOTO_2()
    {
        return this.SD_GL_RUTA_FOTO_2;
    }
    public void setSD_GL_RUTA_FOTO_2(String value)
    {
        this.SD_GL_RUTA_FOTO_2 = value;
    }

    private String  SD_GL_RUTA_FOTO_1;
    public String getSD_GL_RUTA_FOTO_1()
    {
        return this.SD_GL_RUTA_FOTO_1;
    }
    public void setSD_GL_RUTA_FOTO_1(String value)
    {
        this.SD_GL_RUTA_FOTO_1 = value;
    }

    private Integer  ORDEN_FOTO_NIS;
    public Integer getORDEN_FOTO_NIS()
    {
        return this.ORDEN_FOTO_NIS;
    }
    public void setORDEN_FOTO_NIS(Integer value)
    {
        this.ORDEN_FOTO_NIS = value;
    }

    private java.sql.Date  FECHA_COMPRIMIDO_FOTO;
    public java.sql.Date getFECHA_COMPRIMIDO_FOTO()
    {
        return this.FECHA_COMPRIMIDO_FOTO;
    }
    public void setFECHA_COMPRIMIDO_FOTO(java.sql.Date value)
    {
        this.FECHA_COMPRIMIDO_FOTO = value;
    }

    private Integer  FLAG_COMPRIMIDO_FECHA;
    public Integer getFLAG_COMPRIMIDO_FECHA()
    {
        return this.FLAG_COMPRIMIDO_FECHA;
    }
    public void setFLAG_COMPRIMIDO_FECHA(Integer value)
    {
        this.FLAG_COMPRIMIDO_FECHA = value;
    }

    private Long  PK_FOTO;
    public Long getPK_FOTO()
    {
        return this.PK_FOTO;
    }
    public void setPK_FOTO(Long value)
    {
        this.PK_FOTO = value;
    }

    private String  ruta_foto;
    public String getruta_foto()
    {
        return this.ruta_foto;
    }
    public void setruta_foto(String value)
    {
        this.ruta_foto = value;
    }
}
