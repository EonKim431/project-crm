package com.gsitm.projectcrm.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerDto {
   private Long CUST_SN; //怨좉컼 �씪�젴踰덊샇
   private String CUST_NM; //怨좉컼紐�
   private String EML_ADDR; //�씠硫붿씪 二쇱냼
   private char BRDT; //�깮�뀈�썡�씪
   private String HOME_TELNO; //�옄�깮 �쟾�솕踰덊샇
   private String MBL_TELNO; //�쑕�� �쟾�솕踰덊샇
   private char PRIDTF_NO; //媛쒖씤�떇蹂� 踰덊샇
   private String CR_NM; //吏곸뾽紐�
   private String ROAD_NM_ADDR; //�룄濡쒕챸二쇱냼
   private String PIC_SN_VL; //�떞�떦�옄 �씪�젴踰덊샇 媛� (�� �뀒�씠釉붿뿉�꽌 �씪�젴踰덊샇 �궗�슜�쓣 �쐞�븳 �엫�떆 �슜�뼱)
   private String TKCG_DEPT_NM; //�떞�떦 遺��꽌紐�
   private char FRST_REG_DT; //理쒖큹 �벑濡� �씪�떆 (CURRENT_DATE)
   private double FRST_RGTR_SN; //理쒖큹 �벑濡앹옄 �씪�젴踰덊샇
   private char LAST_MDFCN_DT; //理쒖쥌 �닔�젙 �씪�떆
   private char USE_YN; //�궗�슜�뿬遺�

}