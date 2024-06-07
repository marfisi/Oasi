package it.cascino.oasi;

import it.cascino.oasi.dbas.dao.AsOasic0fDao;
import it.cascino.oasi.dbas.dao.AsPrzac0fDao;
import it.cascino.oasi.dbas.dao.AsScocr0fDao;
import it.cascino.oasi.dbas.managmentbean.AsOasic0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsPrzac0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsScocr0fDaoMng;
import it.cascino.oasi.dbas.dao.AsAlmer0fDao;
import it.cascino.oasi.dbas.dao.AsAncab0fDao;
import it.cascino.oasi.dbas.dao.AsAnma20fDao;
import it.cascino.oasi.dbas.managmentbean.AsAlmer0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsAncab0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsAnma20fDaoMng;
import it.cascino.oasi.dbas.model.AsAlmer0f;
import it.cascino.oasi.dbas.model.AsAncab0f;
import it.cascino.oasi.dbas.model.AsAnma20f;
import it.cascino.oasi.dbas.dao.AsAnmag0fDao;
import it.cascino.oasi.dbas.dao.AsArdep0fDao;
import it.cascino.oasi.dbas.dao.AsBofor0fDao;
import it.cascino.oasi.dbas.dao.AsBolem0fDao;
import it.cascino.oasi.dbas.dao.AsCcmca0fDao;
import it.cascino.oasi.dbas.dao.AsClien00fDao;
import it.cascino.oasi.dbas.dao.AsCorri0fDao;
import it.cascino.oasi.dbas.dao.AsFatem0fDao;
import it.cascino.oasi.dbas.dao.AsFinaz0fDao;
import it.cascino.oasi.dbas.dao.AsFisca00fDao;
import it.cascino.oasi.dbas.dao.AsForni00fDao;
import it.cascino.oasi.dbas.dao.AsLisri0fDao;
import it.cascino.oasi.dbas.dao.AsMovma0fDao;
import it.cascino.oasi.dbas.dao.AsMovoa0fDao;
import it.cascino.oasi.dbas.dao.AsMovtr0fDao;
import it.cascino.oasi.dbas.dao.AsNativeQueryDao;
import it.cascino.oasi.dbas.dao.AsOaanm0fDao;
import it.cascino.oasi.dbas.dao.AsOaard0fDao;
import it.cascino.oasi.dbas.dao.AsTabe20fDao;
import it.cascino.oasi.dbas.dao.AsTabel0fDao;
import it.cascino.oasi.dbas.dao.AsTabge00fDao;
import it.cascino.oasi.dbas.managmentbean.AsAnmag0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsArdep0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsBofor0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsBolem0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsCcmca0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsClien00fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsCorri0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsFatem0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsFinaz0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsFisca00fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsForni00fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsLisri0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsMovma0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsMovoa0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsMovtr0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsNativeQueryDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsOaanm0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsOaard0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsTabe20fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsTabel0fDaoMng;
import it.cascino.oasi.dbas.managmentbean.AsTabge00fDaoMng;
import it.cascino.oasi.dbas.model.AsAnmag0f;
import it.cascino.oasi.dbas.model.AsArdep0f;
import it.cascino.oasi.dbas.model.AsBofor0f;
import it.cascino.oasi.dbas.model.AsBolem0f;
import it.cascino.oasi.dbas.model.AsCcmca0f;
import it.cascino.oasi.dbas.model.AsClien00f;
import it.cascino.oasi.dbas.model.AsCorri0f;
import it.cascino.oasi.dbas.model.AsFatem0f;
import it.cascino.oasi.dbas.model.AsFinaz0f;
import it.cascino.oasi.dbas.model.AsFisca00f;
import it.cascino.oasi.dbas.model.AsForni00f;
import it.cascino.oasi.dbas.model.AsLisri0f;
import it.cascino.oasi.dbas.model.AsMovma0f;
import it.cascino.oasi.dbas.model.AsMovoa0f;
import it.cascino.oasi.dbas.model.AsMovtr0f;
import it.cascino.oasi.dbas.model.AsOaanm0f;
import it.cascino.oasi.dbas.model.AsOaard0f;
import it.cascino.oasi.dbas.model.AsOasic0f;
import it.cascino.oasi.dbas.model.AsPrzac0f;
import it.cascino.oasi.dbas.model.AsScocr0f;
import it.cascino.oasi.dbas.model.AsTabe20f;
import it.cascino.oasi.dbas.model.AsTabel0f;
import it.cascino.oasi.dbas.model.pkey.AsAlmer0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsArdep0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsBofor0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsBolem0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsCcmca0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsCorri0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsFatem0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsFinaz0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsFisca00fPKey;
import it.cascino.oasi.dbas.model.pkey.AsMovma0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsMovtr0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsScocr0fPKey;
import it.cascino.oasi.dbas.model.pkey.AsTabe20fPKey;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_AlberoMercDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ArticoliDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_BarcodeDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_FornitoriDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_GiacenzeDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_ListiniDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_MarchiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_MovimentiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_TrasferimentiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvAS_Vendite008Dao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvNativeQueryDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagLivelliDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagCausContDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagMarchiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_AnagSottofamDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_ArticoliDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_CarichiRigheDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_CarichiTestateDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_ClientiDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_MovimentiRigheDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_MovimentiTestateDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_IvaDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_RigheDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_PrimaNota_TesDao;
import it.cascino.oasi.dbmsqlsrv.dao.MsvOA_TrasferimentiDao;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_AlberoMercDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_ArticoliDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_BarcodeDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_ClientiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_FornitoriDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_GiacenzeDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_ListiniDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_MarchiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_MovimentiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_TrasferimentiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvAS_Vendite008DaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvNativeQueryDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_AnagLivelliDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_AnagCausContDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_AnagMarchiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_AnagSottofamDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_ArticoliDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_CarichiRigheDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_CarichiTestateDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_ClientiDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_MovimentiRigheDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_MovimentiTestateDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_PrimaNota_IvaDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_PrimaNota_RigheDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_PrimaNota_TesDaoMng;
import it.cascino.oasi.dbmsqlsrv.managmentbean.MsvOA_TrasferimentiDaoMng;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_AlberoMerc;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Articoli;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Barcode;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Clienti;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Fornitori;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Giacenze;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Listini;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Marchi;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Movimenti;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Trasferimenti;
import it.cascino.oasi.dbmsqlsrv.model.MsvAS_Vendite008;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagLivelli;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagCausCont;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagMarchi;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_AnagSottofam;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Articoli;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_CarichiRighe;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_CarichiTestate;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Clienti;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiRighe;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_MovimentiTestate;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Iva;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Righe;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_PrimaNota_Tes;
import it.cascino.oasi.dbmsqlsrv.model.MsvOA_Trasferimenti;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_GiacenzePKey;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_ListiniPKey;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_TrasferimentiPKey;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvAS_Vendite008PKey;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_MovimentiRighePKey;
import it.cascino.oasi.dbmsqlsrv.model.pkey.MsvOA_PrimaNota_RighePKey;
import it.cascino.oasi.utils.Support;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Oasi{
	
	private final Logger log = LogManager.getLogger(Oasi.class);
	
	StringBuilder stringBuilder = new StringBuilder();
	
	// AS400
	private final AsOasic0fDao asOasic0fDao = new AsOasic0fDaoMng();
	private final List<AsOasic0f> cmdLs;
	
	private final AsClien00fDao asClien00fDao = new AsClien00fDaoMng();
	private List<AsClien00f> asClien00fLs;
	
	// private final AsForni00fDao asForni00fDao = new AsForni00fDaoMng();
	// private List<AsForni00f> asForni00fLs;
	
	// private final AsFisca00fDao asFisca00fDao = new AsFisca00fDaoMng();
	// private List<AsFisca00f> asFisca00fLs;
	
	private final AsTabge00fDao asTabge00fDao = new AsTabge00fDaoMng();
	// private List<AsTabge00f> asTabge00fLs;
	
	// private final AsAlmer0fDao asAlmer0fDao = new AsAlmer0fDaoMng();
	// private List<AsAlmer0f> asAlmer0fLs;
	
	private final AsAnmag0fDao asAnmag0fDao = new AsAnmag0fDaoMng();
	private List<AsAnmag0f> asAnmag0fLs;
	
	// private final AsAnma20fDao asAnma20fDao = new AsAnma20fDaoMng();
	// private List<AsAnma20f> asAnma20fLs;
	
	// private final AsAafor0fDao asAafor0fDao = new AsAafor0fDaoMng();
	// private List<AsAafor0f> asAafor0fLs;
	
	private final AsTabel0fDao asTabel0fDao = new AsTabel0fDaoMng();
	// private List<AsTabel0f> asTabel0fLs;
	
	// private final AsTabe20fDao asTabe20fDao = new AsTabe20fDaoMng();
	// private List<AsTabe20f> asTabe20fLs;
	
	// private final AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
	// private List<AsMovma0f> asMovma0fLs;
	
	// private final AsMovoa0fDao asMovoa0fDao = new AsMovoa0fDaoMng();
	// private List<AsMovoa0f> asMovoa0fLs;
	
	// private final AsMovtr0fDao asMovtr0fDao = new AsMovtr0fDaoMng();
	// private List<AsMovtr0f> asMovtr0fLs;
	
	// private final AsAncab0fDao asAncab0fDao = new AsAncab0fDaoMng();
	// private List<AsAncab0f> asAncab0fLs;
	
	private final AsArdep0fDao asArdep0fDao = new AsArdep0fDaoMng();
	// private List<AsArdep0f> asArdep0fLs;
	
	// private AsArren0fDao asArren0fDao = new AsArren0fDaoMng();
	// private List<AsArren0f> asArren0fLs;
	
	private final AsNativeQueryDao asNativeQueryDao = new AsNativeQueryDaoMng();
	
	// private final AsOaanm0fDao asOaanm0fDao = new AsOaanm0fDaoMng();
	// private List<AsOaanm0f> asOaanm0fLs;
	// private List<String> asOaanm0fMcodaLs;
	
	// private final AsOaard0fDao asOaard0fDao = new AsOaard0fDaoMng();
	// private List<AsOaard0f> asOaard0fLs;
	
	// private final AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
	// private List<AsPrzac0f> asPrzac0fLs;
	
	// private final AsBolem0fDao asBolem0fDao = new AsBolem0fDaoMng();
	// private List<AsBolem0f> asBolem0fLs;
	
	// private final AsBofor0fDao asBofor0fDao = new AsBofor0fDaoMng();
	// private List<AsBofor0f> asBofor0fLs;
	
	// private final AsFatem0fDao asFatem0fDao = new AsFatem0fDaoMng();
	// private List<AsFatem0f> asFatem0fLs;
	
	// private final AsScocr0fDao asScocr0fDao = new AsScocr0fDaoMng();
	// private List<AsScocr0f> asScocr0fLs;
	
	// private final AsFinaz0fDao asFinaz0fDao = new AsFinaz0fDaoMng();
	// private List<AsFinaz0f> asFinaz0fLs;
	
	// private final AsLisri0fDao asLisri0fDao = new AsLisri0fDaoMng();
	
	// private final AsCcmca0fDao asCcmca0fDao = new AsCcmca0fDaoMng();
	// private List<AsCcmca0f> asCcmca0fLs;
	
	private final AsCorri0fDao asCorri0fDao = new AsCorri0fDaoMng();
	
	// MSSqlSrv AS a OA
	// private final MsvAS_ClientiDao msvAS_ClientiDao = new MsvAS_ClientiDaoMng();
	// private List<MsvAS_Clienti> msvAS_ClientiLs;
	
	// private final MsvAS_FornitoriDao msvAS_FornitoriDao = new MsvAS_FornitoriDaoMng();
	// private List<MsvAS_Fornitori> msvAS_FornitoriLs;
	
	// private final MsvAS_ArticoliDao msvAS_ArticoliDao = new MsvAS_ArticoliDaoMng();
	// private List<MsvAS_Articoli> msvAS_ArticoliLs;
	
	// private final MsvAS_MarchiDao msvAS_MarchiDao = new MsvAS_MarchiDaoMng();
	// private List<MsvAS_Marchi> msvAS_MarchiLs;
	
	// private final MsvAS_BarcodeDao msvAS_BarcodeDao = new MsvAS_BarcodeDaoMng();
	// private List<MsvAS_Barcode> msvAS_BarcodeLs;
	
	// private final MsvAS_AlberoMercDao msvAS_AlberoMercDao = new MsvAS_AlberoMercDaoMng();
	// private List<MsvAS_AlberoMerc> msvAS_AlberoMercLs;
	
	// private final MsvAS_ListiniDao msvAS_ListiniDao = new MsvAS_ListiniDaoMng();
	// private List<MsvAS_Listini> msvAS_ListiniLs;
	
	// private final MsvAS_GiacenzeDao msvAS_GiacenzeDao = new MsvAS_GiacenzeDaoMng();
	// private List<MsvAS_Giacenze> msvAS_GiacenzeLs;
	
	// private final MsvAS_MovimentiDao msvAS_MovimentiDao = new MsvAS_MovimentiDaoMng();
	// private List<MsvAS_Movimenti> msvAS_MovimentiLs;
	
	// private final MsvAS_Vendite008Dao msvAS_Vendite008Dao = new MsvAS_Vendite008DaoMng();
	// private List<MsvAS_Vendite008> msvAS_Vendite008Ls;
	
	// private final MsvAS_TrasferimentiDao msvAS_TrasferimentiDao = new MsvAS_TrasferimentiDaoMng();
	// private List<MsvAS_Trasferimenti> msvAS_TrasferimentiLs;
	
	// MSSqlSrv OA a AS
	// private final MsvOA_ClientiDao msvOA_ClientiDao = new MsvOA_ClientiDaoMng();
	// private List<MsvOA_Clienti> msvOA_ClientiLs;
	
	// private final MsvOA_ArticoliDao msvOA_ArticoliDao = new MsvOA_ArticoliDaoMng();
	// private List<MsvOA_Articoli> msvOA_ArticoliLs;
	
	// private final MsvOA_AnagMarchiDao msvOA_AnagMarchiDao = new MsvOA_AnagMarchiDaoMng();
	// private List<MsvOA_AnagMarchi> msvOA_AnagMarchiLs;
	
	// private final MsvOA_AnagLivelliDao msvOA_AnagLivelliDao = new MsvOA_AnagLivelliDaoMng();
	// private List<MsvOA_AnagLivelli> msvOA_AnagLivelliLs;
	
	// private final MsvOA_AnagCausContDao msvOA_AnagCausContDao = new MsvOA_AnagCausContDaoMng();
	// private List<MsvOA_AnagCausCont> msvOA_AnagCausContLs;
	
	// private final MsvOA_AnagSottofamDao msvOA_AnagSottofamDao = new MsvOA_AnagSottofamDaoMng();
	// private List<MsvOA_AnagSottofam> msvOA_AnagSottofamLs;
	
	// private final MsvOA_TrasferimentiDao msvOA_TrasferimentiDao = new MsvOA_TrasferimentiDaoMng();
	// private List<MsvOA_Trasferimenti> msvOA_TrasferimentiLs;
	
	private final MsvOA_MovimentiTestateDao msvOA_MovimentiTestateDao = new MsvOA_MovimentiTestateDaoMng();
	private List<MsvOA_MovimentiTestate> msvOA_MovimentiTestateLs;
	
	private final MsvOA_MovimentiRigheDao msvOA_MovimentiRigheDao = new MsvOA_MovimentiRigheDaoMng();
	private List<MsvOA_MovimentiRighe> msvOA_MovimentiRigheLs;
	
	// private final MsvOA_CarichiTestateDao msvOA_CarichiTestateDao = new MsvOA_CarichiTestateDaoMng();
	// private List<MsvOA_CarichiTestate> msvOA_CarichiTestateLs;
	
	// private final MsvOA_CarichiRigheDao msvOA_CarichiRigheDao = new MsvOA_CarichiRigheDaoMng();
	// private List<MsvOA_CarichiRighe> msvOA_CarichiRigheLs;
	
	private final MsvOA_PrimaNota_TesDao msvOA_PrimaNota_TesDao = new MsvOA_PrimaNota_TesDaoMng();
	private List<MsvOA_PrimaNota_Tes> msvOA_PrimaNota_TesLs;
	
	private final MsvOA_PrimaNota_RigheDao msvOA_PrimaNota_RigheDao = new MsvOA_PrimaNota_RigheDaoMng();
	private List<MsvOA_PrimaNota_Righe> msvOA_PrimaNota_RigheLs;
	
	private final MsvOA_PrimaNota_IvaDao msvOA_PrimaNota_IvaDao = new MsvOA_PrimaNota_IvaDaoMng();
	private List<MsvOA_PrimaNota_Iva> msvOA_PrimaNota_IvaLs;
	
	private final MsvNativeQueryDao msvNativeQueryDao = new MsvNativeQueryDaoMng();
	
	// nuovo deposito - definire il nuovo valore
	// in tabel0f - xx=numero deposito - 
	// NUZ - Axx - bolle fornitore (acquisto)
	// NUZ - Bxx - bolle clienti (vendita)
	// NUZ - Fxx - fatture vendite
	// NUZ - Txx - trasferimenti deposito (dep partenza)
	// NUZ - SCy - scontrini a credito - A=pagdm, C=milazzo, D=sciacca, E=padante
	// MCO - ' xx'
	// DEC - ' xx'
	
	// variabili
	private String funzione = "";
	// private String dataPartenza = "";
	private Boolean as2oasi = false;
	private Boolean oasi2as = false;
	private Boolean soloAggiornati = false;
	private Boolean primoAvvio;
	private String depositiExpert = "";
	private final String depositiIngrosso = "1, 3, 30";
	// private String depositiTutti = "";
	private ArrayList<String> codiciMarchiLs = null;
	private String tipoOperazione = "";
	
	private String causaleContSccag = "";
	private String primaNotaData = null;
	private String primaNotaDocumento = null;
	private Integer primaNotaNumDepo = 0;
	
	// Trascodifica
	private final String basePathTransIni = "./transcodifica/";
	private String depositiCascino[]; // 3 = Ing Ferramenta - Via Soletto; 30 = Modula; 1 = Ing Termoidraulica - Via Crisone 24
	private String depositiOasi[];
	private String unitaMisCascino[];
	private String unitaMisOasi[];
	private String codiciIvaCascino[];
	private String codiciIvaOasi[];
	private String pagamentiCascino[];
	private String pagamentiOasi[];
	private String causaliMagCascino[];
	private String causaliMagOasi[];
	private String finanziarieCascino[];
	private String finanziarieOasi[];
	
	private List<String> corrispettiviDaElaborareLs = null;
	
	public Oasi(String args[]){
		log.info("[" + "Oasi");
		
		Integer frequenza = 2000;
		Boolean stopProgramma = false;
		
		cmdLs = new ArrayList<>();
		
		// sono per le config
		// cmdLs.add(asOasic0fDao.getDaOaidtr(20)); // dataPartenza
		cmdLs.add(asOasic0fDao.getDaOaidtr(4)); // depositiExpert
		// cmdLs.add(asOasic0fDao.getDaOaidtr(5)); // depositiTutti
		
		// cmdLs.add(asOasic0fDao.getDaOaidtr(55)); // as2oasiArticoli
		// cmdLs.add(asOasic0fDao.getDaOaidtr(67)); // as2oasiMovimentiMagazzino
		// cmdLs.add(asOasic0fDao.getDaOaidtr(68)); // as2oasiTrasferimenti
		// cmdLs.add(asOasic0fDao.getDaOaidtr(71)); // as2oasiMovimentiMagazzinoDep008
		// cmdLs.add(asOasic0fDao.getDaOaidtr(64)); // as2oasiGiacenze
		
		// cmdLs.add(asOasic0fDao.getDaOaidtr(117)); // oasi2asMovimentiMagazzino
		// cmdLs.add(asOasic0fDao.getDaOaidtr(105)); // oasi2asArticoli
		// cmdLs.add(asOasic0fDao.getDaOaidtr(110)); // oasi2asAlberoMerceologico
		// cmdLs.add(asOasic0fDao.getDaOaidtr(121)); // oasi2asMovimentiMagazzinoDep008
		
		primoAvvio = true;
		
		initTranscodifica();
		
		// elaboraChiusuraCassa();
		// elaboraCrediti();
		// elaboraFatture();
		// elaboraPagamenti();
		// elaboraAssistenzeInterne();
		// elaboraCorrispettiviContabilizzazione();
		// testCodice();
		
		String argomenti = "";
		AsOasic0f cmd = null;
		Iterator<AsOasic0f> iter_cmd = null;
		while(true){
			// cmdLs = asOasic0fDao.getCmdToDo();XN
			cmdLs.addAll(asOasic0fDao.getCmdToDo());
			
			iter_cmd = cmdLs.iterator();
			while(iter_cmd.hasNext()){
				cmd = iter_cmd.next();
				log.info("Comando: " + cmd.toString());
				
				argomenti = cmd.getId().getOacmd1();
				argomenti = StringUtils.normalizeSpace(argomenti);
				// for(int numArg = 0; numArg < args.length; numArg++){
				// argomenti += args[numArg] + " " ;
				// }
				
				log.info("Parametri: " + argomenti);
				args = StringUtils.split(argomenti);
				for(int numArg = 0; numArg < args.length; numArg++){
					if(args[numArg].compareTo("-fun") == 0){
						numArg++;
						funzione = args[numArg];
					}else if(args[numArg].compareTo("-config") == 0){
						funzione = "";
						numArg++;
						// if(args[numArg].compareTo("-dataPartenza") == 0){
						// numArg++;
						// dataPartenza = args[numArg];
						// }else
						if(args[numArg].compareTo("-depositiExpert") == 0){
							numArg++;
							depositiExpert = StringUtils.replace(args[numArg], "|", ", ");
							// }else if(args[numArg].compareTo("-depositiTutti") == 0){
							// numArg++;
							// depositiTutti = StringUtils.replace(args[numArg], "|", ", ");
						}else if(args[numArg].compareTo("stopProgramma") == 0){
							stringBuilder = new StringBuilder();
							stringBuilder.append("stoppato" + " " + "stoppato");
							scriviRispostaInDb(cmd);
							stopProgramma = true;
						}else if(args[numArg].compareTo("setFrequenza") == 0){
							stringBuilder = new StringBuilder();
							stringBuilder.append("frequenza modificata" + " " + "frequenza modificata");
							scriviRispostaInDb(cmd);
							// frequenza viene settata con parametro -ms
						}
					}else if(args[numArg].compareTo("-as2oasi") == 0){
						as2oasi = true;
						oasi2as = false;
					}else if(args[numArg].compareTo("-oasi2as") == 0){
						as2oasi = false;
						oasi2as = true;
					}else if(args[numArg].compareTo("-completa") == 0){
						soloAggiornati = false;
					}else if(args[numArg].compareTo("-aggiornati") == 0){
						soloAggiornati = true;
					}else if(args[numArg].compareTo("-ms") == 0){
						numArg++;
						frequenza = Integer.parseInt(args[numArg]);
					}else{ // se c'e' almeno un parametro e non e' tra quelli previsti stampo il messaggio d'aiuto
					}
				}
				
				// gestisco la chiamata a funzione
				if(funzione.compareTo("clienti") == 0){
					if(as2oasi){
						as2oasiClienti(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asClienti(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("fornitori") == 0){
					if(as2oasi){
						as2oasiFornitori(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asFornitori(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("articoli") == 0){
					if(as2oasi){
						as2oasiArticoli(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asArticoli(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("marchi") == 0){
					if(as2oasi){
						as2oasiMarchi(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asMarchi(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("barcode") == 0){
					if(as2oasi){
						as2oasiBarcode(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asBarcode(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("alberoMerceologico") == 0){
					if(as2oasi){
						as2oasiAlberoMerceologico(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asAlberoMerceologico(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("listini") == 0){
					if(as2oasi){
						as2oasiListini(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asListini(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("giacenze") == 0){
					if(as2oasi){
						as2oasiGiacenze(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asGiacenze(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("movimentiMagazzino") == 0){
					if(as2oasi){
						as2oasiMovimentiMagazzino(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asMovimentiMagazzino(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("movimentiMagazzinoDep008") == 0){
					if(as2oasi){
						as2oasiMovimentiMagazzinoDep008(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asMovimentiMagazzinoDep008(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}else if(funzione.compareTo("trasferimenti") == 0){
					if(as2oasi){
						as2oasiTrasferimenti(soloAggiornati, cmd);
					}else if(oasi2as){
						oasi2asTrasferimenti(soloAggiornati, cmd);
					}else{
						log.error("non e' definita nessuna direzione");
					}
				}
			}
			
			if(stopProgramma){
				break;
			}
			
			try{
				Thread.sleep(frequenza);
			}catch(InterruptedException e){
			}
			
			cmdLs.clear(); // messo perche' c'e' all'inizio un cmdLs.addAll(
		}
		
		chiudi();
	}
	
	private void chiudi(){
		log.info("[" + "chiudi");
		
		asOasic0fDao.close();
		asClien00fDao.close();
		// asForni00fDao.close();
		// asFisca00fDao.close();
		asAnmag0fDao.close();
		// asAnma20fDao.close();
		asTabel0fDao.close();
		// asTabe20fDao.close();
		// asAafor0fDao.close();
		asTabge00fDao.close();
		// asAlmer0fDao.close();
		// asMovma0fDao.close();
		// asMovoa0fDao.close();
		// asAncab0fDao.close();
		asArdep0fDao.close();
		// asArren0fDao.close();
		asNativeQueryDao.close();
		// asOaanm0fDao.close();
		// asOaard0fDao.close();
		// asPrzac0fDao.close();
		// asBolem0fDao.close();
		// asBofor0fDao.close();
		// asFatem0fDao.close();
		// asScocr0fDao.close();
		// asFinaz0fDao.close();
		// asLisri0fDao.close();
		// asCcmca0fDao.close();
		
		// msvAS_ClientiDao.close();
		// msvAS_FornitoriDao.close();
		// msvAS_MarchiDao.close();
		// msvAS_AlberoMercDao.close();
		// msvAS_BarcodeDao.close();
		// msvAS_ListiniDao.close();
		// msvAS_GiacenzeDao.close();
		// msvAS_MovimentiDao.close();
		// msvAS_TrasferimentiDao.close();
		// msvAS_Vendite008Dao.close();
		
		// msvOA_ClientiDao.close();
		// msvOA_ArticoliDao.close();
		// msvOA_AnagMarchiDao.close();
		// msvOA_AnagLivelliDao.close();
		// msvOA_AnagCausContDao.close();
		// msvOA_AnagSottofamDao.close();
		// msvOA_TrasferimentiDao.close();
		Date dataMov = msvOA_MovimentiTestateDao.getMaxDataReg();
		msvOA_MovimentiTestateDao.close();
		msvOA_MovimentiRigheDao.close();
		// msvOA_CarichiTestateDao.close();
		// msvOA_CarichiRigheDao.close();
		msvOA_PrimaNota_TesDao.close();
		msvOA_PrimaNota_RigheDao.close();
		msvOA_PrimaNota_IvaDao.close();
		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataMov);
		calendar.add(Calendar.MONTH, -5);
		dataMov = calendar.getTime();
		String dataTxt = formatter.format(dataMov);
		msvNativeQueryDao.rimuoviRigheVecchie(dataTxt);
		msvNativeQueryDao.close();
		
		log.info("]" + "chiudi");
		
		log.info("]" + "Oasi");
		
		System.exit(0);
	}
	
	private void scriviRispostaInDb(AsOasic0f cmd){
		log.info("[" + "scriviRispostaInDb");
		String risp = stringBuilder.toString();
		
		String rispostaSplit[] = risp.split("(?<=\\G.{256})");
		
		cmd.setOaris1(rispostaSplit[0]);
		
		asOasic0fDao.updateRis(cmd);
		
		asOasic0fDao.detach(cmd);
		
		log.info("]" + "scriviRispostaInDb");
	}
	
	private void as2oasiClienti(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiClienti");
		
		AsFisca00fDao asFisca00fDao = new AsFisca00fDaoMng();
		MsvAS_ClientiDao msvAS_ClientiDao = new MsvAS_ClientiDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAs_ClientiDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(22); // 22 - dataSync as2oasi clienti
		String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		AsClien00f asClien00f = new AsClien00f();
		
		if(soloAggiornati){
			asClien00fLs = new ArrayList<>();
			
			asClien00fLs = asClien00fDao.getAggiornatiDopo(new BigDecimal(dataSync), new BigDecimal(oraSync));
		}else{
			asClien00fLs = asClien00fDao.getAll();
		}
		
		Iterator<AsClien00f> iter_asClien00fLs = asClien00fLs.iterator();
		iter_asClien00fLs = asClien00fLs.iterator();
		while(iter_asClien00fLs.hasNext()){
			asClien00f = iter_asClien00fLs.next();
			
			String codice = "";
			String ragSoc1 = "";
			String ragSoc2 = "";
			String indirizzo = "";
			String cap = "";
			String localita = "";
			String provincia = "";
			String codiceFiscale = "";
			String partitaIva = "";
			String telefono = "";
			String fax = "";
			String cellulare = "";
			String email = "";
			Integer grossista = 0;
			String codIntermed = "";
			String codPa = "";
			String flagSplitPaym = "";
			String emailPec = "";
			String classeSconto = "";
			String nomignolo = "";
			String nazione = "";
			String codicePagamento = "";
			Integer speseIncasso = 0;
			String documentoAccompagnamento = "";
			Integer reverseCharge = 0;
			BigDecimal speseTrasportoImporto = new BigDecimal(0);
			BigDecimal speseTrasportoPercentuale = new BigDecimal(0);
			String cognome = "";
			String nome = "";
			
			codice = Integer.toString(asClien00f.getClccli().intValue());
			String codicePadd = StringUtils.leftPad(asClien00f.getClccli().toString(), 6, "0");
			ragSoc1 = StringUtils.trim(asClien00f.getCldrso());
			ragSoc2 = StringUtils.trim(asClien00f.getCldrsa());
			indirizzo = StringUtils.trim(asClien00f.getCldind());
			cap = StringUtils.trim(asClien00f.getClccap());
			localita = StringUtils.trim(asClien00f.getCldloc());
			provincia = StringUtils.trim(asClien00f.getClcprv());
			codiceFiscale = StringUtils.trim(asClien00f.getClcfis());
			
			partitaIva = StringUtils.leftPad(asClien00f.getClcpiv().toString(), 11, "0");
			if(StringUtils.equals(partitaIva, "00000000000")){
				partitaIva = "";
			}
			
			telefono = StringUtils.join(StringUtils.trim(asClien00f.getClnprt()), StringUtils.trim(asClien00f.getClntel()));
			fax = StringUtils.join(StringUtils.trim(asClien00f.getClnprf()), StringUtils.trim(asClien00f.getClnfax()));
			cellulare = StringUtils.trim(asClien00f.getClntex());
			email = StringUtils.left(StringUtils.trim(asClien00f.getCldema()), 40);
			
			grossista = 0;
			if(((StringUtils.isNotBlank(asClien00f.getClcag1())) && (asTabge00fDao.getSeAgenteIngrosso(asClien00f.getClcag1())))){
				// AsTabge00f asTabge00f = new AsTabge00f();
				// asTabge00fLs = asTabge00fDao.getDaTachia("AG");
				// Iterator<AsTabge00f> iter_asTabge00fLs = asTabge00fLs.iterator();
				// iter_asTabge00fLs = asTabge00fLs.iterator();
				// while(iter_asTabge00fLs.hasNext()){
				// asTabge00f = iter_asTabge00fLs.next();
				// continue;
				// }
				grossista = 1;
			}
			
			codIntermed = "";
			codPa = "";
			String clcf08 = StringUtils.trim(asClien00f.getClcf08());
			if(StringUtils.isNotBlank(clcf08)){
				if(StringUtils.equals(asClien00f.getClfl14(), " ") && Integer.compare(StringUtils.length(clcf08), 7) == 0){
					codIntermed = clcf08;
					codPa = "";
				}else if(StringUtils.equals(asClien00f.getClfl14(), "*") && Integer.compare(StringUtils.length(clcf08), 6) == 0){
					codIntermed = "";
					codPa = clcf08;
				}else{
					log.warn("Problema con lunghezza codice DSI e Pubblica Amministrazione: " + clcf08);
					codIntermed = clcf08;
					codPa = "";
				}
			}
			
			flagSplitPaym = "0";
			if(StringUtils.equals(asClien00f.getClfisp(), "*")){
				flagSplitPaym = "1";
			}
			
			emailPec = StringUtils.defaultString(StringUtils.left(StringUtils.trim(StringUtils.defaultString(asTabge00fDao.getPec(codicePadd, "C"))), 50));
			
			classeSconto = "";
			switch(StringUtils.trim(asClien00f.getClccme())){
				case "":
				case "P":
					classeSconto = "P";
					break;
				case "I":
					classeSconto = "I";
					break;
				case "R":
					classeSconto = "R";
					break;
				default: // ad.es RA
					classeSconto = "R";
					break;
			}
			
			nomignolo = StringUtils.trim(asClien00f.getCldalt());
			
			nazione = StringUtils.trim(asClien00f.getClcnaz());
			if(StringUtils.equals(nazione, "IT")){
				nazione = "ITAL";
			}
			
			codicePagamento = StringUtils.leftPad(Integer.toString(asClien00f.getClcpag().intValue()), 3, "0");
			if(StringUtils.equals(codicePagamento, "000")){
				codicePagamento = "001";
			}
			
			speseIncasso = 0;
			if(StringUtils.equals(asClien00f.getClfasi(), "*")){
				speseIncasso = 1;
			}
			
			documentoAccompagnamento = "";
			switch(StringUtils.trim(asClien00f.getCltdoc())){
				case "":
					documentoAccompagnamento = "Corrispettivo";
					if(Integer.compare(asClien00f.getClcpiv().intValue(), 0) > 0){
						documentoAccompagnamento = "Fattura";
					}
					break;
				case "F":
					documentoAccompagnamento = "Fattura";
					break;
				case "B":
					documentoAccompagnamento = "Bolla";
					break;
				default:
					documentoAccompagnamento = "Corrispettivo";
					break;
			}
			
			reverseCharge = 0;
			if(StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "90") || StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "91")){  // reverse charge - 90 cellulari - 91 informatica
				reverseCharge = 1;
			}
			
			// speseTrasporto = asClien00f.getClcpor();
			// if(StringUtils.isBlank(speseTrasporto)){
			// speseTrasporto = "F"; // porto franco di default
			// }
			// speseTrasporto = StringUtils.trim(asTabge00fDao.getSpedizione(speseTrasporto));
			switch(StringUtils.trim(asClien00f.getClcpor())){
				case "":
					// lascio tutto a 0
					break;
				case "0":
					speseTrasportoImporto = new BigDecimal(6);
					break;
				case "1":
					speseTrasportoImporto = new BigDecimal(10);
					break;
				case "2":
					speseTrasportoImporto = new BigDecimal(12);
					break;
				case "8":
					speseTrasportoPercentuale = new BigDecimal(3);
					break;
				case "9":
					speseTrasportoPercentuale = new BigDecimal(2.5);
					break;
				default:
					// lascio tutto a 0
					break;
			}
			
			AsFisca00f asFisca00f = asFisca00fDao.getDaFiccfoFitcfo(new BigDecimal(codice), "C");
			if(asFisca00f != null){
				cognome = StringUtils.trim(asFisca00f.getFidrss());
				nome = StringUtils.trim(asFisca00f.getFidnme());
			}
			
			MsvAS_Clienti msvAS_Clienti = new MsvAS_Clienti();
			msvAS_Clienti.setCodice(codice);
			msvAS_Clienti.setRagSoc1(ragSoc1);
			msvAS_Clienti.setRagSoc2(ragSoc2);
			msvAS_Clienti.setIndirizzo(indirizzo);
			msvAS_Clienti.setCap(cap);
			msvAS_Clienti.setLocalita(localita);
			msvAS_Clienti.setProvincia(provincia);
			msvAS_Clienti.setCodiceFiscale(codiceFiscale);
			msvAS_Clienti.setPartitaIva(partitaIva);
			msvAS_Clienti.setTelefono(telefono);
			msvAS_Clienti.setFax(fax);
			msvAS_Clienti.setCellulare(cellulare);
			msvAS_Clienti.setEmail(email);
			msvAS_Clienti.setGrossista(grossista);
			msvAS_Clienti.setCodIntermed(codIntermed);
			msvAS_Clienti.setCodPa(codPa);
			msvAS_Clienti.setFlagSplitPaym(flagSplitPaym);
			msvAS_Clienti.setEmailPec(emailPec);
			msvAS_Clienti.setClasseSconto(classeSconto);
			msvAS_Clienti.setNomignolo(nomignolo);
			msvAS_Clienti.setNazione(nazione);
			msvAS_Clienti.setCodicePagamento(codicePagamento);
			msvAS_Clienti.setSpeseIncasso(speseIncasso);
			msvAS_Clienti.setDocumentoAccompagnamento(documentoAccompagnamento);
			msvAS_Clienti.setReverseCharge(reverseCharge);
			msvAS_Clienti.setSpeseTrasportoImporto(speseTrasportoImporto);
			msvAS_Clienti.setSpeseTrasportoPercentuale(speseTrasportoPercentuale);
			msvAS_Clienti.setCognome(cognome);
			msvAS_Clienti.setNome(nome);
			
			if(!(soloAggiornati)){
				msvAS_ClientiDao.salva(msvAS_Clienti);
			}else{
				MsvAS_Clienti msvAS_ClientiTmp = msvAS_ClientiDao.getDaCodice(codice);
				if(msvAS_ClientiTmp == null){ // nuova quindi insert
					log.info("salva: " + msvAS_Clienti.toString());
					msvAS_ClientiDao.salva(msvAS_Clienti);
				}else{ // gia' presente, quindi update
					msvAS_ClientiDao.aggiorna(msvAS_Clienti);
					msvAS_ClientiDao.detach(msvAS_ClientiTmp);
				}
			}
			msvAS_ClientiDao.detach(msvAS_Clienti);
		}
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asFisca00fDao.close();
		msvAS_ClientiDao.close();
		
		log.info("]" + "as2oasiClienti");
	}
	
	private void oasi2asClienti(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asClienti");
		
		AsFisca00fDao asFisca00fDao = new AsFisca00fDaoMng();
		MsvOA_ClientiDao msvOA_ClientiDao = new MsvOA_ClientiDaoMng();
		List<MsvOA_Clienti> msvOA_ClientiLs;
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(32); // 32 - dataSync oasi2as clienti
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		MsvOA_Clienti msvOA_Clienti = new MsvOA_Clienti();
		
		msvOA_ClientiLs = msvOA_ClientiDao.getAll();
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_Clienti> iter_msvOA_ClientiLs = msvOA_ClientiLs.iterator();
		iter_msvOA_ClientiLs = msvOA_ClientiLs.iterator();
		while(iter_msvOA_ClientiLs.hasNext()){
			msvOA_Clienti = iter_msvOA_ClientiLs.next();
			
			BigDecimal clccli = new BigDecimal(0);
			String clfann = "";
			String cltcli = "";
			String cldrso = "";
			String cldrsa = "";
			String cldind = "";
			String clccap = "";
			String cldloc = "";
			String clcprv = "";
			String clcfis = "";
			BigDecimal clcpiv = new BigDecimal(0);
			String clnprt = "";
			String clntel = "";
			String clnprf = "";
			String clnfax = "";
			String clntex = "";
			String cldema = "";
			String clcag1 = "";
			String clcf08 = "";
			String clfisp = "";
			String clccme = "";
			String cldalt = "";
			String clcnaz = "";
			BigDecimal clcpag = new BigDecimal(0);
			String clfasi = "";
			String cltdoc = "";
			String clcpor = "";
			String clcusr = "";
			BigDecimal cluins = new BigDecimal(0);
			BigDecimal clhins = new BigDecimal(0);
			String clcnor = "";
			String clfl14 = "";
			
			clccli = new BigDecimal(msvOA_Clienti.getCodice());
			String ragSoc = StringUtils.trim(StringUtils.join(StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getRagSoc1())), " ", StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getRagSoc2()))));
			ragSoc = StringUtils.removeEnd(ragSoc, "-"); // trattino finale solo per far scattare la modifca su oasi
			
			clfann = "V"; // per esportazione sirio a docfinance
			cltcli = "C";
			
			cldrso = StringUtils.left(ragSoc, 30);
			cldrsa = StringUtils.substring(ragSoc, 30, 60);
			
			cldind = StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getIndirizzo()));
			if(StringUtils.length(cldind) > 30){
				String civico = StringUtils.substring(cldind, StringUtils.lastIndexOf(cldind, " ") + 1);
				cldind = StringUtils.join(StringUtils.left(cldind, 29 - StringUtils.length(civico)), " ", civico);
			}
			
			clccap = StringUtils.trim(msvOA_Clienti.getCap());
			cldloc = StringUtils.left(StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getLocalita())), 25);
			clcprv = StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getProvincia()));
			clcfis = StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getCodiceFiscale()));
			
			clcpiv = new BigDecimal(0);
			String clcpivTxt = StringUtils.trim(msvOA_Clienti.getPartitaIva());
			if(StringUtils.isNotBlank(clcpivTxt)){
				clcpiv = new BigDecimal(clcpivTxt);
			}
			
			String prefisso = StringUtils.left(StringUtils.trim(msvOA_Clienti.getTelefono()), 3);
			String numero = StringUtils.left(StringUtils.substring(StringUtils.trim(msvOA_Clienti.getTelefono()), 3), 12);
			clnprt = prefisso;
			clntel = numero;
			
			prefisso = StringUtils.left(StringUtils.trim(msvOA_Clienti.getFax()), 3);
			numero = StringUtils.left(StringUtils.substring(StringUtils.trim(msvOA_Clienti.getFax()), 3), 12);
			clnprf = prefisso;
			clnfax = numero;
			
			clntex = StringUtils.left(StringUtils.trim(msvOA_Clienti.getCellulare()), 20);
			cldema = StringUtils.left(StringUtils.trim(msvOA_Clienti.getEmail()), 60);
			clcag1 = "";
			
			clcf08 = StringUtils.trim(msvOA_Clienti.getCodIntermed());
			clfl14 = "";
			if(!(StringUtils.isBlank(msvOA_Clienti.getCodPa()))){
				clcf08 = StringUtils.trim(msvOA_Clienti.getCodPa());
				clfl14 = "*";
			}
			clcf08 = StringUtils.upperCase(clcf08);
			
			clfisp = "";
			if(StringUtils.equals(StringUtils.trim(msvOA_Clienti.getFlagSplitPaym()), "1")){
				clfisp = "*";
			}
			
			String emailPec = StringUtils.trim(msvOA_Clienti.getEmailPec());
			// constrollo se c'� per, se si update altrimenti insert
			// sempre che la pec sia popolata
			if(StringUtils.isNotBlank(emailPec)){
				String codicePadd = StringUtils.leftPad(StringUtils.trim(msvOA_Clienti.getCodice()), 6, "0");
				String emailPecTmp = StringUtils.left(StringUtils.trim(asTabge00fDao.getPec(codicePadd, "C")), 50);
				if(emailPecTmp == null){ // nuova quindi insert
					log.info("salva: " + emailPec);
					asTabge00fDao.salvaPec(codicePadd, "C", emailPec);
				}else{ // gia' presente, quindi update
					log.info("aggiorna: " + emailPec);
					asTabge00fDao.aggiornaPec(codicePadd, "C", emailPec);
				}
			}
			
			clccme = "";
			switch(StringUtils.trim(msvOA_Clienti.getClasseSconto())){
				case "00":
					clccme = "P";
					break;
				case "I.":
					clccme = "I";
					break;
				case "R.":
					clccme = "R";
					break;
				default:
					clccme = "P";
					break;
			}
			
			cldalt = StringUtils.left(StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getNomignolo())), 25);
			clcnaz = StringUtils.upperCase(StringUtils.trim(msvOA_Clienti.getNazione()));
			if(StringUtils.equals(clcnaz, "ITAL")){
				clcnaz = "IT";
			}
			
			clcpag = new BigDecimal(1);
			String clcpagTxt = StringUtils.trim(msvOA_Clienti.getCodicePagamento());
			if(StringUtils.containsOnly(clcpagTxt, "0123456789")){
				clcpag = new BigDecimal(clcpagTxt);
			}else{ // e' un codice oasi, devo fare transcodifica
				clcpagTxt = transPagamenti(clcpagTxt, "oasi2as");
				if(StringUtils.isBlank(clcpagTxt)){
					log.error("Codice: " + msvOA_Clienti.getCodicePagamento() + " non gestito");
					clcpagTxt = "1"; // contanti
				}
				clcpag = new BigDecimal(clcpagTxt);
			}
			
			clfasi = "";
			if(Integer.compare(msvOA_Clienti.getSpeseIncasso(), 1) == 0){
				clfasi = "*";
			}
			
			cltdoc = "";
			switch(StringUtils.trim(msvOA_Clienti.getDocumentoAccompagnamento())){
				case "2":
					cltdoc = "";
					break;
				case "1":
					cltdoc = "F";
					break;
				case "0":
					cltdoc = "B";
					break;
				default:
					cltdoc = "";
					break;
			}
			
			// reverseCharge
			clcnor = "";
			if(msvOA_Clienti.getReverseCharge().compareTo(1) == 0){
				clcnor = "90";
				// non ho modo di distinguere se deve essere 90 o 91, metto 90 
			}
			
			clcpor = "";
			BigDecimal clcporBigDec = msvOA_Clienti.getSpeseTrasportoImporto();
			if(clcporBigDec.compareTo(new BigDecimal(0)) == 0){
				clcpor = "";
			}else if(clcporBigDec.compareTo(new BigDecimal(6)) == 0){
				clcpor = "0";
			}else if(clcporBigDec.compareTo(new BigDecimal(10)) == 0){
				clcpor = "1";
			}else if(clcporBigDec.compareTo(new BigDecimal(12)) == 0){
				clcpor = "2";
			}else{
				clcpor = "";
			}
			
			clcporBigDec = msvOA_Clienti.getSpeseTrasportoPercentuale();
			if(clcporBigDec.compareTo(new BigDecimal(3)) == 0){
				clcpor = "8";
			}else if(clcporBigDec.compareTo(new BigDecimal(2.5)) == 0){
				clcpor = "9";
			}
			
			clcusr = "OASI";
			cluins = new BigDecimal(StringUtils.left(strTimestampAs400, 8));
			clhins = new BigDecimal(StringUtils.right(strTimestampAs400, 6));
			
			Boolean inFisca = false;
			if(StringUtils.isBlank(msvOA_Clienti.getCodiceFiscale())){
				if(StringUtils.isBlank(msvOA_Clienti.getPartitaIva())){
					inFisca = true;
				}else{
					inFisca = false;
				}
			}else{
				if(StringUtils.containsOnly(StringUtils.trim(msvOA_Clienti.getCodiceFiscale()), "0123456789")){
					inFisca = false;
				}else{
					inFisca = true;
				}
			}
			if(inFisca){
				String fidrss = StringUtils.upperCase(StringUtils.left(StringUtils.trim(msvOA_Clienti.getCognome()), 30));
				String fidnme = StringUtils.upperCase(StringUtils.left(StringUtils.trim(msvOA_Clienti.getNome()), 25));
				
				AsFisca00fPKey id = new AsFisca00fPKey();
				id.setFiccfo(clccli);
				id.setFitcfo("C");
				AsFisca00f asFisca00f = new AsFisca00f();
				asFisca00f.setId(id);
				asFisca00f.setFidrss(fidrss);
				asFisca00f.setFidnme(fidnme);
				if(StringUtils.isNotBlank(fidrss) || StringUtils.isNotBlank(fidnme)){
					AsFisca00f asFisca00fTmp = asFisca00fDao.getDaFiccfoFitcfo(clccli, "C");
					if(asFisca00fTmp == null){ // nuova quindi insert
						log.info("salva: " + asFisca00f.toString());
						if(!(asFisca00fDao.salva(asFisca00f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						if(!(asFisca00fDao.aggiorna(asFisca00f))){
							chiudi();
						}
						asFisca00fDao.detach(asFisca00fTmp);
					}
				}
				asFisca00fDao.detach(asFisca00f);
			}
			
			AsClien00f asClien00f = new AsClien00f();
			asClien00f.setClccli(clccli);
			asClien00f.setClfann(clfann);
			asClien00f.setCltcli(cltcli);
			asClien00f.setCldrso(cldrso);
			asClien00f.setCldrsa(cldrsa);
			asClien00f.setCldind(cldind);
			asClien00f.setClccap(clccap);
			asClien00f.setCldloc(cldloc);
			asClien00f.setClcprv(clcprv);
			asClien00f.setClcfis(clcfis);
			asClien00f.setClcpiv(clcpiv);
			asClien00f.setClnprt(clnprt);
			asClien00f.setClntel(clntel);
			asClien00f.setClnprf(clnprf);
			asClien00f.setClnfax(clnfax);
			asClien00f.setClntex(clntex);
			asClien00f.setCldema(cldema);
			asClien00f.setClcag1(clcag1);
			asClien00f.setClcf08(clcf08);
			asClien00f.setClfisp(clfisp);
			asClien00f.setClccme(clccme);
			asClien00f.setCldalt(cldalt);
			asClien00f.setClcnaz(clcnaz);
			asClien00f.setClcpag(clcpag);
			asClien00f.setClfasi(clfasi);
			asClien00f.setCltdoc(cltdoc);
			asClien00f.setClcpor(clcpor);
			asClien00f.setClcusr(clcusr);
			asClien00f.setCluins(cluins);
			asClien00f.setClhins(clhins);
			asClien00f.setClcnor(clcnor);
			asClien00f.setClfl14(clfl14);
			
			AsClien00f asClien00fTmp = asClien00fDao.getDaClccli(clccli);
			if(asClien00fTmp == null){ // nuova quindi insert
				if(!(asClien00fDao.salva(asClien00f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
					// non modifico i valori che non ricevo definiti
				asClien00f.setClcpor(asClien00fTmp.getClcpor());
				// asClien00f.setClcnor(asClien00fTmp.getClcnor());	// commentato perche' e' gestito il reverse
				asClien00f.setClcag1(asClien00fTmp.getClcag1());
				if(StringUtils.equals(asClien00fTmp.getClccme(), "RA")){
					asClien00f.setClccme(asClien00fTmp.getClccme());
				}
				if(!(asClien00fDao.aggiorna(asClien00f))){
					chiudi();
				}
				asClien00fDao.detach(asClien00fTmp);
			}
			asClien00fDao.detach(asClien00f);
			
			// elimina dalla tabella scritta da oasi
			msvOA_ClientiDao.elimina(msvOA_Clienti);
			msvOA_ClientiDao.detach(msvOA_Clienti);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			// tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_Clienti.getTipoOperazione(), 2));
			// msvOA_Clienti.setTipoOperazione(tipoOperazione);
			// msvOA_ClientiDao.aggiorna(msvOA_Clienti);
		}
		
		asClien00fDao.aggiornaCampiMancanti();
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asFisca00fDao.close();
		msvOA_ClientiDao.close();
		
		log.info("]" + "oasi2asClienti");
	}
	
	private void as2oasiFornitori(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiFornitori");
		
		AsForni00fDao asForni00fDao = new AsForni00fDaoMng();
		List<AsForni00f> asForni00fLs;
		MsvAS_FornitoriDao msvAS_FornitoriDao = new MsvAS_FornitoriDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAs_FornitoriDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(23); // 23 - dataSync as2oasi fornitori
		String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		AsForni00f asForni00f = new AsForni00f();
		
		if(soloAggiornati){
			asForni00fLs = new ArrayList<>();
			
			asForni00fLs = asForni00fDao.getAggiornatiDopo(dataSync, oraSync);
		}else{
			asForni00fLs = asForni00fDao.getAll();
		}
		
		Iterator<AsForni00f> iter_asForni00fLs = asForni00fLs.iterator();
		iter_asForni00fLs = asForni00fLs.iterator();
		while(iter_asForni00fLs.hasNext()){
			asForni00f = iter_asForni00fLs.next();
			
			String codice = "";
			String ragSoc1 = "";
			String ragSoc2 = "";
			String indirizzo = "";
			String cap = "";
			String localita = "";
			String provincia = "";
			String codiceFiscale = "";
			String partitaIva = "";
			String telefono = "";
			String fax = "";
			String cellulare = "";
			String email = "";
			String emailPec = "";
			String nomignolo = "";
			String nazione = "";
			String codicePagamento = "";
			
			codice = Integer.toString(asForni00f.getFocfor());
			String codicePadd = StringUtils.leftPad(Integer.toString(asForni00f.getFocfor()), 6, "0");
			ragSoc1 = StringUtils.trim(asForni00f.getFodrso());
			ragSoc2 = StringUtils.trim(asForni00f.getFodrsa());
			indirizzo = StringUtils.trim(asForni00f.getFodind());
			cap = StringUtils.trim(asForni00f.getFoccap());
			localita = StringUtils.trim(asForni00f.getFodloc());
			provincia = StringUtils.trim(asForni00f.getFocprv());
			codiceFiscale = StringUtils.trim(asForni00f.getFocfis());
			
			partitaIva = StringUtils.leftPad(StringUtils.trim(asForni00f.getFocpiv()), 11, "0");
			if(StringUtils.equals(partitaIva, "00000000000")){
				partitaIva = "";
			}
			
			telefono = StringUtils.join(StringUtils.trim(asForni00f.getFonprt()), StringUtils.trim(asForni00f.getFontel()));
			fax = StringUtils.join(StringUtils.trim(asForni00f.getFonprf()), StringUtils.trim(asForni00f.getFonfax()));
			cellulare = StringUtils.trim(asForni00f.getFontex());
			email = StringUtils.left(StringUtils.trim(asForni00f.getFodema()), 40);
			emailPec = StringUtils.defaultString(StringUtils.left(StringUtils.trim(asTabge00fDao.getPec(codicePadd, "F")), 50));
			
			nomignolo = StringUtils.trim(asForni00f.getFodalt());
			
			nazione = StringUtils.trim(asForni00f.getFocnaz());
			if(StringUtils.equals(nazione, "IT")){
				nazione = "ITAL";
			}
			
			codicePagamento = StringUtils.leftPad(StringUtils.trim(asForni00f.getFocpag()), 3, "0");
			if(StringUtils.equals(codicePagamento, "000")){
				codicePagamento = "001";
			}
			
			MsvAS_Fornitori msvAS_Fornitori = new MsvAS_Fornitori();
			msvAS_Fornitori.setCodice(codice);
			msvAS_Fornitori.setRagSoc1(ragSoc1);
			msvAS_Fornitori.setRagSoc2(ragSoc2);
			msvAS_Fornitori.setIndirizzo(indirizzo);
			msvAS_Fornitori.setCap(cap);
			msvAS_Fornitori.setLocalita(localita);
			msvAS_Fornitori.setProvincia(provincia);
			msvAS_Fornitori.setCodiceFiscale(codiceFiscale);
			msvAS_Fornitori.setPartitaIva(partitaIva);
			msvAS_Fornitori.setTelefono(telefono);
			msvAS_Fornitori.setFax(fax);
			msvAS_Fornitori.setCellulare(cellulare);
			msvAS_Fornitori.setEmail(email);
			msvAS_Fornitori.setEmailPec(emailPec);
			msvAS_Fornitori.setNomignolo(nomignolo);
			msvAS_Fornitori.setNazione(nazione);
			msvAS_Fornitori.setCodicePagamento(codicePagamento);
			
			if(!(soloAggiornati)){
				msvAS_FornitoriDao.salva(msvAS_Fornitori);
			}else{
				MsvAS_Fornitori msvAS_FornitoriTmp = msvAS_FornitoriDao.getDaCodice(codice);
				if(msvAS_FornitoriTmp == null){ // nuova quindi insert
					log.info("salva: " + msvAS_Fornitori.toString());
					msvAS_FornitoriDao.salva(msvAS_Fornitori);
				}else{ // gia' presente, quindi update
					msvAS_FornitoriDao.aggiorna(msvAS_Fornitori);
					msvAS_FornitoriDao.detach(msvAS_FornitoriTmp);
				}
			}
			msvAS_FornitoriDao.detach(msvAS_Fornitori);
		}
		
		MsvAS_Fornitori msvAS_Fornitori1000 = msvAS_FornitoriDao.getDaCodice("1000"); // e' carta carburante e lo rinomino per usarlo come fornitore fittizio per quegli articoli 5900 che non hanno corrispondenza su aafor
		if(msvAS_Fornitori1000 != null){
			msvAS_Fornitori1000.setRagSoc1("fornitore da RIDEFINIRE");
			msvAS_Fornitori1000.setRagSoc2("");
			msvAS_Fornitori1000.setNomignolo("fornitore da RIDEFINIRE");
			msvAS_Fornitori1000.setCodiceFiscale("");
			msvAS_FornitoriDao.aggiorna(msvAS_Fornitori1000);
			msvAS_FornitoriDao.detach(msvAS_Fornitori1000);
		}
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asForni00fDao.close();
		msvAS_FornitoriDao.close();
		
		log.info("]" + "as2oasiFornitori");
	}
	
	private void oasi2asFornitori(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asFornitori");
		
		log.info("]" + "oasi2asFornitori");
	}
	
	private void as2oasiArticoli(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiArticoli");
		
		AsAncab0fDao asAncab0fDao = new AsAncab0fDaoMng();
		List<AsAncab0f> asAncab0fLs;
		AsOaanm0fDao asOaanm0fDao = new AsOaanm0fDaoMng();
		List<String> asOaanm0fMcodaLs;
		MsvAS_ArticoliDao msvAS_ArticoliDao = new MsvAS_ArticoliDaoMng();
		MsvAS_BarcodeDao msvAS_BarcodeDao = new MsvAS_BarcodeDaoMng();
		
		AsLisri0fDao asLisri0fDao = new AsLisri0fDaoMng();
		AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
		MsvAS_ListiniDao msvAS_ListiniDao = new MsvAS_ListiniDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAs_ArticoliDao.svuotaTabella();
			log.info("svuotata tabella");
			
			getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
			
			asOaanm0fDao.svuotaTabella();
		}
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(25); // 25 - dataSync as2oasi articoli
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		AsAnmag0f asAnmag0f = new AsAnmag0f();
		
		// elimino gli articoli che non esistono in anmag0f, ad esempio rinominati
		asOaanm0fDao.eliminaArticoliAnomali();
		
		if(soloAggiornati){
			asAnmag0fLs = new ArrayList<>();
			
			asOaanm0fMcodaLs = asOaanm0fDao.getDaElaborare();
			Iterator<String> iter_asOaanm0fMcodaLs = asOaanm0fMcodaLs.iterator();
			iter_asOaanm0fMcodaLs = asOaanm0fMcodaLs.iterator();
			while(iter_asOaanm0fMcodaLs.hasNext()){
				String asOaanm0fMcoda = iter_asOaanm0fMcodaLs.next();
				
				asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(StringUtils.trim(asOaanm0fMcoda));
				
				// e' in expert, se NO, metto subito Mflag a S e continuo con il prossimo articolo
				if(asAnmag0fDao.getArticoliDaAS400aOasi(asAnmag0f.getMcoda()) == null){
					// se l'articolo non e' di ingrosso, ma e' un articolo cascino (non domex) e che quindi ha il . nel codice lungo, allora lo passo (con flagArtIngrosso = 0)
					if(!(StringUtils.endsWith(StringUtils.trim(asAnmag0f.getMoalu()), "."))){
						AsOaanm0f asOaanm0f = asOaanm0fDao.getDaMcoda(asAnmag0f.getMcoda());
						asOaanm0f.setMflag("S");
						if(!(asOaanm0fDao.aggiorna(asOaanm0f))){
							chiudi();
						}
						log.info(asAnmag0f.getMcoda() + " non va nei negozi - " + asAnmag0f.getMdesc());
						continue;
					}
				}
				
				// se e' un articolo seconhand (marchio: usato garantito), non lo passo a oasi, perché non voglio sovrascrivere la descrizione che in oasi e' di 50char e in as400 e' troncata a 35char
				if(StringUtils.equals(StringUtils.trim(asAnmag0f.getMarch()), "UGR")){
					AsOaanm0f asOaanm0f = asOaanm0fDao.getDaMcoda(asAnmag0f.getMcoda());
					asOaanm0f.setMflag("S");
					if(!(asOaanm0fDao.aggiorna(asOaanm0f))){
						chiudi();
					}
					log.info(asAnmag0f.getMcoda() + " non lo passo perche' la descrizione e' corta - " + asAnmag0f.getMdesc());
					continue;
				}
				
				if(asAnmag0f != null){
					asAnmag0fLs.add(asAnmag0f);
				}
			}
		}
		
		Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
		iter_asAnmag0fLs = asAnmag0fLs.iterator();
		while(iter_asAnmag0fLs.hasNext()){
			asAnmag0f = iter_asAnmag0fLs.next();
			
			String codArticolo = "";
			String descrizione = "";
			String modello = "";
			String codMarchio = "";
			String codLivello = "";
			String unitaMs = "";
			String codFornitore = "";
			String codArtFornitore = "";
			Integer flagArtIngrosso = 0;
			String codIva = "";
			Integer annullato = 0;
			
			codArticolo = StringUtils.trim(asAnmag0f.getMcoda());
			descrizione = StringUtils.trim(asAnmag0f.getMdesc());
			modello = StringUtils.trim(asAnmag0f.getModel());
			
			codMarchio = "";
			AsTabe20f asTabe20f = getCodiceMarchio(StringUtils.trim(asAnmag0f.getMarch()));
			if(asTabe20f != null){
				codMarchio = StringUtils.trim(asTabe20f.getId().getTbele());
			}
			
			codLivello = StringUtils.join(StringUtils.trim(asAnmag0f.getMadiv()), StringUtils.trim(asAnmag0f.getMagru()), StringUtils.trim(asAnmag0f.getMasot()), StringUtils.trim(asAnmag0f.getMafam()), StringUtils.trim(asAnmag0f.getMastf()));
			unitaMs = StringUtils.trim(asAnmag0f.getMumis());
			if(StringUtils.equals(unitaMs, "%")){
				unitaMs = "C";
			}
			
			codFornitore = StringUtils.trim(asAnmag0f.getMcofo().toString());
			codArtFornitore = StringUtils.trim(asAnmag0f.getMcoaf());
			// era utile solo all'inizio in fase di passaggio dati iniziale, ormai aafro non e' piu' alimentato da domex
			// if(StringUtils.equals(codFornitore, "5900")){ // domex
			// AsAafor0f asAafor0f = asAafor0fDao.getArticoloDaAaforAacoa(asAnmag0f.getMcofo(), StringUtils.trim(asAnmag0f.getMcoaf()));
			// if(asAafor0f == null){
			// log.warn("Non presente in aafor - Fornitore=" + asAnmag0f.getMcofo() + ", Articolo=" + StringUtils.trim(asAnmag0f.getMcoaf()) + ", " + asAnmag0f.getMcoda() + " - " + asAnmag0f.getMdesc());
			// // codFornitore = "0";
			// // codArtFornitore = "";
			// // siamo rimasto che codice fornitore metto 1000 e codice articolo lascio quello che e'
			// codFornitore = "1000";
			// // codArtFornitore = "";
			// }
			// }
			
			flagArtIngrosso = 1;
			// attenzione che non dipende da mdepi 1, 3 o 30, ma dal flag m2oas=O in anma20f
			if(asAnmag0fDao.getArticoliDaAS400aOasi(asAnmag0f.getMcoda()) == null){
				flagArtIngrosso = 0;
			}
			
			codIva = StringUtils.trim(asAnmag0f.getMciva());
			// non va fatta la transcodfica, dobbiamo inviare il cod iva cascino
			// codIva = "40";
			// }else{
			// codIva = transCodiciIva(codIva, "as2oasi");
			// if(StringUtils.isBlank(codIva)){
			// codIva = "40";
			// }
			// }
			
			if(StringUtils.equals(codIva, "94")){
				codIva = "BU";
			}
			
			annullato = 0;
			if(StringUtils.equals(asAnmag0f.getAtama(), "A")){
				annullato = 1;
			}
			
			MsvAS_Articoli msvAS_Articoli = new MsvAS_Articoli();
			msvAS_Articoli.setCodArticolo(codArticolo);
			msvAS_Articoli.setDescrizione(descrizione);
			msvAS_Articoli.setModello(modello);
			msvAS_Articoli.setCodMarchio(codMarchio);
			msvAS_Articoli.setCodLivello(codLivello);
			msvAS_Articoli.setUnitaMs(unitaMs);
			msvAS_Articoli.setCodFornitore(codFornitore);
			msvAS_Articoli.setCodArtFornitore(codArtFornitore);
			msvAS_Articoli.setFlagArtIngrosso(flagArtIngrosso);
			msvAS_Articoli.setCodIva(codIva);
			msvAS_Articoli.setAnnullato(annullato);
			
			if(!(soloAggiornati)){
				msvAS_ArticoliDao.salva(msvAS_Articoli);
			}else{
				// articoli
				MsvAS_Articoli msvAS_ArticoliTmp = msvAS_ArticoliDao.getDaCodice(codArticolo);
				if(msvAS_ArticoliTmp == null){ // nuova quindi insert
					log.info("salva: " + msvAS_Articoli.toString());
					msvAS_ArticoliDao.salva(msvAS_Articoli);
				}else{ // gia' presente, quindi update
					msvAS_ArticoliDao.aggiorna(msvAS_Articoli);
					msvAS_ArticoliDao.detach(msvAS_ArticoliTmp);
				}
				
				// barcode e listini, li passo solo se e' flagArtIngrosso = 1
				
				if(Integer.compare(flagArtIngrosso, 1) == 0){
					// barcode
					AsAncab0f asAncab0f = new AsAncab0f();
					asAncab0fLs = asAncab0fDao.getDaCcoda(codArticolo);
					Iterator<AsAncab0f> iter_asAncab0fLs = asAncab0fLs.iterator();
					iter_asAncab0fLs = asAncab0fLs.iterator();
					while(iter_asAncab0fLs.hasNext()){
						asAncab0f = iter_asAncab0fLs.next();
						
						String articolo = "";
						String barcode = "";
						
						articolo = StringUtils.trim(asAnmag0f.getMcoda());
						barcode = StringUtils.trim(asAncab0f.getCcodb());
						
						MsvAS_Barcode msvAS_Barcode = new MsvAS_Barcode();
						msvAS_Barcode.setArticolo(articolo);
						msvAS_Barcode.setBarcode(barcode);
						
						MsvAS_Barcode msvAS_BarcodeTmp = msvAS_BarcodeDao.getDaCodiceBarcode(codArticolo, asAncab0f.getCcodb());
						if(msvAS_BarcodeTmp == null){ // nuova quindi insert
							log.info("salva: " + msvAS_Barcode.toString());
							msvAS_BarcodeDao.salva(msvAS_Barcode);
						}else{ // gia' presente, quindi update
							msvAS_BarcodeDao.aggiorna(msvAS_Barcode);
							msvAS_BarcodeDao.detach(msvAS_BarcodeTmp);
						}
						msvAS_BarcodeDao.detach(msvAS_Barcode);
					}
					
					// listini
					inserisciInASListini(asAnmag0f, asLisri0fDao, asPrzac0fDao, msvAS_ListiniDao);
				}
				
				AsOaanm0f asOaanm0f = asOaanm0fDao.getDaMcoda(codArticolo);
				asOaanm0f.setMflag("S");
				if(!(asOaanm0fDao.aggiorna(asOaanm0f))){
					chiudi();
				}
				asOaanm0fDao.detach(asOaanm0f);
			}
			msvAS_ArticoliDao.detach(msvAS_Articoli);
		}
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asAncab0fDao.close();
		asOaanm0fDao.close();
		msvAS_ArticoliDao.close();
		msvAS_BarcodeDao.close();
		
		asLisri0fDao.close();
		asPrzac0fDao.close();
		msvAS_ListiniDao.close();
		
		log.info("]" + "as2oasiArticoli");
	}
	
	private void oasi2asArticoli(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asArticoli");
		
		AsAnma20fDao asAnma20fDao = new AsAnma20fDaoMng();
		AsOaanm0fDao asOaanm0fDao = new AsOaanm0fDaoMng();
		AsTabe20fDao asTabe20fDao = new AsTabe20fDaoMng();
		MsvOA_ArticoliDao msvOA_ArticoliDao = new MsvOA_ArticoliDaoMng();
		List<MsvOA_Articoli> msvOA_ArticoliLs;
		MsvOA_AnagMarchiDao msvOA_AnagMarchiDao = new MsvOA_AnagMarchiDaoMng();
		MsvOA_AnagSottofamDao msvOA_AnagSottofamDao = new MsvOA_AnagSottofamDaoMng();
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(35); // 35 - dataSync oasi2as articoli
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		MsvOA_Articoli msvOA_Articoli = new MsvOA_Articoli();
		
		msvOA_ArticoliLs = msvOA_ArticoliDao.getAll();
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_Articoli> iter_msvOA_ArticoliLs = msvOA_ArticoliLs.iterator();
		iter_msvOA_ArticoliLs = msvOA_ArticoliLs.iterator();
		while(iter_msvOA_ArticoliLs.hasNext()){
			msvOA_Articoli = iter_msvOA_ArticoliLs.next();
			
			String atama = "";
			String mcoda = "";
			String mdesc = "";
			String mumis = "";
			BigDecimal mconf = new BigDecimal(0);
			Integer mdepi = 0;
			String madiv = "";
			String magru = "";
			String masot = "";
			String mafam = "";
			String mastf = "";
			String mast1 = "";
			String march = "";
			String model = "";
			Integer mcofo = 0;
			String mcoaf = "";
			String mciva = "";
			String mckit = "";
			String moalu = "";
			String mclin = "";
			
			atama = " ";
			if(Integer.compare(msvOA_Articoli.getAnnullato(), 1) == 0){
				atama = "A";
			}
			
			mcoda = StringUtils.left(StringUtils.upperCase(StringUtils.trim(msvOA_Articoli.getCodArticoloCascino())), 10);
			if(StringUtils.isBlank(mcoda)){
				mcoda = StringUtils.join("OA", StringUtils.trim(msvOA_Articoli.getCodBreveOasi()));
			}
			
			mdesc = StringUtils.left(StringUtils.trim(msvOA_Articoli.getDescrizione()), 35);
			mdesc = StringUtils.removeEnd(mdesc, "-"); // trattino finale solo per far scattare la modifca su oasi
			
			mumis = StringUtils.trim(msvOA_Articoli.getUnitaMs());
			if(StringUtils.endsWith(mumis, ".")){
				mumis = StringUtils.removeEnd(mumis, ".");
				if(StringUtils.equals(mumis, "C")){
					mumis = "%";
				}
			}else{
				mumis = transUnitaMis(mumis, "oasi2as");
				if(StringUtils.isBlank(mumis)){
					log.error("Codice: " + msvOA_Articoli.getUnitaMs() + " non gestito");
					mumis = "PZ";
				}
			}
			
			mconf = new BigDecimal(0);
			mdepi = 0;
			
			madiv = "";
			magru = "";
			masot = "";
			mafam = "";
			mastf = "";
			mast1 = "";
			
			String codSottofam = msvOA_Articoli.getCodSottofam();
			MsvOA_AnagSottofam msvOA_AnagSottofam = msvOA_AnagSottofamDao.getDaSotCodice(codSottofam);
			if(msvOA_AnagSottofam == null){
				log.warn("non presente il codice sottofamiglia: " + codSottofam + " in tabella OA_AnagSottofam - articolo: " + mcoda);
				continue;
			}
			String codAlb = StringUtils.trim(msvOA_AnagSottofam.getSotCodice());
			
			if(StringUtils.contains(codAlb, ".")){
				madiv = "C";
				codAlb = StringUtils.trim(msvOA_AnagSottofam.getCodiceCascino());
				codAlb = StringUtils.substring(codAlb, 1);
			}else{
				madiv = "D";
				codAlb = StringUtils.join(msvOA_AnagSottofam.getSotFamiglia(), msvOA_AnagSottofam.getSotCodice());
			}
			
			magru = StringUtils.left(codAlb, 2);
			codAlb = StringUtils.substring(codAlb, 2);
			masot = StringUtils.left(codAlb, 2);
			codAlb = StringUtils.substring(codAlb, 2);
			mafam = StringUtils.left(codAlb, 3);
			codAlb = StringUtils.substring(codAlb, 3);
			mastf = StringUtils.left(codAlb, 4);
			codAlb = StringUtils.substring(codAlb, 4);
			mast1 = "";
			
			// se questo albero e' madiv = C, scrivo diretto su anmag0f
			// se e' invece madiv = D dipende se e' gia' D in anmag0f, allora scrivo diretto su anmag0f
			// ma se e' invece gia' C in anmag0f, allora l'attuale albero C lo passo in anma20f e quello D lo scrivo in anmag0f
			if(StringUtils.equals(madiv, "D")){
				AsAnmag0f asAnmag0fAlbero = asAnmag0fDao.getArticoloDaMcoda(mcoda);
				if((asAnmag0fAlbero != null) && StringUtils.equals(asAnmag0fAlbero.getMadiv(), "C")){
					AsAnma20f asAnma20f = new AsAnma20f();
					asAnma20f.setM2cod(mcoda);
					asAnma20f.setM2div(asAnmag0fAlbero.getMadiv());
					asAnma20f.setM2gru(asAnmag0fAlbero.getMagru());
					asAnma20f.setM2sot(asAnmag0fAlbero.getMasot());
					asAnma20f.setM2fam(asAnmag0fAlbero.getMafam());
					asAnma20f.setM2stf(asAnmag0fAlbero.getMastf());
					asAnma20f.setM2st1(asAnmag0fAlbero.getMast1());
					asAnma20f.setM2b2b("");
					asAnma20f.setM2cat("");
					asAnma20f.setM2aag("");
					asAnma20f.setM2oas("");
					asAnma20f.setM2kas("");
					
					AsAnma20f asAnma20fTmp = asAnma20fDao.getDaM2cod(mcoda);
					if(asAnma20fTmp == null){ // nuova quindi insert
						if(!(asAnma20fDao.salva(asAnma20f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
							// non modifico i valori che non ricevo definiti
						asAnma20f.setM2b2b(asAnma20fTmp.getM2b2b());
						asAnma20f.setM2cat(asAnma20fTmp.getM2cat());
						asAnma20f.setM2aag(asAnma20fTmp.getM2aag());
						asAnma20f.setM2oas(asAnma20fTmp.getM2oas());
						asAnma20f.setM2kas(asAnma20fTmp.getM2kas());
						if(!(asAnma20fDao.aggiorna(asAnma20f))){
							chiudi();
						}
						asAnma20fDao.detach(asAnma20fTmp);
					}
					asAnma20fDao.detach(asAnma20f);
				}
			}
			
			march = StringUtils.trim(msvOA_Articoli.getCodMarchio());
			// se ultimo carattere e' . significa che devo prendere il cascino
			if(StringUtils.endsWith(march, ".")){
				march = StringUtils.removeEnd(msvOA_AnagMarchiDao.getDaMchCodice(march).getCodiceCascino(), ".");
				march = StringUtils.trim(asTabe20fDao.getDaTbnotTbele("MARC", march).getId().getTbele());
			}
			if(StringUtils.isBlank(march) || (StringUtils.length(march) > 4)){
				log.error("Codice: " + march + " non e' consentito");
				march = "";
			}
			
			model = StringUtils.right(StringUtils.trim(msvOA_Articoli.getModello()), 15);
			
			String codForn = msvOA_Articoli.getCodFornitore();
			if(StringUtils.isNotBlank(codForn)){
				mcofo = Integer.parseInt(codForn);
			}else{
				mcofo = 0;
			}
			
			mcoaf = StringUtils.right(msvOA_Articoli.getCodArtFornitore(), 20);
			
			mciva = StringUtils.trim(msvOA_Articoli.getCodIva());
			if(StringUtils.endsWith(mciva, ".") && !(StringUtils.equals(mciva, "BU."))){
				mciva = StringUtils.removeEnd(mciva, ".");
			}else{
				mciva = transCodiciIva(mciva, "oasi2as");
				if(StringUtils.isBlank(mciva)){
					log.error("Codice: " + msvOA_Articoli.getCodIva() + " non gestito");
					mciva = "22";
				}
			}
			
			if(StringUtils.equals(msvOA_Articoli.getTipoArticolo(), "08")){
				mckit = "KT";
			}
			
			moalu = StringUtils.left(StringUtils.trim(msvOA_Articoli.getCodLungoOasi()), 15);
			
			AsAnmag0f asAnmag0f = new AsAnmag0f();
			asAnmag0f.setAtama(atama);
			asAnmag0f.setMcoda(mcoda);
			asAnmag0f.setMdesc(mdesc);
			asAnmag0f.setMumis(mumis);
			asAnmag0f.setMconf(mconf);
			asAnmag0f.setMdepi(mdepi);
			asAnmag0f.setMadiv(madiv);
			asAnmag0f.setMagru(magru);
			asAnmag0f.setMasot(masot);
			asAnmag0f.setMafam(mafam);
			asAnmag0f.setMastf(mastf);
			asAnmag0f.setMast1(mast1);
			asAnmag0f.setMarch(march);
			asAnmag0f.setModel(model);
			asAnmag0f.setMcofo(mcofo);
			asAnmag0f.setMcoaf(mcoaf);
			asAnmag0f.setMciva(mciva);
			asAnmag0f.setMckit(mckit);
			asAnmag0f.setMoalu(moalu);
			asAnmag0f.setMclin(mclin);
			
			AsAnmag0f asAnmag0fTmp = asAnmag0fDao.getArticoloDaMcoda(mcoda);
			if(asAnmag0fTmp == null){ // nuova quindi insert
				if(!(asAnmag0fDao.salva(asAnmag0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
					// non modifico i valori che non ricevo definiti
				asAnmag0f.setMconf(asAnmag0fTmp.getMconf());
				asAnmag0f.setMdepi(asAnmag0fTmp.getMdepi());
				asAnmag0f.setMclin(asAnmag0fTmp.getMclin());
				// se l'articolo e' ingrosso, non tocco il codice fornitore, codice articolo fornitore e descrizione
				if((Integer.compare(asAnmag0fTmp.getMdepi(), 1) == 0) || (Integer.compare(asAnmag0fTmp.getMdepi(), 3) == 0)){
					// se il codice fornitore e' gia definito, allora tengo quello di as, altrimenti (se e' vuoto) prendo quello di oasi
					if(asAnmag0fTmp.getMcofo().compareTo(0) != 0){
						asAnmag0f.setMcofo(asAnmag0fTmp.getMcofo());
						asAnmag0f.setMcoaf(asAnmag0fTmp.getMcoaf());
					}
					asAnmag0f.setMdesc(asAnmag0fTmp.getMdesc());
					
					if(StringUtils.isNotBlank(asAnmag0fTmp.getMarch())){
						asAnmag0f.setMarch(asAnmag0fTmp.getMarch());
					}
					
					if(StringUtils.isNotBlank(asAnmag0fTmp.getModel())){
						asAnmag0f.setModel(asAnmag0fTmp.getModel());
					}
				}
				
				// se l'articolo e' ingrosso o ha giacenza in qualsiasi deposito, non tocco il flag di annullato
				if(((Integer.compare(asAnmag0fTmp.getMdepi(), 1) == 0) || (Integer.compare(asAnmag0fTmp.getMdepi(), 3) == 0)) || asNativeQueryDao.getSeGiagenteNeiDepositi(mcoda, depositiExpert + ", " + depositiIngrosso)){
					asAnmag0f.setAtama(asAnmag0fTmp.getAtama());
				}
				
				if(!(asAnmag0fDao.aggiorna(asAnmag0f))){
					chiudi();
				}
				asAnmag0fDao.detach(asAnmag0fTmp);
			}
			asAnmag0fDao.detach(asAnmag0f);
			
			// dopo l'inserimento dell'articolo, lo tolgo da Oaanm0f, perche' e' stato questo medesimo insert/update a far scattare il trigger
			AsOaanm0f asOaanm0f = asOaanm0fDao.getDaMcoda(asAnmag0f.getMcoda());
			if(asOaanm0f == null){
				log.warn("non presente: " + asAnmag0f.getMcoda());
			}else{
				asOaanm0f.setMflag("S");
				if(!(asOaanm0fDao.aggiorna(asOaanm0f))){
					chiudi();
				}
			}
			
			// gestisco se l'articolo � kasanova
			AsAnma20f asAnma20f = new AsAnma20f();
			asAnma20f.setM2cod(mcoda);
			asAnma20f.setM2div("");
			asAnma20f.setM2gru("");
			asAnma20f.setM2sot("");
			asAnma20f.setM2fam("");
			asAnma20f.setM2stf("");
			asAnma20f.setM2st1("");
			asAnma20f.setM2b2b("");
			asAnma20f.setM2cat("");
			asAnma20f.setM2aag("");
			asAnma20f.setM2oas("");
			asAnma20f.setM2kas("");
			
			String m2kas = "";
			if(Integer.compare(msvOA_Articoli.getKasanova(), 1) == 0){
				m2kas = "1";
			}
			asAnma20f.setM2kas(m2kas);
			
			// se � kasanova, devo per forza avere il record in anma2
			// se non � kasanova: se il record in anma2 esiste devo mettere m2kas = ' ', se il record non c'� non devo fare nulla
			
			AsAnma20f asAnma20fTmp = asAnma20fDao.getDaM2cod(mcoda);
			if(asAnma20fTmp == null){ // nuova quindi insert
				// se non � kasanova e il recod non esiste, non � necessario inserirlo
				if(StringUtils.equals(m2kas, "1")){
					if(!(asAnma20fDao.salva(asAnma20f))){
						chiudi();
					}
				}
			}else{ // gia' presente, quindi update
					// non modifico i valori che non ricevo definiti
				asAnma20f.setM2div(asAnma20fTmp.getM2div());
				asAnma20f.setM2gru(asAnma20fTmp.getM2gru());
				asAnma20f.setM2sot(asAnma20fTmp.getM2sot());
				asAnma20f.setM2fam(asAnma20fTmp.getM2fam());
				asAnma20f.setM2stf(asAnma20fTmp.getM2stf());
				asAnma20f.setM2st1(asAnma20fTmp.getM2st1());
				asAnma20f.setM2b2b(asAnma20fTmp.getM2b2b());
				asAnma20f.setM2cat(asAnma20fTmp.getM2cat());
				asAnma20f.setM2aag(asAnma20fTmp.getM2aag());
				asAnma20f.setM2oas(asAnma20fTmp.getM2oas());
				// se gi� � kasanova, non lo porto mai a 0, anche se oasi mi dice che non � pi� gestito da kasanova (nel tempo gli articoli vengono tolti dalla gestione, ma a me interessa che storicamente � stato gestito da kasanova)
				if(StringUtils.equals(asAnma20fTmp.getM2kas(), "1")){
					asAnma20f.setM2kas(asAnma20fTmp.getM2kas());
				}
				if(!(asAnma20fDao.aggiorna(asAnma20f))){
					chiudi();
				}
				asAnma20fDao.detach(asAnma20fTmp);
			}
			asAnma20fDao.detach(asAnma20f);
			
			// elimina dalla tabella scritta da oasi
			msvOA_ArticoliDao.elimina(msvOA_Articoli);
			msvOA_ArticoliDao.detach(msvOA_Articoli);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			// tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_Articoli.getTipoOperazione(), 2));
			// msvOA_Articoli.setTipoOperazione(tipoOperazione);
			// msvOA_ArticoliDao.aggiorna(msvOA_Articoli);
		}
		
		asAnmag0fDao.aggiornaCampiMancanti();
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asAnma20fDao.close();
		asOaanm0fDao.close();
		asTabe20fDao.close();
		msvOA_ArticoliDao.close();
		msvOA_AnagMarchiDao.close();
		msvOA_AnagSottofamDao.close();
		
		log.info("]" + "oasi2asArticoli");
	}
	
	private void as2oasiMarchi(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiMarchi");
		
		MsvAS_MarchiDao msvAS_MarchiDao = new MsvAS_MarchiDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			msvAS_MarchiDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(27); // 27 - dataSync as2oasi marchi
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
		
		AsTabe20f asTabe20f = null;
		String codiceMarchio = null;
		Iterator<String> iter_codiciMarchiLs = codiciMarchiLs.iterator();
		while(iter_codiciMarchiLs.hasNext()){
			codiceMarchio = iter_codiciMarchiLs.next();
			
			String codice = "";
			String descrizione = "";
			
			asTabe20f = getCodiceMarchio(StringUtils.trim(codiceMarchio));
			
			codice = StringUtils.trim(asTabe20f.getId().getTbele());
			descrizione = StringUtils.trim(asTabe20f.getTbdes());
			
			MsvAS_Marchi msvAS_Marchi = new MsvAS_Marchi();
			msvAS_Marchi.setCodice(codice);
			msvAS_Marchi.setDescrizione(descrizione);
			
			msvAS_MarchiDao.salva(msvAS_Marchi);
			msvAS_MarchiDao.detach(msvAS_Marchi);
		}
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		msvAS_MarchiDao.close();
		
		log.info("]" + "as2oasiMarchi");
	}
	
	private void oasi2asMarchi(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asMarchi");
		
		AsTabe20fDao asTabe20fDao = new AsTabe20fDaoMng();
		MsvOA_AnagMarchiDao msvOA_AnagMarchiDao = new MsvOA_AnagMarchiDaoMng();
		List<MsvOA_AnagMarchi> msvOA_AnagMarchiLs;
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(37); // 37 - dataSync oasi2as marchi
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		MsvOA_AnagMarchi msvOA_AnagMarchi = new MsvOA_AnagMarchi();
		
		msvOA_AnagMarchiLs = msvOA_AnagMarchiDao.getAll();
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_AnagMarchi> iter_msvOA_AnagMarchiLs = msvOA_AnagMarchiLs.iterator();
		iter_msvOA_AnagMarchiLs = msvOA_AnagMarchiLs.iterator();
		while(iter_msvOA_AnagMarchiLs.hasNext()){
			msvOA_AnagMarchi = iter_msvOA_AnagMarchiLs.next();
			
			String tbnot = "";
			String tbele = "";
			String tbdes = "";
			String tbcom = "";
			
			tbnot = "MARC";
			
			tbele = StringUtils.trim(msvOA_AnagMarchi.getMchCodice());
			
			tbdes = StringUtils.trim(msvOA_AnagMarchi.getMchDescrizione());
			
			if(StringUtils.endsWith(tbele, ".")){
				tbele = StringUtils.removeEnd(StringUtils.trim(msvOA_AnagMarchi.getCodiceCascino()), ".");
				tbdes = StringUtils.join(StringUtils.rightPad(tbdes, 49), "C");
			}
			
			if(StringUtils.isBlank(tbele) || (StringUtils.length(tbele) > 4)){
				log.error("Codice: " + tbele + "-" + tbdes + " non e' consentito");
				continue;
			}
			
			AsTabe20fPKey id = new AsTabe20fPKey();
			id.setTbnot(tbnot);
			id.setTbele(tbele);
			AsTabe20f asTabe20f = new AsTabe20f();
			asTabe20f.setId(id);
			asTabe20f.setTbdes(tbdes);
			asTabe20f.setTbcom(tbcom);
			
			AsTabe20f asTabe20fTmp = asTabe20fDao.getDaTbnotTbele(tbnot, tbele);
			if(asTabe20fTmp == null){ // nuova quindi insert
				log.info("salva: " + asTabe20f.toString());
				if(!(asTabe20fDao.salva(asTabe20f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
					// non modifico i valori che non ricevo definiti
				log.info("Vecchio: " + asTabe20fTmp.getTbdes() + ", Nuovo: " + asTabe20f.getTbdes());
				asTabe20f.setTbcom(asTabe20fTmp.getTbcom());
				if(!(asTabe20fDao.aggiorna(asTabe20f))){
					chiudi();
				}
				asTabe20fDao.detach(asTabe20fTmp);
			}
			asTabe20fDao.detach(asTabe20f);
			
			// elimina dalla tabella scritta da oasi
			// msvOA_AnagMarchiDao.elimina(msvOA_AnagMarchi);
		}
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asTabe20fDao.close();
		msvOA_AnagMarchiDao.close();
		
		log.info("]" + "oasi2asMarchi");
	}
	
	private void as2oasiBarcode(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiBarcode");
		
		AsAncab0fDao asAncab0fDao = new AsAncab0fDaoMng();
		List<AsAncab0f> asAncab0fLs;
		MsvAS_BarcodeDao msvAS_BarcodeDao = new MsvAS_BarcodeDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAs_BarcodeDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsAnmag0f asAnmag0f = new AsAnmag0f();
		getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
		Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
		iter_asAnmag0fLs = asAnmag0fLs.iterator();
		while(iter_asAnmag0fLs.hasNext()){
			asAnmag0f = iter_asAnmag0fLs.next();
			
			String articolo = "";
			String barcode = "";
			
			articolo = StringUtils.trim(asAnmag0f.getMcoda());
			
			AsAncab0f asAncab0f = new AsAncab0f();
			asAncab0fLs = asAncab0fDao.getDaCcoda(articolo);
			Iterator<AsAncab0f> iter_asAncab0fLs = asAncab0fLs.iterator();
			iter_asAncab0fLs = asAncab0fLs.iterator();
			while(iter_asAncab0fLs.hasNext()){
				asAncab0f = iter_asAncab0fLs.next();
				
				barcode = StringUtils.leftPad(StringUtils.trim(asAncab0f.getCcodb()), 13, "0");
				
				MsvAS_Barcode msvAS_Barcode = new MsvAS_Barcode();
				msvAS_Barcode.setArticolo(articolo);
				msvAS_Barcode.setBarcode(barcode);
				
				msvAS_BarcodeDao.salva(msvAS_Barcode);
				msvAS_BarcodeDao.detach(msvAS_Barcode);
			}
		}
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asAncab0fDao.close();
		msvAS_BarcodeDao.close();
		
		log.info("]" + "as2oasiBarcode");
	}
	
	private void oasi2asBarcode(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asBarcode");
		
		log.info("]" + "oasi2asBarcode");
	}
	
	private void as2oasiAlberoMerceologico(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiAlberoMerceologico");
		
		AsAlmer0fDao asAlmer0fDao = new AsAlmer0fDaoMng();
		List<AsAlmer0f> asAlmer0fLs;
		MsvAS_AlberoMercDao msvAS_AlberoMercDao = new MsvAS_AlberoMercDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAS_AlberoMercDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsAlmer0f asAlmer0f = new AsAlmer0f();
		// asAlmer0fLs = asAlmer0fDao.getAll(); // popolo inquadramenti con almer con amset in (C, D)
		asAlmer0fLs = asAlmer0fDao.getDaAmset("C"); // popolo inquadramenti con almer con amset solo C, tanto quello D lo ricevono direttamente da domex
		Iterator<AsAlmer0f> iter_asAlmer0fLs = asAlmer0fLs.iterator();
		iter_asAlmer0fLs = asAlmer0fLs.iterator();
		while(iter_asAlmer0fLs.hasNext()){
			asAlmer0f = iter_asAlmer0fLs.next();
			
			String codice = "";
			String descrizione = "";
			codice = StringUtils.trim(StringUtils.join(asAlmer0f.getId().getAmset(), asAlmer0f.getId().getAmgru(), asAlmer0f.getId().getAmsot(), asAlmer0f.getId().getAmfam(), asAlmer0f.getId().getAmstf(), "")); // asAlmer0f.getId().getAmst1()
			descrizione = StringUtils.left(StringUtils.trim(asAlmer0f.getAmdes()), 47);
			if(StringUtils.equals(asAlmer0f.getId().getAmset(), "C")){
				descrizione = StringUtils.join(descrizione, "-C");
			}
			
			MsvAS_AlberoMerc msvAS_AlberoMerc = new MsvAS_AlberoMerc();
			msvAS_AlberoMerc.setCodice(codice);
			msvAS_AlberoMerc.setDescrizione(descrizione);
			
			msvAS_AlberoMercDao.salva(msvAS_AlberoMerc);
			msvAS_AlberoMercDao.detach(msvAS_AlberoMerc);
		}
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asAlmer0fDao.close();
		msvAS_AlberoMercDao.close();
		
		log.info("]" + "as2oasiAlberoMerceologico");
	}
	
	private void oasi2asAlberoMerceologico(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asAlberoMerceologico");
		
		AsAlmer0fDao asAlmer0fDao = new AsAlmer0fDaoMng();
		MsvOA_AnagLivelliDao msvOA_AnagLivelliDao = new MsvOA_AnagLivelliDaoMng();
		List<MsvOA_AnagLivelli> msvOA_AnagLivelliLs;
		MsvOA_AnagSottofamDao msvOA_AnagSottofamDao = new MsvOA_AnagSottofamDaoMng();
		List<MsvOA_AnagSottofam> msvOA_AnagSottofamLs;
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(40); // 40 - dataSync oasi2as alberoMerceologico
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		// gruppo, sottogruppo, famiglia
		MsvOA_AnagLivelli msvOA_AnagLivelli = new MsvOA_AnagLivelli();
		
		msvOA_AnagLivelliLs = msvOA_AnagLivelliDao.getAll();
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_AnagLivelli> iter_msvOA_AnagLivelliLs = msvOA_AnagLivelliLs.iterator();
		iter_msvOA_AnagLivelliLs = msvOA_AnagLivelliLs.iterator();
		while(iter_msvOA_AnagLivelliLs.hasNext()){
			msvOA_AnagLivelli = iter_msvOA_AnagLivelliLs.next();
			
			String amset = "";
			String amgru = "";
			String amsot = "";
			String amfam = "";
			String amstf = "";
			String amst1 = "";
			String amdes = "";
			
			String codAlb = StringUtils.trim(msvOA_AnagLivelli.getLvmCodice());
			
			amset = "";
			if(StringUtils.contains(codAlb, ".")){
				amset = "C";
				codAlb = StringUtils.trim(msvOA_AnagLivelli.getCodiceCascino());
				codAlb = StringUtils.substring(codAlb, 1);
			}else{
				amset = "D";
			}
			
			// importo solo l'albero domex, quello cascino la lascio definire solo da as400
			if(StringUtils.equals(amset, "C")){
				continue;
			}
			
			amgru = StringUtils.left(codAlb, 2);
			codAlb = StringUtils.substring(codAlb, 2);
			amsot = StringUtils.left(codAlb, 2);
			codAlb = StringUtils.substring(codAlb, 2);
			amfam = StringUtils.left(codAlb, 3);
			codAlb = StringUtils.substring(codAlb, 3);
			amstf = StringUtils.left(codAlb, 4);
			codAlb = StringUtils.substring(codAlb, 4);
			amst1 = "";
			amdes = StringUtils.trim(msvOA_AnagLivelli.getLvmDescrizione());
			
			// rimouvere alla fine -C
			if(StringUtils.endsWith(amdes, "-C")){
				amdes = StringUtils.removeEnd(amdes, "-C");
			}
			
			AsAlmer0fPKey id = new AsAlmer0fPKey();
			id.setAmset(amset);
			id.setAmgru(amgru);
			id.setAmsot(amsot);
			id.setAmfam(amfam);
			id.setAmstf(amstf);
			id.setAmst1(amst1);
			AsAlmer0f asAlmer0f = new AsAlmer0f();
			asAlmer0f.setId(id);
			asAlmer0f.setAmdes(amdes);
			
			AsAlmer0f asAlmer0fTmp = asAlmer0fDao.getDaId(amset, amgru, amsot, amfam, amstf, amst1);
			if(asAlmer0fTmp == null){ // nuova quindi insert
				log.info("salva: " + asAlmer0f.toString());
				if(!(asAlmer0fDao.salva(asAlmer0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
				if(!(asAlmer0fDao.aggiorna(asAlmer0f))){
					chiudi();
				}
				asAlmer0fDao.detach(asAlmer0fTmp);
			}
			asAlmer0fDao.detach(asAlmer0f);
			
			if(StringUtils.isNotBlank(amfam)){
				// sottofamiglia
				MsvOA_AnagSottofam msvOA_AnagSottofam = new MsvOA_AnagSottofam();
				
				msvOA_AnagSottofamLs = msvOA_AnagSottofamDao.getDaSotFamiglia(msvOA_AnagLivelli.getLvmCodice());
				
				Iterator<MsvOA_AnagSottofam> iter_msvOA_AnagSottofamLs = msvOA_AnagSottofamLs.iterator();
				iter_msvOA_AnagSottofamLs = msvOA_AnagSottofamLs.iterator();
				while(iter_msvOA_AnagSottofamLs.hasNext()){
					msvOA_AnagSottofam = iter_msvOA_AnagSottofamLs.next();
					
					amstf = "";
					amst1 = "";
					amdes = "";
					
					amstf = StringUtils.trim(msvOA_AnagSottofam.getSotCodice());
					if(StringUtils.contains(amstf, ".")){
						amstf = StringUtils.right(msvOA_AnagSottofam.getCodiceCascino(), 4);
					}
					
					amst1 = "";
					amdes = StringUtils.trim(msvOA_AnagSottofam.getSotDescrizione());
					
					// rimouvere alla fine -C
					if(StringUtils.endsWith(amdes, "-C")){
						amdes = StringUtils.removeEnd(amdes, "-C");
					}
					
					id = new AsAlmer0fPKey();
					id.setAmset(amset);
					id.setAmgru(amgru);
					id.setAmsot(amsot);
					id.setAmfam(amfam);
					id.setAmstf(amstf);
					id.setAmst1(amst1);
					asAlmer0f = new AsAlmer0f();
					asAlmer0f.setId(id);
					asAlmer0f.setAmdes(amdes);
					
					asAlmer0fTmp = asAlmer0fDao.getDaId(amset, amgru, amsot, amfam, amstf, amst1);
					if(asAlmer0fTmp == null){ // nuova quindi insert
						log.info("salva: " + asAlmer0f.toString());
						if(!(asAlmer0fDao.salva(asAlmer0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						if(!(asAlmer0fDao.aggiorna(asAlmer0f))){
							chiudi();
						}
						asAlmer0fDao.detach(asAlmer0fTmp);
					}
					asAlmer0fDao.detach(asAlmer0f);
				}
			}
		}
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asAlmer0fDao.close();
		msvOA_AnagLivelliDao.close();
		msvOA_AnagSottofamDao.close();
		
		log.info("]" + "oasi2asAlberoMerceologico");
	}
	
	private void as2oasiListini(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiListini");
		stringBuilder = new StringBuilder();
		
		AsLisri0fDao asLisri0fDao = new AsLisri0fDaoMng();
		AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
		MsvAS_ListiniDao msvAS_ListiniDao = new MsvAS_ListiniDaoMng();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			// msvAs_ListiniDao.svuotaTabella();
			log.info("svuotata tabella");
		}
		
		AsAnmag0f asAnmag0f = new AsAnmag0f();
		getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
		Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
		iter_asAnmag0fLs = asAnmag0fLs.iterator();
		while(iter_asAnmag0fLs.hasNext()){
			asAnmag0f = iter_asAnmag0fLs.next();
			
			inserisciInASListini(asAnmag0f, asLisri0fDao, asPrzac0fDao, msvAS_ListiniDao);
		}
		
		asLisri0fDao.close();
		asPrzac0fDao.close();
		msvAS_ListiniDao.close();
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		log.info("]" + "as2oasiListini");
	}
	
	private void oasi2asListini(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asListini");
		
		log.info("]" + "oasi2asListini");
	}
	
	// private void as2oasiGiacenze(Boolean soloAggiornati, AsOasic0f cmd){
	// log.info("[" + "as2oasiGiacenze");
	// stringBuilder = new StringBuilder();
	//
	// // se e' completa, prima svuoto la tabella mssql
	// if(!(soloAggiornati)){
	// msvAs_GiacenzeDao.svuotaTabella();
	// log.info("svuotata tabella");
	// }
	//
	// AsAnmag0f asAnmag0f = new AsAnmag0f();
	// getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
	// Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
	// iter_asAnmag0fLs = asAnmag0fLs.iterator();
	// while(iter_asAnmag0fLs.hasNext()){
	// asAnmag0f = iter_asAnmag0fLs.next();
	//
	// String codArticolo = "";
	// String codDeposito = "";
	// BigDecimal giacenza = new BigDecimal(0);
	// BigDecimal disponibilita = new BigDecimal(0);
	// BigDecimal difettosi = new BigDecimal(0);
	// BigDecimal scorteMin = new BigDecimal(0);
	// BigDecimal scorteMax = new BigDecimal(0);
	//
	// codArticolo = StringUtils.trim(asAnmag0f.getMcoda());
	//
	// for(int i = 0; i < depositiCascino.length; i++){
	// codDeposito = depositiOasi[i];
	// giacenza = new BigDecimal(0);
	// disponibilita = new BigDecimal(0);
	// difettosi = new BigDecimal(0);
	// scorteMin = new BigDecimal(0);
	// scorteMax = new BigDecimal(0);
	//
	// AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(codArticolo, depositiCascino[i]);
	// AsArren0f asArren0f = asArren0fDao.getDaArcodAndArdep(codArticolo, depositiCascino[i]);
	//
	// if(asArdep0f != null){
	// giacenza = asArdep0f.getDgiac();
	// difettosi = asArdep0f.getDgdif();
	// disponibilita = giacenza.subtract(difettosi);
	// }
	// if(asArren0f != null){
	// scorteMin = asArren0f.getArsmi();
	// scorteMax = asArren0f.getArsmx();
	// }
	//
	// if((giacenza.compareTo(new BigDecimal(0)) > 0) ||
	// (difettosi.compareTo(new BigDecimal(0)) > 0) ||
	// (disponibilita.compareTo(new BigDecimal(0)) > 0) ||
	// (scorteMin.compareTo(new BigDecimal(0)) > 0) ||
	// (scorteMax.compareTo(new BigDecimal(0)) > 0)){
	// MsvAS_GiacenzePKey id = new MsvAS_GiacenzePKey();
	// id.setCodArticolo(codArticolo);
	// id.setCodDeposito(codDeposito);
	// MsvAS_Giacenze msvAS_Giacenze = new MsvAS_Giacenze();
	// msvAS_Giacenze.setId(id);
	// msvAS_Giacenze.setGiacenza(giacenza);
	// msvAS_Giacenze.setDisponibilita(disponibilita);
	// msvAS_Giacenze.setDifettosi(difettosi);
	// msvAS_Giacenze.setScorteMin(scorteMin);
	// msvAS_Giacenze.setScorteMax(scorteMax);
	//
	// msvAs_GiacenzeDao.salva(msvAS_Giacenze);
	// }
	// }
	// }
	//
	// stringBuilder.append("OK");
	// scriviRispostaInDb(cmd);
	// log.info("]" + "as2oasiGiacenze");
	// }
	
	private void as2oasiGiacenze(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiGiacenze");
		
		AsOaard0fDao asOaard0fDao = new AsOaard0fDaoMng();
		List<AsOaard0f> asOaard0fLs;
		MsvAS_GiacenzeDao msvAS_GiacenzeDao = new MsvAS_GiacenzeDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// se e' completa, prima svuoto la tabella mssql
		if(!(soloAggiornati)){
			msvAS_GiacenzeDao.svuotaTabella();
			
			log.info("svuotata tabella");
			
			getArticoliPerOasi(); // setta asAnmag0fLs e codiciMarchiLs
			
			// aggiungo gli articoli non gestiti da AS400 ma che interessa fare vedere la giacenza su Oasi
			asAnmag0fLs.addAll(asAnmag0fDao.getArticoliDaAS400aOasiSoloGiacenze());
			
			asOaard0fDao.svuotaTabella();
		}
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(26); // 26 - dataSync as2oasi giacenze
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		AsAnmag0f asAnmag0f = new AsAnmag0f();
		
		if(soloAggiornati){
			asAnmag0fLs = new ArrayList<>();
			
			asOaard0fLs = asOaard0fDao.getDaElaborare();
			Iterator<AsOaard0f> iter_asOaard0fLs = asOaard0fLs.iterator();
			iter_asOaard0fLs = asOaard0fLs.iterator();
			while(iter_asOaard0fLs.hasNext()){
				AsOaard0f asOaard0f = iter_asOaard0fLs.next();
				
				asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(StringUtils.trim(asOaard0f.getId().getDcoda()));
				
				// e' in expert, se NO, metto subito Dflag a S e continuo con il prossimo articolo
				if(asAnmag0fDao.getArticoliDaAS400aOasi(asAnmag0f.getMcoda()) == null){
					// AsOaard0f asOaard0f = asOaard0fDao.getDaDcodaDcode(asAnmag0f.getMcoda());
					asOaard0f.setDflag("S");
					if(!(asOaard0fDao.aggiorna(asOaard0f))){
						chiudi();
					}
					asOaard0fDao.detach(asOaard0f);
					continue;
				}
				
				if(asAnmag0f != null){
					if(!(asAnmag0fLs.contains(asAnmag0f))){
						asAnmag0fLs.add(asAnmag0f);
					}
				}
			}
		}
		
		Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
		iter_asAnmag0fLs = asAnmag0fLs.iterator();
		while(iter_asAnmag0fLs.hasNext()){
			asAnmag0f = iter_asAnmag0fLs.next();
			
			String codArticolo = "";
			String codDeposito = "";
			BigDecimal giacenza = new BigDecimal(0);
			BigDecimal disponibilita = new BigDecimal(0);
			BigDecimal difettosi = new BigDecimal(0);
			BigDecimal scorteMin = new BigDecimal(0);
			BigDecimal scorteMax = new BigDecimal(0);
			
			codArticolo = StringUtils.trim(asAnmag0f.getMcoda());
			
			List<Object[]> asArdepArrenLs = asNativeQueryDao.getArdepArren(codArticolo, depositiIngrosso);
			
			Object[] asArdepArren = new Object[6];
			Iterator<Object[]> iter_asArdepArrenLs = asArdepArrenLs.iterator();
			iter_asArdepArrenLs = asArdepArrenLs.iterator();
			while(iter_asArdepArrenLs.hasNext()){
				asArdepArren = iter_asArdepArrenLs.next();
				
				// String codArticolo = (String)asArdepArren[0];
				BigDecimal deposito = (BigDecimal)asArdepArren[1];
				
				if(ArrayUtils.contains(depositiCascino, deposito.toString())){
					// codDeposito = depositiOasi[i];
					codDeposito = depositiOasi[ArrayUtils.indexOf(depositiCascino, deposito.toString())];
					giacenza = new BigDecimal(0);
					disponibilita = new BigDecimal(0);
					difettosi = new BigDecimal(0);
					scorteMin = new BigDecimal(0);
					scorteMax = new BigDecimal(0);
					
					giacenza = (BigDecimal)asArdepArren[2];
					if(giacenza == null){
						giacenza = new BigDecimal(0);
					}
					difettosi = (BigDecimal)asArdepArren[3];
					if(difettosi == null){
						difettosi = new BigDecimal(0);
					}
					disponibilita = giacenza.subtract(difettosi);
					
					scorteMin = (BigDecimal)asArdepArren[4];
					if(scorteMin == null){
						scorteMin = new BigDecimal(0);
					}
					scorteMax = (BigDecimal)asArdepArren[5];
					if(scorteMax == null){
						scorteMax = new BigDecimal(0);
					}
					
					// if((giacenza.compareTo(new BigDecimal(0)) != 0) ||
					// (difettosi.compareTo(new BigDecimal(0)) != 0) ||
					// (disponibilita.compareTo(new BigDecimal(0)) != 0) ||
					// (scorteMin.compareTo(new BigDecimal(0)) != 0) ||
					// (scorteMax.compareTo(new BigDecimal(0)) != 0)){
					if(true){
						MsvAS_GiacenzePKey id = new MsvAS_GiacenzePKey();
						id.setCodArticolo(codArticolo);
						id.setCodDeposito(codDeposito);
						MsvAS_Giacenze msvAS_Giacenze = new MsvAS_Giacenze();
						msvAS_Giacenze.setId(id);
						msvAS_Giacenze.setGiacenza(giacenza);
						msvAS_Giacenze.setDisponibilita(disponibilita);
						msvAS_Giacenze.setDifettosi(difettosi);
						msvAS_Giacenze.setScorteMin(scorteMin);
						msvAS_Giacenze.setScorteMax(scorteMax);
						
						if(!(soloAggiornati)){
							msvAS_GiacenzeDao.salva(msvAS_Giacenze);
						}else{
							MsvAS_Giacenze msvAS_GiacenzeTmp = msvAS_GiacenzeDao.getDaCodArticoloCodDeposito(codArticolo, codDeposito);
							if(msvAS_GiacenzeTmp == null){ // nuova quindi insert
								log.info("salva: " + msvAS_Giacenze.toString());
								msvAS_GiacenzeDao.salva(msvAS_Giacenze);
							}else{ // gia' presente, quindi update
								msvAS_GiacenzeDao.aggiorna(msvAS_Giacenze);
								msvAS_GiacenzeDao.detach(msvAS_GiacenzeTmp);
							}
							
							AsOaard0f asOaard0f = asOaard0fDao.getDaDcodaDcode(codArticolo, Integer.parseInt(codDeposito));
							if(asOaard0f != null){
								asOaard0f.setDflag("S");
								if(!(asOaard0fDao.aggiorna(asOaard0f))){
									chiudi();
								}
								asOaard0fDao.detach(asOaard0f);
							}
						}
						msvAS_GiacenzeDao.detach(msvAS_Giacenze);
					}
				}
			}
		}
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asOaard0fDao.close();
		msvAS_GiacenzeDao.close();
		
		log.info("]" + "as2oasiGiacenze");
	}
	
	private void oasi2asGiacenze(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asGiacenze");
		
		log.info("]" + "oasi2asGiacenze");
	}
	
	private void as2oasiMovimentiMagazzino(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiMovimentiMagazzino");
		
		MsvAS_MovimentiDao msvAS_MovimentiDao = new MsvAS_MovimentiDaoMng();
		
		stringBuilder = new StringBuilder();
		
		List<Object[]> asMovLs = asNativeQueryDao.getStoricoMovimenti();
		
		Object[] asMov = new Object[16];
		Iterator<Object[]> iter_asArdepArrenLs = asMovLs.iterator();
		iter_asArdepArrenLs = asMovLs.iterator();
		while(iter_asArdepArrenLs.hasNext()){
			asMov = iter_asArdepArrenLs.next();
			
			Timestamp rdDataReg;
			String rdCausale;
			String rdCodCliFor;
			String rdCodMag;
			String rdCodArticolo;
			BigDecimal rdQta = new BigDecimal(0);
			BigDecimal rdPrezzoNetto = new BigDecimal(0);
			String rdTipoPrezzo;
			String rdCodiceIva;
			BigDecimal rdCosto = new BigDecimal(0);
			String rdNroDoc;
			Timestamp rdDataDoc;
			String rdIdUnivoco;
			
			String timestampMovimentoData = StringUtils.trim(String.valueOf(asMov[0]));
			timestampMovimentoData = StringUtils.join(StringUtils.left(timestampMovimentoData, 4), "-", StringUtils.substring(timestampMovimentoData, 4, 6), "-", StringUtils.right(timestampMovimentoData, 2));
			String timestampMovimentoOra = StringUtils.leftPad(StringUtils.trim(String.valueOf(asMov[1])), 6, "0");
			timestampMovimentoOra = StringUtils.join(StringUtils.left(timestampMovimentoOra, 2), ":", StringUtils.right(timestampMovimentoOra, 2), ":", "00");
			String timestampMovimento = StringUtils.join(timestampMovimentoData, " ", timestampMovimentoOra);
			rdDataReg = Timestamp.valueOf(timestampMovimento);
			
			rdQta = (BigDecimal)asMov[8];
			
			rdCosto = (BigDecimal)asMov[13]; // errore grave, non � stato considerato il sellout. si doveva andare a prendere dalle tabelle flussi domex (dmxrs0f)
			rdCosto = Support.arrotonda(rdCosto, 4);
			
			rdCausale = StringUtils.left(StringUtils.trim(asMov[2].toString()), 1);
			switch(rdCausale){
				case "B":
					rdCausale = "CARF";
					rdCosto = new BigDecimal(0);
					break;
				case "G":
					rdCausale = "CORC";
					break;
				case "D":
					rdCausale = "VEND";
					break;
				case "M":
					rdCausale = "VEND";
					rdQta = rdQta.multiply(new BigDecimal(-1));
					break;
				case "E":
					rdCausale = "CORB";
					break;
				default:
					log.error("Codice: " + rdCausale + " non gestito");
					continue; // non e' tra le causali contemplate
			}
			rdQta = Support.arrotonda(rdQta, 2);
			
			rdCodCliFor = StringUtils.leftPad(asMov[15].toString(), 6, "0");
			
			rdCodMag = transDeposito(asMov[6].toString(), "as2oasi");
			
			rdCodArticolo = StringUtils.trim(asMov[7].toString());
			
			rdQta = (BigDecimal)asMov[8];
			
			rdPrezzoNetto = (BigDecimal)asMov[9];
			BigDecimal sconto1 = (BigDecimal)asMov[10];
			BigDecimal sconto2 = (BigDecimal)asMov[11];
			BigDecimal sconto3 = (BigDecimal)asMov[12];
			
			try{
				rdPrezzoNetto = rdPrezzoNetto.subtract(rdPrezzoNetto.multiply(sconto1.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
				rdPrezzoNetto = rdPrezzoNetto.subtract(rdPrezzoNetto.multiply(sconto2.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
				rdPrezzoNetto = rdPrezzoNetto.subtract(rdPrezzoNetto.multiply(sconto3.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
			}catch(ArithmeticException e){
				rdPrezzoNetto = new BigDecimal(0);
				log.error("errore calcolo prezzo");
			}
			rdPrezzoNetto = Support.arrotonda(rdPrezzoNetto, 4);
			
			rdTipoPrezzo = "0"; // sempre non ivato
			
			rdCodiceIva = (String)asMov[14];
			if(StringUtils.isBlank(rdCodiceIva)){
				rdCodiceIva = "40";
			}else{
				rdCodiceIva = transCodiciIva(rdCodiceIva, "as2oasi");
				if(StringUtils.isBlank(rdCodiceIva)){
					rdCodiceIva = "40";
				}
			}
			
			rdNroDoc = StringUtils.join(asMov[4].toString(), "/", asMov[3].toString());
			rdDataDoc = rdDataReg; // non c'� differenza per noi
			rdIdUnivoco = StringUtils.join(asMov[0].toString(), "-", asMov[2].toString(), "-", asMov[3].toString(), "-", asMov[4].toString(), "-", asMov[5].toString());
			
			MsvAS_Movimenti msvAS_Movimenti = new MsvAS_Movimenti();
			msvAS_Movimenti.setRdDataReg(rdDataReg);
			msvAS_Movimenti.setRdCausale(rdCausale);
			msvAS_Movimenti.setRdCodCliFor(rdCodCliFor);
			msvAS_Movimenti.setRdCodMag(rdCodMag);
			msvAS_Movimenti.setRdCodArticolo(rdCodArticolo);
			msvAS_Movimenti.setRdQta(rdQta);
			msvAS_Movimenti.setRdPrezzoNetto(rdPrezzoNetto);
			msvAS_Movimenti.setRdTipoPrezzo(rdTipoPrezzo);
			msvAS_Movimenti.setRdCodiceIva(rdCodiceIva);
			msvAS_Movimenti.setRdCosto(rdCosto);
			msvAS_Movimenti.setRdNroDoc(rdNroDoc);
			msvAS_Movimenti.setRdDataDoc(rdDataDoc);
			msvAS_Movimenti.setRdIdUnivoco(rdIdUnivoco);
			
			msvAS_MovimentiDao.salva(msvAS_Movimenti);
			msvAS_MovimentiDao.detach(msvAS_Movimenti);
		}
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		msvAS_MovimentiDao.close();
		
		log.info("]" + "as2oasiMovimentiMagazzino");
		
		chiudi();
	}
	
	private void as2oasiMovimentiMagazzinoDep008(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiMovimentiMagazzinoDep008");
		
		MsvAS_Vendite008Dao msvAS_Vendite008Dao = new MsvAS_Vendite008DaoMng();
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(29); // 29 - dataSync oasi2as movimentiMagazzinoDep008
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		// strTimestampAs400 = "20201211";
		List<Object[]> asMovLs = asNativeQueryDao.getMovimentiDepIngArtDomex(Integer.parseInt(StringUtils.left(strTimestampAs400, 8)), depositiIngrosso);
		
		Object[] asMov = new Object[16];
		Iterator<Object[]> iter_asMovLs = asMovLs.iterator();
		while(iter_asMovLs.hasNext()){
			asMov = iter_asMovLs.next();
			
			String idTes = "";
			String idRig = "";
			Timestamp dataReg = null;
			String codCliente = "";
			String nroFattura = "";
			Timestamp dataFattura = null;
			String codArticolo = "";
			BigDecimal qta = new BigDecimal(0);
			BigDecimal prezzoNettoUnitario = new BigDecimal(0);
			
			idTes = StringUtils.join(asMov[2].toString(), "-", asMov[4].toString(), "/", asMov[3].toString());
			idRig = StringUtils.leftPad(asMov[5].toString(), 5, "0");
			
			String timestampMovimentoData = StringUtils.trim(String.valueOf(asMov[0]));
			timestampMovimentoData = StringUtils.join(StringUtils.left(timestampMovimentoData, 4), "-", StringUtils.substring(timestampMovimentoData, 4, 6), "-", StringUtils.right(timestampMovimentoData, 2));
			String timestampMovimentoOra = StringUtils.leftPad(StringUtils.trim(String.valueOf(asMov[1])), 6, "0");
			timestampMovimentoOra = StringUtils.join(StringUtils.left(timestampMovimentoOra, 2), ":", StringUtils.right(timestampMovimentoOra, 2), ":", "00");
			String timestampMovimento = StringUtils.join(timestampMovimentoData, " ", timestampMovimentoOra);
			dataReg = Timestamp.valueOf(timestampMovimento);
			
			codCliente = StringUtils.leftPad(asMov[15].toString(), 6, "0");
			
			nroFattura = StringUtils.join(StringUtils.join(StringUtils.leftPad(asMov[4].toString(), 5, "0"), asMov[3].toString()));
			
			dataFattura = Timestamp.valueOf(StringUtils.join(timestampMovimentoData, " ", "00:00:00"));
			
			codArticolo = StringUtils.trim(asMov[7].toString());
			
			qta = (BigDecimal)asMov[8];
			qta = Support.arrotonda(qta, 2);
			
			prezzoNettoUnitario = (BigDecimal)asMov[9];
			BigDecimal sconto1 = (BigDecimal)asMov[10];
			BigDecimal sconto2 = (BigDecimal)asMov[11];
			BigDecimal sconto3 = (BigDecimal)asMov[12];
			
			try{
				prezzoNettoUnitario = prezzoNettoUnitario.subtract(prezzoNettoUnitario.multiply(sconto1.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
				prezzoNettoUnitario = prezzoNettoUnitario.subtract(prezzoNettoUnitario.multiply(sconto2.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
				prezzoNettoUnitario = prezzoNettoUnitario.subtract(prezzoNettoUnitario.multiply(sconto3.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
			}catch(ArithmeticException e){
				prezzoNettoUnitario = new BigDecimal(0);
				log.error("errore calcolo prezzo");
			}
			
			// applico l'iva
			BigDecimal valiv = (BigDecimal)asMov[14];
			try{
				prezzoNettoUnitario = prezzoNettoUnitario.multiply((new BigDecimal(1)).add(valiv.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)));
			}catch(ArithmeticException e){
				log.error("calcolo prezzoNettoUnitario " + "prezzoNettoUnitario: " + prezzoNettoUnitario + ", valiv: " + valiv);
			}
			prezzoNettoUnitario = Support.arrotonda(prezzoNettoUnitario, 2);
			
			MsvAS_Vendite008PKey id = new MsvAS_Vendite008PKey();
			id.setIdTes(idTes);
			id.setIdRig(idRig);
			MsvAS_Vendite008 msvAS_Vendite008 = new MsvAS_Vendite008();
			msvAS_Vendite008.setId(id);
			msvAS_Vendite008.setDataReg(dataReg);
			msvAS_Vendite008.setCodCliente(codCliente);
			msvAS_Vendite008.setNroFattura(nroFattura);
			msvAS_Vendite008.setDataFattura(dataFattura);
			msvAS_Vendite008.setCodArticolo(codArticolo);
			msvAS_Vendite008.setQta(qta);
			msvAS_Vendite008.setPrezzoNettoUnitario(prezzoNettoUnitario);
			
			log.info("salva: " + msvAS_Vendite008.toString());
			msvAS_Vendite008Dao.salva(msvAS_Vendite008);
			msvAS_Vendite008Dao.detach(msvAS_Vendite008);
		}
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		msvAS_Vendite008Dao.close();
		
		log.info("]" + "as2oasiMovimentiMagazzinoDep008");
	}
	
	private void oasi2asMovimentiMagazzino(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asMovimentiMagazzino");
		
		AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
		AsMovoa0fDao asMovoa0fDao = new AsMovoa0fDaoMng();
		AsBofor0fDao asBofor0fDao = new AsBofor0fDaoMng();
		AsBolem0fDao asBolem0fDao = new AsBolem0fDaoMng();
		AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(38); // 38 - dataSync oasi2as movimentiMagazzino
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		MsvOA_MovimentiTestate msvOA_MovimentiTestate = new MsvOA_MovimentiTestate();
		
		msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getAll();
		
		// aggiungo i movimenti testate che sono gi� state elaborate, ma hanno movimenti righe in stato UPD
		msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getTestateConRigheAggiornate());
		
		// solo alcuni movimenti
		// msvOA_MovimentiTestateLs.clear();
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C03326000"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_MovimentiTestate> iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		while(iter_msvOA_MovimentiTestateLs.hasNext()){
			msvOA_MovimentiTestate = iter_msvOA_MovimentiTestateLs.next();
			
			Integer vdatr = 0;
			String vcaus = "";
			Integer vnura = 0;
			Integer vnumd = 0;
			Integer vprog = 0;
			Integer vdain = 0;
			Integer vorin = 0;
			String vcoda = "";
			String vdesc = "";
			Integer vcocf = null;
			Integer vricl = 0;
			Integer vndep = 0;
			BigDecimal vquan = new BigDecimal(0);
			BigDecimal vprez = new BigDecimal(0);
			BigDecimal vsco1 = new BigDecimal(0);
			BigDecimal vsco2 = new BigDecimal(0);
			BigDecimal vsco3 = new BigDecimal(0);
			BigDecimal vsco4 = new BigDecimal(0);
			String vciva = "";
			BigDecimal valiv = new BigDecimal(0);
			BigDecimal vimps = new BigDecimal(0);
			String vcocr = "";
			String voven = "";
			String vtcve = "";
			BigDecimal vcost = new BigDecimal(0);
			String vtpac = "";
			String vvkit = "";
			String vcusr = "";
			String vcven = "";
			String vidoa = "";
			String vtimo = "";
			String vvfit = "";
			
			BigDecimal segnoQty = new BigDecimal(1);
			
			String causaleOasi = msvOA_MovimentiTestate.getCausaleOasi();
			Integer tipoDocumento = msvOA_MovimentiTestate.getDocumAccomp();
			
			// causali da mettere in elaborate, ma che non saranno gestite
			if(StringUtils.equals(causaleOasi, "RIFS") || StringUtils.equals(causaleOasi, "RIFV") || StringUtils.equals(causaleOasi, "RVTF") || StringUtils.equals(causaleOasi, "ACFF") || StringUtils.equals(causaleOasi, "SCMR") || StringUtils.equals(causaleOasi, "SCCA") || StringUtils.equals(causaleOasi, "RSTR") || StringUtils.equals(causaleOasi, "RIFE") || StringUtils.equals(causaleOasi, "NCPR") || StringUtils.equals(causaleOasi, "RIFK") || StringUtils.equals(causaleOasi, "RIRN") || StringUtils.equals(causaleOasi, "RIRP") || StringUtils.equals(causaleOasi, "CACM") || StringUtils.equals(causaleOasi, "SCBR")){
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
				msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
				msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
				continue;
			}
			
			vcaus = transCausaliMag(causaleOasi, "oasi2as");
			if(StringUtils.isBlank(vcaus)){
				continue; // non e' tra le causali contemplate
			}
			
			vcaus = "";
			if(StringUtils.equals(causaleOasi, "CORC") || StringUtils.equals(causaleOasi, "VEND") || StringUtils.equals(causaleOasi, "VEDD") || StringUtils.equals(causaleOasi, "VENO")){
				if(Integer.compare(tipoDocumento, 2) == 0){
					vcaus = "G";
					if(StringUtils.equals(causaleOasi, "CORC") && StringUtils.isBlank(msvOA_MovimentiTestate.getNroDoc())){
						vcaus = "I";
					}
				}else if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "D";
				}else if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "E";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "C";
			}
			if(StringUtils.equals(causaleOasi, "RSCL") || StringUtils.equals(causaleOasi, "RSCO")){
				if(Integer.compare(tipoDocumento, 2) == 0){
					vcaus = "G";
					segnoQty = new BigDecimal(-1);
					if(StringUtils.equals(causaleOasi, "RSCO") && StringUtils.isBlank(msvOA_MovimentiTestate.getNroDoc())){
						vcaus = "I";
					}
				}else if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "M";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "C";
			}
			if(StringUtils.equals(causaleOasi, "RSCM")){
				if(Integer.compare(tipoDocumento, 2) == 0){
					vcaus = "G";
					segnoQty = new BigDecimal(-1);
				}else if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "M";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "C";
			}
			if(StringUtils.equals(causaleOasi, "CARF") || StringUtils.equals(causaleOasi, "CFOR")){
				if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "B";
				}else if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "B";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "F";
			}
			if(StringUtils.equals(causaleOasi, "RFOR") || StringUtils.equals(causaleOasi, "RSRF") || StringUtils.equals(causaleOasi, "VENO") || StringUtils.equals(causaleOasi, "VENC")){
				if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "B99";
					segnoQty = new BigDecimal(-1);
					
					if(StringUtils.equals(causaleOasi, "VENO")){
						vcocf = 6978; // tim
					}else if(StringUtils.equals(causaleOasi, "VENC")){
						vcocf = 6665; // vnd - vodafone
					}
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "F";
			}
			if(StringUtils.equals(causaleOasi, "SCIA")){
				if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "S";
					vcocf = 0;
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "A";
			}
			
			if(StringUtils.isBlank(vcaus)){
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			log.info("Elaboro: " + msvOA_MovimentiTestate.getIdUnivocoTes());
			
			String vdatrTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataReg());
			vdatr = Integer.parseInt(vdatrTxt);
			vdain = vdatr;
			vorin = 1;
			
			if(vcocf == null){
				vcocf = Integer.parseInt(StringUtils.trim(msvOA_MovimentiTestate.getCodCliFor()));
				if(Integer.compare(vcocf, 999999) == 0){
					vcocf = 0;
				}
				
				if(StringUtils.equals(vcaus, "I")){
					vricl = vcocf;
					vcocf = 0;
				}
			}
			
			if(!(StringUtils.equals(vcaus, "S"))){
				vndep = Integer.parseInt(transDeposito(msvOA_MovimentiTestate.getCodMag(), "oasi2as"));
				vcaus = StringUtils.join(vcaus, StringUtils.leftPad(vndep.toString(), 2, "0"));
			}else if(StringUtils.equals(vcaus, "S")){
				vndep = Integer.parseInt(transDeposito(StringUtils.trim(msvOA_MovimentiTestate.getCodCliFor()), "oasi2as"));
				vcaus = "S00";
			}
			if(StringUtils.equals(StringUtils.left(vcaus, 3), "B99")){
				vcaus = "B99"; // reso a fornitore
			}
			
			String caus = StringUtils.left(vcaus, 1);
			
			vnura = vndep; // per gli expert e' cosi'
			if(StringUtils.equals(caus, "G")){
				vnura = 1; // non abbiamo il numero cassa, quindi sempre 1
			}else if(StringUtils.equals(caus, "S")){
				vnura = 0;
			}
			
			// gestione amazon
			if(StringUtils.equals(causaleOasi, "VEND") || StringUtils.equals(causaleOasi, "RSCM")){
				vnura = 91;
			}
			// if(StringUtils.equals(causaleOasi, "VEND") || StringUtils.equals(causaleOasi, "RSCM")){
			// if(StringUtils.equals(causaleOasi, "VEND")){
			// if(Integer.compare(tipoDocumento, 2) == 0){
			// vcaus = "H0G";
			// }else if(Integer.compare(tipoDocumento, 1) == 0){
			// vcaus = "H0C";
			// vnura = 91;
			// }
			// // caus rimane o G o D
			// }else if(StringUtils.equals(causaleOasi, "RSCM")){
			// if(Integer.compare(tipoDocumento, 2) == 0){
			// vcaus = "H0G";
			// }else if(Integer.compare(tipoDocumento, 1) == 0){
			// vcaus = StringUtils.join("M", StringUtils.leftPad(vndep.toString(), 2, "0"));
			// vnura = 91;
			// }
			// // caus rimane M
			// }
			// }
			
			voven = "NG";
			if(StringUtils.equals(causaleOasi, "VEDD")){
				voven = "BE";
			}
			if(StringUtils.equals(causaleOasi, "VEND") || StringUtils.equals(causaleOasi, "RSCM")){
				voven = "BM";
			}
			
			if(StringUtils.equalsIgnoreCase(msvOA_MovimentiTestate.getIpaCodiceCUP(), "social")){
				voven = "BS";
			}else if(StringUtils.equalsIgnoreCase(msvOA_MovimentiTestate.getIpaCodiceCUP(), "domex")){
				voven = "BX";
			}else if(StringUtils.equalsIgnoreCase(msvOA_MovimentiTestate.getIpaCodiceCUP(), "mepa")){
				voven = "PA";
			}else if(StringUtils.equalsIgnoreCase(msvOA_MovimentiTestate.getIpaCodiceCUP(), "b2e")){
				voven = "BE";
			}
			
			vcocr = "";
			String codPagamento = StringUtils.trim(msvOA_MovimentiTestate.getCodPagamento());
			if(StringUtils.equals(codPagamento, "C00")){
				vcocr = "C";
				// potrebbe essere POS, ma non so come determinarlo
			}else if(StringUtils.equals(codPagamento, "FAGI") || StringUtils.equals(codPagamento, "FCOI") || StringUtils.equals(codPagamento, "FINI") || StringUtils.equals(codPagamento, "FPAI") || StringUtils.equals(codPagamento, "FFLO")){
				vcocr = "F";
			}else if(StringUtils.equals(codPagamento, "WW") || StringUtils.equals(codPagamento, "W3") || StringUtils.equals(codPagamento, "WT") || StringUtils.equals(codPagamento, "WV")){
				vcocr = "M";
			}else if(StringUtils.isNotBlank(codPagamento)){
				vcocr = "R";
			}
			
			if(StringUtils.equals(caus, "G")){
				String numDoc = StringUtils.left(msvOA_MovimentiTestate.getNroDoc(), 6);
				if(StringUtils.isNotBlank(numDoc) && StringUtils.containsOnly(numDoc, "0123456789")){
					vnumd = Integer.parseInt(numDoc);
				}else{
					vnumd = Integer.parseInt(StringUtils.right(msvOA_MovimentiTestate.getIdUnivocoTes(), 5));
				}
				vnumd = vnumd % 100000; // vnumd sempre sotto 99999
			}else if(StringUtils.equals(caus, "D") || StringUtils.equals(caus, "M")){
				// per la fattura, cerco in prima nota testate
				MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = msvOA_PrimaNota_TesDao.getDaNReg(msvOA_MovimentiTestate.getIdPntNReg());
				vnumd = Integer.parseInt(msvOA_PrimaNota_Tes.getDocumento());
			}else if(StringUtils.equals(caus, "E")){
				AsBolem0f asBolem0fTmp = asBolem0fDao.getDaBnote(msvOA_MovimentiTestate.getNroDoc());
				if(asBolem0fTmp == null){
					AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("B", StringUtils.leftPad(vndep.toString(), 2, "0")));
					String tcomm = StringUtils.trim(asTabel0f.getTcomm());
					String tcommmtnum = StringUtils.left(tcomm, 5);
					String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
					String tcommmtnuz = StringUtils.right(tcomm, 2);
					
					BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
					mtnumBD = mtnumBD.add(new BigDecimal(1));
					
					tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
					tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
					
					// vnura = Integer.parseInt(tcommmtnuz);
					// vnumd = mtnumBD.intValue();
					vnumd = Integer.parseInt(msvOA_MovimentiTestate.getnMovDdt());
					
					if(Integer.compare(vnumd, mtnumBD.intValue()) != 0){
						log.warn("Il numero di bolla non coincide - Vnumd: " + vnumd + ", in tabel: " + mtnumBD.intValue());
					}
					
					tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
					
					asTabel0f.setTcomm(tcomm);
					if(!(asTabel0fDao.aggiorna(asTabel0f))){
						chiudi();
					}
					asTabel0fDao.detach(asTabel0f);
				}else{
					vnumd = asBolem0fTmp.getId().getBnumd();
				}
			}else if(StringUtils.equals(caus, "S")){
				AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", "S00");
				String tcomm = StringUtils.trim(asTabel0f.getTcomm());
				String tcommmtnum = StringUtils.left(tcomm, 5);
				String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
				String tcommmtnuz = StringUtils.right(tcomm, 2);
				
				BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
				mtnumBD = mtnumBD.add(new BigDecimal(1));
				
				tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
				tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
				
				vnumd = mtnumBD.intValue();
				
				tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
				
				asTabel0f.setTcomm(tcomm);
				if(!(asTabel0fDao.aggiorna(asTabel0f))){
					chiudi();
				}
				asTabel0fDao.detach(asTabel0f);
			}else if(StringUtils.equals(caus, "B")){
				String bfido = StringUtils.join(causaleOasi, "-", StringUtils.trim(msvOA_MovimentiTestate.getnMovDdt()), "-", StringUtils.trim(msvOA_MovimentiTestate.getCodMag()));
				List<AsBofor0f> asBofor0fTmp = asBofor0fDao.getDaBfdatBfcofBfido(vdatr, new BigDecimal(vcocf), bfido);
				if(asBofor0fTmp.size() > 1){
					log.error("Piu' di una bolla con lo stesso identificativo " + vdatr + " " + vcocf + " " + bfido);
					chiudi();
				}
				
				if(asBofor0fTmp.isEmpty()){
					AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("A", StringUtils.leftPad(vndep.toString(), 2, "0")));
					String tcomm = StringUtils.trim(asTabel0f.getTcomm());
					String tcommmtnum = StringUtils.left(tcomm, 5);
					String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
					String tcommmtnuz = StringUtils.right(tcomm, 2);
					
					BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
					mtnumBD = mtnumBD.add(new BigDecimal(1));
					
					tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
					tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
					
					vnumd = mtnumBD.intValue();
					
					tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
					
					asTabel0f.setTcomm(tcomm);
					if(!(asTabel0fDao.aggiorna(asTabel0f))){
						chiudi();
					}
					asTabel0fDao.detach(asTabel0f);
				}else{
					vnumd = asBofor0fTmp.get(0).getId().getBfnum();
				}
			}else if(StringUtils.equals(caus, "I")){
				vnumd = Integer.parseInt(StringUtils.right(msvOA_MovimentiTestate.getIdUnivocoTes(), 5));
				vnumd = vnumd % 100000; // vnumd sempre sotto 99999
			}
			
			vprog = 0;
			
			Boolean prezzoIvato = false;
			if(Integer.compare(msvOA_MovimentiTestate.getTipoPrezzo(), 1) == 0){
				prezzoIvato = true;
			}
			
			Boolean primoRigo = true;
			BigDecimal importoDocumento = new BigDecimal(0);
			String utente = "";
			
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = new MsvOA_MovimentiRighe();
			
			msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTesNonElaborate(msvOA_MovimentiTestate.getIdUnivocoTes());
			
			// aggiungo le righe di eventuale acconto
			BigDecimal importoAcconto = new BigDecimal(0);
			
			MsvOA_PrimaNota_Righe msvOA_PrimaNota_Righe = new MsvOA_PrimaNota_Righe();
			
			msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNReg(msvOA_MovimentiTestate.getIdPntNReg());
			
			Iterator<MsvOA_PrimaNota_Righe> iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			while(iter_msvOA_PrimaNota_RigheLs.hasNext()){
				msvOA_PrimaNota_Righe = iter_msvOA_PrimaNota_RigheLs.next();
				
				if(StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "G") && StringUtils.equals(StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor()), "08100")){
					importoAcconto = importoAcconto.add(msvOA_PrimaNota_Righe.getDare());
					importoAcconto = importoAcconto.add(msvOA_PrimaNota_Righe.getAvere());
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
				msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
				msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
			}
			importoAcconto = Support.arrotonda(importoAcconto, 2);
			if(importoAcconto.compareTo(new BigDecimal(0)) > 0){
				// devo calcolare le proporzioni in base a tutti i codici iva usati
				MsvOA_PrimaNota_Iva msvOA_PrimaNota_Iva = new MsvOA_PrimaNota_Iva();
				
				msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaDao.getDaNReg(msvOA_MovimentiTestate.getIdPntNReg());
				
				Iterator<MsvOA_PrimaNota_Iva> iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
				iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
				while(iter_msvOA_PrimaNota_IvaLs.hasNext()){
					msvOA_PrimaNota_Iva = iter_msvOA_PrimaNota_IvaLs.next();
					importoDocumento = importoDocumento.add(msvOA_PrimaNota_Iva.getImponibile());
				}
				
				Integer numRighe = msvOA_MovimentiRigheLs.size();
				MsvOA_MovimentiRighe msvOA_MovimentiRigheUltimo = msvOA_MovimentiRigheLs.get(numRighe - 1);
				
				msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaDao.getDaNReg(msvOA_MovimentiTestate.getIdPntNReg());
				iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
				while(iter_msvOA_PrimaNota_IvaLs.hasNext()){
					msvOA_PrimaNota_Iva = iter_msvOA_PrimaNota_IvaLs.next();
					
					BigDecimal importoAccontoPerAliquota = importoAcconto;
					if((importoDocumento.compareTo(new BigDecimal(0)) > 0) && (msvOA_PrimaNota_Iva.getImponibile().compareTo(new BigDecimal(0)) > 0)){
						importoAccontoPerAliquota = importoAcconto.multiply(msvOA_PrimaNota_Iva.getImponibile());
						importoAccontoPerAliquota = importoAccontoPerAliquota.divide(importoDocumento, 2, RoundingMode.HALF_UP);
					}
					
					numRighe++;
					
					String idUnivocoRiga = StringUtils.join(msvOA_MovimentiRigheUltimo.getId().getIdUnivocoTes(), StringUtils.leftPad(numRighe.toString(), 5, "0"));
					
					MsvOA_MovimentiRighePKey idAcconto = new MsvOA_MovimentiRighePKey();
					idAcconto.setIdUnivocoTes(msvOA_MovimentiRigheUltimo.getId().getIdUnivocoTes());
					idAcconto.setIdUnivocoRiga(idUnivocoRiga);
					MsvOA_MovimentiRighe msvOA_MovimentiRighe_Acconto = new MsvOA_MovimentiRighe();
					msvOA_MovimentiRighe_Acconto.setId(idAcconto);
					msvOA_MovimentiRighe_Acconto.setCodArticoloOasi("");
					msvOA_MovimentiRighe_Acconto.setCodLungoOasi("");
					msvOA_MovimentiRighe_Acconto.setCodArticoloCascino("/ACCO");
					msvOA_MovimentiRighe_Acconto.setQta(new BigDecimal(-1));
					msvOA_MovimentiRighe_Acconto.setPrezzoNetto(importoAccontoPerAliquota);
					msvOA_MovimentiRighe_Acconto.setPrezzoNettoIvaTes(new BigDecimal(0));
					msvOA_MovimentiRighe_Acconto.setCodIvaRiga(msvOA_PrimaNota_Iva.getCodIva());
					msvOA_MovimentiRighe_Acconto.setCosto(new BigDecimal(0));
					msvOA_MovimentiRighe_Acconto.setCodOperatore("");
					msvOA_MovimentiRighe_Acconto.setValoreOmaggio(new BigDecimal(0));
					msvOA_MovimentiRighe_Acconto.setScontoOmaggio(new BigDecimal(0));
					msvOA_MovimentiRighe_Acconto.setTipoOperazione("");
					msvOA_MovimentiRigheLs.add(msvOA_MovimentiRighe_Acconto);
				}
			}
			
			Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			while(iter_msvOA_MovimentiRigheLs.hasNext()){
				msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
				
				if(primoRigo){
					primoRigo = false;
					utente = StringUtils.left(msvOA_MovimentiRighe.getCodOperatore(), 5);
					importoDocumento = new BigDecimal(0);
				}
				
				String vprogStr = StringUtils.trim(StringUtils.removeStart(msvOA_MovimentiRighe.getId().getIdUnivocoRiga(), msvOA_MovimentiRighe.getId().getIdUnivocoTes()));
				vprog = Integer.parseInt(vprogStr);
				
				vcoda = StringUtils.upperCase(StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloCascino()));
				if(StringUtils.isBlank(vcoda)){
					vcoda = StringUtils.join("OA", StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloOasi()));
				}
				
				if(StringUtils.equals(caus, "M")){
					segnoQty = new BigDecimal(-1);
				}
				vquan = msvOA_MovimentiRighe.getQta().multiply(segnoQty);
				
				vprez = msvOA_MovimentiRighe.getPrezzoNetto();
				vsco1 = new BigDecimal(0);
				vsco2 = new BigDecimal(0);
				vsco3 = new BigDecimal(0);
				vsco4 = new BigDecimal(0);
				vcost = msvOA_MovimentiRighe.getCosto();
				
				importoDocumento = importoDocumento.add(vprez.multiply(vquan));
				
				// gestione omaggio
				if((vprez.compareTo(new BigDecimal(0)) == 0) && (msvOA_MovimentiRighe.getValoreOmaggio().compareTo(new BigDecimal(0)) > 0)){
					vprez = msvOA_MovimentiRighe.getValoreOmaggio();
					vsco1 = msvOA_MovimentiRighe.getScontoOmaggio();
					log.info("Articolo in omaggio con sconto: " + vsco1);
					if(vsco1.compareTo(new BigDecimal(99.99)) > 0){
						vsco1 = new BigDecimal(99.99);
					}
				}
				
				if(StringUtils.equals(caus, "S")){
					AsPrzac0f asPrzac0f = asPrzac0fDao.getDaPzcod(vcoda);
					if(asPrzac0f != null){
						vcost = asPrzac0f.getPzult();
						vcost = Support.arrotonda(vcost, 4);
					}
					if(vcost.compareTo(new BigDecimal(0)) < 0){
						vcost = new BigDecimal(0);
					}
				}
				
				vciva = StringUtils.trim(msvOA_MovimentiRighe.getCodIvaRiga());
				if(StringUtils.endsWith(vciva, ".") && !(StringUtils.equals(vciva, "BU."))){
					vciva = StringUtils.removeEnd(vciva, ".");
				}else{
					vciva = transCodiciIva(vciva, "oasi2as");
					if(StringUtils.isBlank(vciva)){
						log.error("Codice: " + msvOA_MovimentiRighe.getCodIvaRiga() + " non gestito");
						vciva = "22";
					}
				}
				
				if(StringUtils.equals(vciva, "90") || StringUtils.equals(vciva, "91")){ // reverse charge - 90 cellulari - 91 informatica
					// se il cliente non ha partita iva e in clcnor ne 90 e nemmeno 91, allora faccio iva ordinaria
					AsClien00f asClien00f = asClien00fDao.getDaClccli(new BigDecimal(vcocf));
					if((asClien00f != null) && (Integer.compare(asClien00f.getClcpiv().intValue(), 0) > 0)){
						if(!(StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "90") || StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "91"))){
							// vciva = "22"; se oasi l'ha aftto in reverse, non lo trasformo in 22%
							log.warn("In oasi il cliente e' con reverse, controllare perche' in sirio non lo e'!");
						}
					}else{
						vciva = "22";
					}
					if(StringUtils.equals(caus, "G") || StringUtils.equals(caus, "I")){
						vciva = "22";
					}
				}
				
				if(StringUtils.equals(vciva, "Y5")){
					vciva = "22";
				}
				
				valiv = new BigDecimal(asTabge00fDao.getAliquotaIva(vciva));
				valiv = valiv.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
				if(prezzoIvato && (!(StringUtils.equals(msvOA_MovimentiRighe.getCodArticoloCascino(), "/ACCO")))){
					try{
						vprez = vprez.divide((new BigDecimal(1)).add(valiv.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)), 4, RoundingMode.HALF_UP);
					}catch(ArithmeticException e){
						log.error("calcolo vprez " + "vprez: " + vprez + ", vciva: " + vciva);
					}
				}
				vprez = Support.arrotonda(vprez, 4);
				
				// e' importante che sia stato gia' fatto lo scorporo al 22% e poi applicato cod iva 88
				if(StringUtils.equals(msvOA_MovimentiTestate.getCodIvaTes(), "88") || StringUtils.equals(msvOA_MovimentiTestate.getCodIvaTes(), "88.")){
					log.info("forzato con iva 88");
					vciva = "88";
				}
				
				vimps = new BigDecimal(0);
				
				if(StringUtils.equals(vtimo, "C")){
					vtcve = "P";
					vtpac = "";
				}else if(StringUtils.equals(vtimo, "F")){
					vtcve = "";
					vtpac = "F";
				}else if(StringUtils.equals(vtimo, "A")){
					vtcve = "";
					vtpac = "";
				}
				
				// il costo e' gia' senza iva
				if(vcost.compareTo(new BigDecimal(-999999)) == 0){
					log.warn("costo non definito, messo al prezzo");
					vcost = vprez; // margine 0
				}
				
				vvkit = "";
				vvfit = "";
				AsAnmag0f asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(vcoda);
				if(asAnmag0f != null){
					vdesc = asAnmag0f.getMdesc();
					if(StringUtils.equals(asAnmag0f.getMckit(), "KT")){
						vvkit = "K";
					}
					if(StringUtils.equals(asAnmag0f.getMclin(), "0") || StringUtils.equals(asAnmag0f.getMclin(), "1") || StringUtils.equals(asAnmag0f.getMclin(), "2") || StringUtils.equals(asAnmag0f.getMclin(), "3") || StringUtils.equals(asAnmag0f.getMclin(), "Y")){
						vvfit = "S";
					}
				}else{
					log.warn(vcoda + " non presente in anmag");
					vdesc = "NON ANCORA CODIFICATO";
				}
				
				vcusr = "JAVAP";
				
				vcven = StringUtils.left(msvOA_MovimentiRighe.getCodOperatore(), 5);
				
				vidoa = StringUtils.left(msvOA_MovimentiRighe.getId().getIdUnivocoTes(), 10);
				
				AsMovma0fPKey id = new AsMovma0fPKey();
				id.setVdatr(vdatr);
				id.setVcaus(vcaus);
				id.setVnura(vnura);
				id.setVnumd(vnumd);
				id.setVprog(vprog);
				AsMovma0f asMovma0f = new AsMovma0f();
				asMovma0f.setId(id);
				asMovma0f.setVdain(vdain);
				asMovma0f.setVorin(vorin);
				asMovma0f.setVcoda(vcoda);
				asMovma0f.setVdesc(vdesc);
				asMovma0f.setVcocf(vcocf);
				asMovma0f.setVricl(vricl);
				asMovma0f.setVndep(vndep);
				asMovma0f.setVquan(vquan);
				asMovma0f.setVprez(vprez);
				asMovma0f.setVsco1(vsco1);
				asMovma0f.setVsco2(vsco2);
				asMovma0f.setVsco3(vsco3);
				asMovma0f.setVsco4(vsco4);
				asMovma0f.setVciva(vciva);
				asMovma0f.setValiv(valiv);
				asMovma0f.setVimps(vimps);
				asMovma0f.setVcocr(vcocr);
				asMovma0f.setVoven(voven);
				asMovma0f.setVtcve(vtcve);
				asMovma0f.setVcost(vcost);
				asMovma0f.setVtpac(vtpac);
				asMovma0f.setVvkit(vvkit);
				asMovma0f.setVcusr(vcusr);
				asMovma0f.setVcven(vcven);
				asMovma0f.setVidoa(vidoa);
				asMovma0f.setVtimo(vtimo);
				asMovma0f.setVvfit(vvfit);
				
				Boolean ardepDaAggiornare = true;
				
				AsMovma0f asMovma0fTmp = asMovma0fDao.getDaId(vdatr, vcaus, vnura, vnumd, vprog);
				if(asMovma0fTmp == null){ // nuova quindi insert
					if(!(asMovma0fDao.salva(asMovma0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					BigDecimal vquanVecchia = asMovma0fTmp.getVquan();
					
					// non modifico il canale, se quello gia' presente in movma non e' NG e quello ricevuto e' NG
					// quindi se ho impostato a mano un canale, ad es. BE su delle vendite, ma oasi mi dice che e' NG, allora non lo cambio, mantenendo BE
					if(!(StringUtils.equals(asMovma0fTmp.getVoven(), "NG")) && StringUtils.equals(asMovma0f.getVoven(), "NG")){
						log.info("Mantengo il canale a " + asMovma0fTmp.getVoven() + ", non lo imposto a " + asMovma0f.getVoven());
						asMovma0f.setVoven(asMovma0fTmp.getVoven());
					}
					
					if(!(asMovma0fDao.aggiorna(asMovma0f))){
						chiudi();
					}
					
					if(vquanVecchia.compareTo(vquan) != 0){
						log.warn("Modifica quantita', originale: " + vquanVecchia + ", nuova: " + vquan);
						vquan = vquan.subtract(vquanVecchia);
					}else{
						ardepDaAggiornare = false;
					}
					asMovma0fDao.detach(asMovma0fTmp);
				}
				asMovma0fDao.detach(asMovma0f);
				
				// gestione Movoa0f
				// String vidoa = "";
				String voaca = "";
				String voanm = "";
				String voads = "";
				Integer voadd = 0;
				
				voaca = msvOA_MovimentiTestate.getCausaleOasi();
				voanm = msvOA_MovimentiTestate.getnMovDdt();
				voads = msvOA_MovimentiTestate.getNroDoc();
				String voaddTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataDoc());
				voadd = Integer.parseInt(voaddTxt);
				
				AsMovoa0f asMovoa0f = new AsMovoa0f();
				asMovoa0f.setVidoa(vidoa);
				asMovoa0f.setVoaca(voaca);
				asMovoa0f.setVoanm(voanm);
				asMovoa0f.setVoads(voads);
				asMovoa0f.setVoadd(voadd);
				
				AsMovoa0f asMovoa0fTmp = asMovoa0fDao.getDaId(vidoa);
				if(asMovoa0fTmp == null){ // nuova quindi insert
					if(!(asMovoa0fDao.salva(asMovoa0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					if(!(asMovoa0fDao.aggiorna(asMovoa0f))){
						chiudi();
					}
					asMovoa0fDao.detach(asMovoa0fTmp);
				}
				asMovoa0fDao.detach(asMovoa0f);
				
				// gestione ardep0f
				if(ardepDaAggiornare){
					String datTxt = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
					AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(vcoda, vndep);
					if(asArdep0f == null){ // nuova quindi insert
						String dcoda = vcoda;
						Integer dcode = vndep;
						AsArdep0fPKey idard = new AsArdep0fPKey();
						idard.setDcoda(dcoda);
						idard.setDcode(dcode);
						asArdep0f = new AsArdep0f();
						asArdep0f.setId(idard);
						asArdep0f.setDgdif(new BigDecimal(0));
						asArdep0f.setDauco(new BigDecimal(0));
						BigDecimal qta = new BigDecimal(0);
						switch(caus){
							case "B":
								qta = qta.add(vquan);
								asArdep0f.setDatuc(datTxt);
								asArdep0f.setDatus("0");
								break;
							case "G":
							case "D":
							case "E":
							case "M":
							case "S":
							case "I":
								qta = qta.subtract(vquan);
								asArdep0f.setDatuc("0");
								asArdep0f.setDatus(datTxt);
								if(StringUtils.equals(caus, "S")){
									asArdep0f.setDauco(asArdep0f.getDauco().add(vquan));
								}
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						asArdep0f.setDgiac(qta);
						asArdep0f.setDatin("0");
						asArdep0f.setDscmi(new BigDecimal(0));
						asArdep0f.setDscma(new BigDecimal(0));
						asArdep0f.setDamma(new BigDecimal(0));
						if(!(asArdep0fDao.salva(asArdep0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						BigDecimal qta = asArdep0f.getDgiac();
						switch(caus){
							case "B":
								qta = qta.add(vquan);
								asArdep0f.setDatuc(datTxt);
								asArdep0f.setDatus(asArdep0f.getDatus());
								break;
							case "G":
							case "D":
							case "E":
							case "M":
							case "S":
							case "I":
								qta = qta.subtract(vquan);
								asArdep0f.setDatuc(asArdep0f.getDatuc());
								asArdep0f.setDatus(datTxt);
								if(StringUtils.equals(caus, "S")){
									asArdep0f.setDauco(asArdep0f.getDauco().add(vquan));
								}
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						asArdep0f.setDgiac(qta);
						if(!(asArdep0fDao.aggiorna(asArdep0f))){
							chiudi();
						}
					}
					asArdep0fDao.detach(asArdep0f);
				}
				
				// elimina dalla tabella scritta da oasi
				// msvOA_MovimentiRigheDao.elimina(msvOA_MovimentiRighe);
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiRighe.getTipoOperazione(), 2));
				msvOA_MovimentiRighe.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiRigheDao.aggiorna(msvOA_MovimentiRighe);
				msvOA_MovimentiRigheDao.detach(msvOA_MovimentiRighe);
			}
			
			if(StringUtils.equals(caus, "E")){
				Integer bdatd = vdatr;
				Integer bnura = vnura;
				Integer bnumd = vnumd;
				String btide = "C";
				BigDecimal bcodi = new BigDecimal(vcocf);
				String bcaus = vcaus;
				BigDecimal bimpb = Support.arrotonda(importoDocumento, 2);
				String bfatt = "";
				
				String bpaga = "001";
				String bpagaTxt = StringUtils.trim(msvOA_MovimentiTestate.getCodPagamento());
				if(StringUtils.containsOnly(bpagaTxt, "0123456789")){
					bpaga = StringUtils.leftPad(bpagaTxt, 3, "0");
				}else{ // e' un codice oasi, devo fare transcodifica
					bpagaTxt = transPagamenti(bpagaTxt, "oasi2as");
					if(StringUtils.isBlank(bpagaTxt)){
						log.error("Codice: " + msvOA_MovimentiTestate.getCodPagamento() + " non gestito");
						bpagaTxt = "1"; // contanti
					}
					bpaga = StringUtils.leftPad(bpagaTxt, 3, "0");
				}
				
				String bcatr = "VE";
				String bcons = "DE";
				String buten = utente;
				String bccup = StringUtils.upperCase(StringUtils.left(msvOA_MovimentiTestate.getIpaCodiceCUP(), 15));
				String bccig = StringUtils.upperCase(StringUtils.left(msvOA_MovimentiTestate.getIpaCodiceCIG(), 15));
				String bprot = StringUtils.left(StringUtils.join(msvOA_MovimentiTestate.getIpaIdDocumento(), " ", msvOA_MovimentiTestate.getIpaCodiceCommessa()), 20);
				String bdproTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getIpaDataDocumento());
				BigDecimal bdpro = new BigDecimal(bdproTxt);
				if(bdpro.compareTo(new BigDecimal(99990101)) == 0){
					bdpro = new BigDecimal(0);
				}
				
				String bragg = "S";
				AsClien00f asClien00f = asClien00fDao.getDaClccli(bcodi);
				if(Integer.compare(StringUtils.length(StringUtils.trim(asClien00f.getClcf08())), 6) == 0){
					bragg = "E";
				}
				String bnote = StringUtils.left(msvOA_MovimentiTestate.getNroDoc(), 20);
				String bflad = "D";
				
				AsBolem0fPKey id = new AsBolem0fPKey();
				id.setBdatd(bdatd);
				id.setBnura(bnura);
				id.setBnumd(bnumd);
				AsBolem0f asBolem0f = new AsBolem0f();
				asBolem0f.setId(id);
				asBolem0f.setBtide(btide);
				asBolem0f.setBcodi(bcodi);
				asBolem0f.setBcaus(bcaus);
				asBolem0f.setBimpb(bimpb);
				asBolem0f.setBfatt(bfatt);
				asBolem0f.setBpaga(bpaga);
				asBolem0f.setBcatr(bcatr);
				asBolem0f.setBcons(bcons);
				asBolem0f.setButen(buten);
				asBolem0f.setBccup(bccup);
				asBolem0f.setBccig(bccig);
				asBolem0f.setBprot(bprot);
				asBolem0f.setBdpro(bdpro);
				asBolem0f.setBragg(bragg);
				asBolem0f.setBnote(bnote);
				asBolem0f.setBflad(bflad);
				
				AsBolem0f asBolem0fTmp = asBolem0fDao.getDaId(bdatd, bnura, bnumd);
				if(asBolem0fTmp == null){ // nuova quindi insert
					if(!(asBolem0fDao.salva(asBolem0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
						// non modifico i valori che non ricevo definiti
					asBolem0f.setBfatt(asBolem0fTmp.getBfatt());
					asBolem0f.setBflad(asBolem0fTmp.getBflad());
					if(!(asBolem0fDao.aggiorna(asBolem0f))){
						chiudi();
					}
					asBolem0fDao.detach(asBolem0fTmp);
				}
				asBolem0fDao.detach(asBolem0f);
				
				// asMovma0fDao.aggiornaVcomm(vdatr, vcaus, vnura, vnumd, "000000000FF0F000000F4040");
			}else if(StringUtils.equals(caus, "B")){
				Integer bfdat = vdatr;
				Integer bfnuz = vnura;
				Integer bfnum = vnumd;
				BigDecimal bfcof = new BigDecimal(vcocf);
				BigDecimal bfftr = new BigDecimal(0);
				
				Integer bfpag = 1;
				String bfpagTxt = StringUtils.trim(msvOA_MovimentiTestate.getCodPagamento());
				if(StringUtils.containsOnly(bfpagTxt, "0123456789")){
					bfpag = Integer.parseInt(bfpagTxt);
				}else{ // e' un codice oasi, devo fare transcodifica
					bfpagTxt = transPagamenti(bfpagTxt, "oasi2as");
					if(StringUtils.isBlank(bfpagTxt)){
						log.error("Codice: " + msvOA_MovimentiTestate.getCodPagamento() + " non gestito");
						bfpagTxt = "1"; // contanti
					}
					bfpag = Integer.parseInt(bfpagTxt);
				}
				
				String bfcau = vcaus;
				Integer bfdep = vndep;
				
				String bfdbfTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataDoc());
				Integer bfdbf = Integer.parseInt(bfdbfTxt);
				
				String bfnbf = StringUtils.left(StringUtils.trim(msvOA_MovimentiTestate.getNroDoc()), 50);
				
				String bfnom = "OASI";
				String bfute = utente;
				String bfnot = StringUtils.left(StringUtils.trim(msvOA_MovimentiTestate.getNroDoc()), 50);
				String bfido = StringUtils.join(causaleOasi, "-", StringUtils.trim(msvOA_MovimentiTestate.getnMovDdt()), "-", StringUtils.trim(msvOA_MovimentiTestate.getCodMag()));
				
				AsBofor0fPKey id = new AsBofor0fPKey();
				id.setBfdat(bfdat);
				id.setBfnuz(bfnuz);
				id.setBfnum(bfnum);
				AsBofor0f asBofor0f = new AsBofor0f();
				asBofor0f.setId(id);
				asBofor0f.setBfcof(bfcof);
				asBofor0f.setBfftr(bfftr);
				asBofor0f.setBfpag(bfpag);
				asBofor0f.setBfcau(bfcau);
				asBofor0f.setBfdep(bfdep);
				asBofor0f.setBfdbf(bfdbf);
				asBofor0f.setBfnbf(bfnbf);
				asBofor0f.setBfnom(bfnom);
				asBofor0f.setBfute(bfute);
				asBofor0f.setBfnot(bfnot);
				asBofor0f.setBfido(bfido);
				
				AsBofor0f asBofor0fTmp = asBofor0fDao.getDaId(bfdat, bfnuz, bfnum);
				if(asBofor0fTmp == null){ // nuova quindi insert
					if(!(asBofor0fDao.salva(asBofor0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
						// non modifico i valori che non ricevo definiti
					if(!(asBofor0fDao.aggiorna(asBofor0f))){
						chiudi();
					}
					asBofor0fDao.detach(asBofor0fTmp);
				}
				asBofor0fDao.detach(asBofor0f);
				
				// asMovma0fDao.aggiornaVcomm(vdatr, vcaus, vnura, vnumd, "0000000FF0F0F0F0F0F04040");
			}
			
			vimps = Support.arrotonda(importoDocumento, 2);
			asMovma0fDao.aggiornaVimps(vdatr, vcaus, vnura, vnumd, vimps);
			
			// elimina dalla tabella scritta da oasi
			// msvOA_MovimentiTestateDao.elimina(msvOA_MovimentiTestate);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
			msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
			msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
			msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
		}
		
		oasi2asMovimentiMagazzinoNonMovma();
		
		oasi2asMovimentiMagazzino2();
		
		elaboraFatture();
		
		elaboraCrediti();
		
		elaboraPagamenti();
		
		elaboraChiusuraCassa();
		
		elaboraAssistenzeInterne();
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		// scrivo la data, per far capire all'amministrazione, fino a che data sono stati caricati i movimenti
		AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("AGG", "000");
		String tcomm = StringUtils.trim(asTabel0f.getTcomm());
		String tcomm1 = StringUtils.left(tcomm, 32);
		String tcomm2 = "";
		tcomm2 = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestateDao.getMaxDataReg());
		tcomm = StringUtils.join(tcomm1, tcomm2);
		log.info("Data sync oasi: " + tcomm2);
		asTabel0f.setTcomm(tcomm);
		if(!(asTabel0fDao.aggiorna(asTabel0f))){
			chiudi();
		}
		asTabel0fDao.detach(asTabel0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asMovma0fDao.close();
		asMovoa0fDao.close();
		asBofor0fDao.close();
		asBolem0fDao.close();
		asPrzac0fDao.close();
		
		log.info("]" + "oasi2asMovimentiMagazzino");
	}
	
	private void oasi2asMovimentiMagazzinoNonMovma(){
		log.info("[" + "oasi2asMovimentiMagazzinoNonMovma");
		
		AsMovtr0fDao asMovtr0fDao = new AsMovtr0fDaoMng();
		
		stringBuilder = new StringBuilder();
		
		MsvOA_MovimentiTestate msvOA_MovimentiTestate = new MsvOA_MovimentiTestate();
		
		msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getAll();
		
		// solo alcuni movimenti
		// msvOA_MovimentiTestateLs.clear();
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C00002511"));
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C00004633"));
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C00004136"));
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C00006769"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_MovimentiTestate> iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		while(iter_msvOA_MovimentiTestateLs.hasNext()){
			msvOA_MovimentiTestate = iter_msvOA_MovimentiTestateLs.next();
			
			String vcaus = "";
			
			Integer mtdat = 0;
			Integer mtnuz = 0;
			Integer mtnum = 0;
			Integer mtnur = 0;
			String mtcod = "";
			BigDecimal mtqua = new BigDecimal(0);
			BigDecimal mtqri = new BigDecimal(0);
			Integer mtdpp = 0;
			Integer mtdpa = 0;
			Integer mtime = 0;
			String mtute = "";
			String mtutr = "";
			String mtsta = "";
			Integer mtdar = 0;
			Integer mtimr = 0;
			String mtumi = "";
			
			String causaleOasi = msvOA_MovimentiTestate.getCausaleOasi();
			Integer tipoDocumento = msvOA_MovimentiTestate.getDocumAccomp();
			
			vcaus = transCausaliMag(causaleOasi, "oasi2as");
			if(StringUtils.isBlank(vcaus)){
				continue; // non e' tra le causali contemplate
			}
			
			vcaus = "";
			if(StringUtils.equals(causaleOasi, "SCMA") || StringUtils.equals(causaleOasi, "CAMA")){
				if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "+";
				}else if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "+";
				}else if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "+"; // cosa e' con -1?
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
			}
			
			// if(StringUtils.equals(causaleOasi, "ACFF")){
			// tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
			// msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
			// msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
			// // documento d'acconto non movimenta magazzino, quindi continuo
			// continue;
			// }
			
			if(StringUtils.isBlank(vcaus)){
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			log.info("Elaboro: " + msvOA_MovimentiTestate.getIdUnivocoTes());
			
			String vdatrTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataReg());
			mtdat = Integer.parseInt(vdatrTxt);
			
			mtute = msvOA_MovimentiTestate.getnMovDdt();
			
			Boolean movtrDaInserire = false;
			Boolean movtrDaAggiornare = false;
			Boolean ardepDaScrivere = false;
			// Boolean trasferimentoDaIngrosso = false;
			
			if(StringUtils.equals(causaleOasi, "SCMA")){
				mtdpp = Integer.parseInt(transDeposito(StringUtils.trim(msvOA_MovimentiTestate.getCodMag()), "oasi2as"));
				mtdpa = Integer.parseInt(transDeposito(StringUtils.trim(msvOA_MovimentiTestate.getCodCliFor()), "oasi2as"));
				
				movtrDaInserire = true;
				if((Integer.compare(mtdpa, 1) == 0) || (Integer.compare(mtdpa, 3) == 0)){
					movtrDaInserire = false; // e' gia' stato creato a partire da OA_Tresferimenti
				}
				movtrDaAggiornare = false;
				ardepDaScrivere = true;
			}else if(StringUtils.equals(causaleOasi, "CAMA")){
				mtdpp = Integer.parseInt(transDeposito(StringUtils.trim(msvOA_MovimentiTestate.getCodCliFor()), "oasi2as"));
				mtdpa = Integer.parseInt(transDeposito(StringUtils.trim(msvOA_MovimentiTestate.getCodMag()), "oasi2as"));
				
				movtrDaInserire = false;
				movtrDaAggiornare = true;
				ardepDaScrivere = true;
				if((Integer.compare(mtdpp, 1) == 0) || (Integer.compare(mtdpp, 3) == 0)){
					movtrDaAggiornare = false; // e' gia' stato scritto su AS400
					ardepDaScrivere = false;
				}
				if(StringUtils.contains(msvOA_MovimentiTestate.getNroDoc(), "/")){
					mtute = StringUtils.split(msvOA_MovimentiTestate.getNroDoc(), "/")[1];
				}
			}else{
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			if(movtrDaInserire){
				AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("T", StringUtils.leftPad(mtdpp.toString(), 2, "0")));
				String tcomm = StringUtils.trim(asTabel0f.getTcomm());
				String tcommmtnum = StringUtils.left(tcomm, 5);
				String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
				String tcommmtnuz = StringUtils.right(tcomm, 2);
				
				BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
				mtnumBD = mtnumBD.add(new BigDecimal(1));
				
				tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
				tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
				
				mtnuz = Integer.parseInt(tcommmtnuz);
				mtnum = mtnumBD.intValue();
				
				tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
				
				asTabel0f.setTcomm(tcomm);
				if(!(asTabel0fDao.aggiorna(asTabel0f))){
					chiudi();
				}
				asTabel0fDao.detach(asTabel0f);
			}
			
			mtime = 1;
			
			Integer dataNum = 0;
			try{
				DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
				Date dataMov = formatter.parse(mtdat.toString());
				
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(dataMov);
				calendar.add(Calendar.MONTH, -3);
				dataMov = calendar.getTime();
				String dataTxt = formatter.format(dataMov);
				dataNum = Integer.parseInt(dataTxt);
			}catch(ParseException e){
				log.error("eccezione in conversione data");
				chiudi();
			}
			
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = new MsvOA_MovimentiRighe();
			
			msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTesNonElaborate(msvOA_MovimentiTestate.getIdUnivocoTes());
			
			Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			while(iter_msvOA_MovimentiRigheLs.hasNext()){
				msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
				
				mtnur = Integer.parseInt(StringUtils.removeStart(msvOA_MovimentiRighe.getId().getIdUnivocoRiga(), msvOA_MovimentiRighe.getId().getIdUnivocoTes()));
				
				mtcod = StringUtils.upperCase(StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloCascino()));
				if(StringUtils.isBlank(mtcod)){
					mtcod = StringUtils.join("OA", StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloOasi()));
				}
				
				if(StringUtils.equals(causaleOasi, "SCMA")){
					mtqua = msvOA_MovimentiRighe.getQta();
					mtutr = "";
					mtsta = "";
					mtdar = 0;
					mtimr = 0;
				}else if(StringUtils.equals(causaleOasi, "CAMA")){
					mtqri = msvOA_MovimentiRighe.getQta();
					mtutr = StringUtils.trim(msvOA_MovimentiRighe.getCodOperatore());
					mtdar = mtdat;
					mtimr = 1;
					
					if(movtrDaAggiornare){
						AsMovtr0f asMovtr0fTmp = asMovtr0fDao.getDaMtdatMtdppMtdpaMtuteMtcod(dataNum, mtdpp, mtdpa, mtute, mtcod);
						if(asMovtr0fTmp == null){
							log.error("non esiste il movtr: " + ">=" + dataNum + ", " + mtdpp + ", " + mtdpa + ", " + mtute + ", " + mtcod);
							chiudi();
						}
						mtdat = asMovtr0fTmp.getId().getMtdat();
						mtnuz = asMovtr0fTmp.getId().getMtnuz();
						mtnum = asMovtr0fTmp.getId().getMtnum();
						mtnur = asMovtr0fTmp.getId().getMtnur();
						mtqua = asMovtr0fTmp.getMtqua();
						if(mtqri.compareTo(mtqua) != 0){
							log.warn("Qta attesa: " + mtqua + ", ricevuta: " + mtqri);
							mtsta = "QE"; // quantit� errata
						}else{
							mtsta = "OK";
						}
					}
				}else{
					log.error("Codice: " + causaleOasi + " non gestito");
					continue;
				}
				
				mtumi = "";
				AsAnmag0f asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(mtcod);
				if(asAnmag0f != null){
					mtumi = asAnmag0f.getMumis();
				}else{
					mtumi = "PZ";
					log.error(mtcod + " non e' in anmag0f, non e' possibile");
				}
				
				if(movtrDaInserire || movtrDaAggiornare){
					AsMovtr0fPKey id = new AsMovtr0fPKey();
					id.setMtdat(mtdat);
					id.setMtnuz(mtnuz);
					id.setMtnum(mtnum);
					id.setMtnur(mtnur);
					AsMovtr0f asMovtr0f = new AsMovtr0f();
					asMovtr0f.setId(id);
					asMovtr0f.setMtcod(mtcod);
					asMovtr0f.setMtqua(mtqua);
					asMovtr0f.setMtqri(mtqri);
					asMovtr0f.setMtdpp(mtdpp);
					asMovtr0f.setMtdpa(mtdpa);
					asMovtr0f.setMtime(mtime);
					asMovtr0f.setMtute(mtute);
					asMovtr0f.setMtutr(mtutr);
					asMovtr0f.setMtsta(mtsta);
					asMovtr0f.setMtdar(mtdar);
					asMovtr0f.setMtimr(mtimr);
					asMovtr0f.setMtumi(mtumi);
					
					AsMovtr0f asMovtr0fTmp = asMovtr0fDao.getDaId(mtdat, mtnuz, mtnum, mtnur);
					if(asMovtr0fTmp == null){ // nuova quindi insert
						// log.info("salva: " + asMovtr0f.toString());
						if(!(asMovtr0fDao.salva(asMovtr0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
							// non modifico i valori che non ricevo definiti
							// asMovtr0f.setClcpor(asMovtr0fTmp.getClcpor());
						if(!(asMovtr0fDao.aggiorna(asMovtr0f))){
							chiudi();
						}
						asMovtr0fDao.detach(asMovtr0fTmp);
					}
					asMovtr0fDao.detach(asMovtr0f);
				}
				
				// gestione ardep0f
				if(ardepDaScrivere){
					String datTxt = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
					if(StringUtils.equals(causaleOasi, "SCMA")){
						AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(mtcod, mtdpp);
						if(asArdep0f == null){ // nuova quindi insert
							String dcoda = mtcod;
							Integer dcode = mtdpp;
							AsArdep0fPKey idard = new AsArdep0fPKey();
							idard.setDcoda(dcoda);
							idard.setDcode(dcode);
							asArdep0f = new AsArdep0f();
							asArdep0f.setId(idard);
							asArdep0f.setDgiac((new BigDecimal(0)).subtract(mtqua));
							asArdep0f.setDgdif(new BigDecimal(0));
							asArdep0f.setDatuc("0");
							asArdep0f.setDatus(datTxt);
							asArdep0f.setDatin("0");
							asArdep0f.setDscmi(new BigDecimal(0));
							asArdep0f.setDscma(new BigDecimal(0));
							asArdep0f.setDauco(new BigDecimal(0));
							asArdep0f.setDamma(new BigDecimal(0));
							if(!(asArdep0fDao.salva(asArdep0f))){
								chiudi();
							}
						}else{ // gia' presente, quindi update
							BigDecimal qta = asArdep0f.getDgiac();
							qta = qta.subtract(mtqua);
							asArdep0f.setDatuc(asArdep0f.getDatuc());
							asArdep0f.setDatus(datTxt);
							
							asArdep0f.setDgiac(qta);
							if(!(asArdep0fDao.aggiorna(asArdep0f))){
								chiudi();
							}
						}
						asArdep0fDao.detach(asArdep0f);
					}else if(StringUtils.equals(causaleOasi, "CAMA")){
						AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(mtcod, mtdpa);
						if(asArdep0f == null){ // nuova quindi insert
							String dcoda = mtcod;
							Integer dcode = mtdpa;
							AsArdep0fPKey idard = new AsArdep0fPKey();
							idard.setDcoda(dcoda);
							idard.setDcode(dcode);
							asArdep0f = new AsArdep0f();
							asArdep0f.setId(idard);
							asArdep0f.setDgiac((new BigDecimal(0)).add(mtqri));
							asArdep0f.setDgdif(new BigDecimal(0));
							asArdep0f.setDatuc("0");
							asArdep0f.setDatus(datTxt);
							asArdep0f.setDatin("0");
							asArdep0f.setDscmi(new BigDecimal(0));
							asArdep0f.setDscma(new BigDecimal(0));
							asArdep0f.setDauco(new BigDecimal(0));
							asArdep0f.setDamma(new BigDecimal(0));
							if(!(asArdep0fDao.salva(asArdep0f))){
								chiudi();
							}
						}else{ // gia' presente, quindi update
							BigDecimal qta = asArdep0f.getDgiac();
							qta = qta.add(mtqri);
							asArdep0f.setDatuc(asArdep0f.getDatuc());
							asArdep0f.setDatus(datTxt);
							
							asArdep0f.setDgiac(qta);
							if(!(asArdep0fDao.aggiorna(asArdep0f))){
								chiudi();
							}
						}
						asArdep0fDao.detach(asArdep0f);
					}else{
						log.error("Codice: " + causaleOasi + " non gestito");
						continue;
					}
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiRighe.getTipoOperazione(), 2));
				msvOA_MovimentiRighe.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiRigheDao.aggiorna(msvOA_MovimentiRighe);
				msvOA_MovimentiRigheDao.detach(msvOA_MovimentiRighe);
			}
			
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
			msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
			msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
			msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
		}
		
		asMovtr0fDao.close();
		
		log.info("]" + "oasi2asMovimentiMagazzinoNonMovma");
	}
	
	private void oasi2asMovimentiMagazzino2(){
		log.info("[" + "oasi2asMovimentiMagazzino2");
		
		AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
		AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
		
		stringBuilder = new StringBuilder();
		
		MsvOA_MovimentiTestate msvOA_MovimentiTestate = new MsvOA_MovimentiTestate();
		
		msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getAll();
		
		// solo alcuni movimenti
		// msvOA_MovimentiTestateLs.clear();
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C01815248"));// RIVP
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C01815249"));// RIVN
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_MovimentiTestate> iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		while(iter_msvOA_MovimentiTestateLs.hasNext()){
			msvOA_MovimentiTestate = iter_msvOA_MovimentiTestateLs.next();
			
			Integer vdatr = 0;
			String vcaus = "";
			Integer vnura = 0;
			Integer vnumd = 0;
			Integer vprog = 0;
			Integer vdain = 0;
			Integer vorin = 0;
			String vcoda = "";
			String vdesc = "";
			Integer vcocf = 0;
			Integer vricl = 0;
			Integer vndep = 0;
			BigDecimal vquan = new BigDecimal(0);
			BigDecimal vprez = new BigDecimal(0);
			BigDecimal vsco1 = new BigDecimal(0);
			BigDecimal vsco2 = new BigDecimal(0);
			BigDecimal vsco3 = new BigDecimal(0);
			BigDecimal vsco4 = new BigDecimal(0);
			String vciva = "";
			BigDecimal valiv = new BigDecimal(0);
			BigDecimal vimps = new BigDecimal(0);
			String vcocr = "";
			String voven = "";
			String vtcve = "";
			BigDecimal vcost = new BigDecimal(0);
			String vtpac = "";
			String vvkit = "";
			String vcusr = "";
			String vcven = "";
			String vidoa = "";
			String vtimo = "";
			String vvfit = "";
			
			BigDecimal segnoQty = new BigDecimal(1);
			
			String causaleOasi = msvOA_MovimentiTestate.getCausaleOasi();
			Integer tipoDocumento = msvOA_MovimentiTestate.getDocumAccomp();
			
			vcaus = transCausaliMag(causaleOasi, "oasi2as");
			if(StringUtils.isBlank(vcaus)){
				continue; // non e' tra le causali contemplate
			}
			
			vcaus = "";
			if(StringUtils.equals(causaleOasi, "RIVP") || StringUtils.equals(causaleOasi, "RIVN")){
				if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "V";
				}else if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "V";
				}else if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "V";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "A";
			}
			if(StringUtils.equals(causaleOasi, "CACB") || StringUtils.equals(causaleOasi, "SCCB")){
				if(Integer.compare(tipoDocumento, 1) == 0){
					vcaus = "G";
				}else if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "G";
				}else if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "G";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "C";
				vcocr = "C";
				vtcve = "P";
			}
			
			if(StringUtils.isBlank(vcaus)){
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			log.info("Elaboro: " + msvOA_MovimentiTestate.getIdUnivocoTes());
			
			String vdatrTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataReg());
			vdatr = Integer.parseInt(vdatrTxt);
			vdain = vdatr;
			vorin = 1;
			
			String codCliFor = StringUtils.trim(msvOA_MovimentiTestate.getCodCliFor());
			if(StringUtils.equals(codCliFor, "008")){
				log.warn("Deposito " + codCliFor + ", non consetito con queste causali");
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
				msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
				msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
				continue;
			}
			
			vndep = Integer.parseInt(transDeposito(codCliFor, "oasi2as"));
			
			vcaus = StringUtils.join(vcaus, StringUtils.leftPad(vndep.toString(), 2, "0"));
			
			String caus = StringUtils.left(vcaus, 1);
			
			vnura = 1;
			
			if(StringUtils.equals(causaleOasi, "RIVP")){
				vnumd = Integer.parseInt(msvOA_MovimentiTestate.getnMovDdt());
				vnumd = vnumd + 90000;
			}else if(StringUtils.equals(causaleOasi, "RIVN")){
				vnumd = Integer.parseInt(msvOA_MovimentiTestate.getnMovDdt());
			}else if(StringUtils.equals(causaleOasi, "CACB")){
				vnumd = Integer.parseInt(msvOA_MovimentiTestate.getnMovDdt());
				vnumd = vnumd + 90000;
			}else if(StringUtils.equals(causaleOasi, "SCCB")){
				vnumd = Integer.parseInt(msvOA_MovimentiTestate.getnMovDdt());
			}else{
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = new MsvOA_MovimentiRighe();
			
			msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTesNonElaborate(msvOA_MovimentiTestate.getIdUnivocoTes());
			
			Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			while(iter_msvOA_MovimentiRigheLs.hasNext()){
				msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
				
				vprog = Integer.parseInt(StringUtils.removeStart(msvOA_MovimentiRighe.getId().getIdUnivocoRiga(), msvOA_MovimentiRighe.getId().getIdUnivocoTes()));
				
				vcoda = StringUtils.upperCase(StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloCascino()));
				if(StringUtils.isBlank(vcoda)){
					vcoda = StringUtils.join("OA", StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloOasi()));
				}
				
				vvkit = "";
				vvfit = "";
				AsAnmag0f asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(vcoda);
				if(asAnmag0f != null){
					vdesc = asAnmag0f.getMdesc();
					if(StringUtils.equals(asAnmag0f.getMckit(), "KT")){
						vvkit = "K";
					}
					if(StringUtils.equals(asAnmag0f.getMclin(), "0") || StringUtils.equals(asAnmag0f.getMclin(), "1") || StringUtils.equals(asAnmag0f.getMclin(), "2") || StringUtils.equals(asAnmag0f.getMclin(), "3") || StringUtils.equals(asAnmag0f.getMclin(), "Y")){
						vvfit = "S";
					}
				}else{
					log.warn(vcoda + " non presente in anmag");
					vdesc = "NON ANCORA CODIFICATO";
				}
				
				if(StringUtils.equals(causaleOasi, "RIVP")){
					segnoQty = new BigDecimal(-1);
				}else if(StringUtils.equals(causaleOasi, "RIVN")){
					segnoQty = new BigDecimal(1);
				}else if(StringUtils.equals(causaleOasi, "CACB")){
					segnoQty = new BigDecimal(-1);
				}else if(StringUtils.equals(causaleOasi, "SCCB")){
					segnoQty = new BigDecimal(1);
				}else{
					log.error("Codice: " + causaleOasi + " non gestito");
					continue;
				}
				
				vprez = msvOA_MovimentiRighe.getPrezzoNetto();
				vcost = msvOA_MovimentiRighe.getCosto();
				
				if((vcost.compareTo(new BigDecimal(0)) == 0) || (vcost.compareTo(new BigDecimal(-500000)) == -1)){ // oasi passa -999999 quando il costo e' indefinito
					AsPrzac0f asPrzac0f = asPrzac0fDao.getDaPzcod(vcoda);
					if(asPrzac0f != null){
						vcost = asPrzac0f.getPzult();
						vcost = Support.arrotonda(vcost, 4);
					}
					if(vcost.compareTo(new BigDecimal(0)) < 0){
						vcost = new BigDecimal(0);
					}
				}
				
				if(StringUtils.equals(causaleOasi, "CACB") || StringUtils.equals(causaleOasi, "SCCB")){
					vprez = new BigDecimal(0);
					vcost = new BigDecimal(0);
				}
				
				vquan = msvOA_MovimentiRighe.getQta().multiply(segnoQty);
				
				voven = "NG";
				
				vcusr = "JAVAP";
				
				vcven = StringUtils.left(msvOA_MovimentiRighe.getCodOperatore(), 5);
				
				vidoa = StringUtils.left(msvOA_MovimentiRighe.getId().getIdUnivocoTes(), 10);
				
				if(vquan.compareTo(new BigDecimal(0)) != 0){
					AsMovma0fPKey id = new AsMovma0fPKey();
					id.setVdatr(vdatr);
					id.setVcaus(vcaus);
					id.setVnura(vnura);
					id.setVnumd(vnumd);
					id.setVprog(vprog);
					AsMovma0f asMovma0f = new AsMovma0f();
					asMovma0f.setId(id);
					asMovma0f.setVdain(vdain);
					asMovma0f.setVorin(vorin);
					asMovma0f.setVcoda(vcoda);
					asMovma0f.setVdesc(vdesc);
					asMovma0f.setVcocf(vcocf);
					asMovma0f.setVricl(vricl);
					asMovma0f.setVndep(vndep);
					asMovma0f.setVquan(vquan);
					asMovma0f.setVprez(vprez);
					asMovma0f.setVsco1(vsco1);
					asMovma0f.setVsco2(vsco2);
					asMovma0f.setVsco3(vsco3);
					asMovma0f.setVsco4(vsco4);
					asMovma0f.setVciva(vciva);
					asMovma0f.setValiv(valiv);
					asMovma0f.setVimps(vimps);
					asMovma0f.setVcocr(vcocr);
					asMovma0f.setVoven(voven);
					asMovma0f.setVtcve(vtcve);
					asMovma0f.setVcost(vcost);
					asMovma0f.setVtpac(vtpac);
					asMovma0f.setVvkit(vvkit);
					asMovma0f.setVcusr(vcusr);
					asMovma0f.setVcven(vcven);
					asMovma0f.setVidoa(vidoa);
					asMovma0f.setVtimo(vtimo);
					asMovma0f.setVvfit(vvfit);
					
					AsMovma0f asMovma0fTmp = asMovma0fDao.getDaId(vdatr, vcaus, vnura, vnumd, vprog);
					if(asMovma0fTmp == null){ // nuova quindi insert
						if(!(asMovma0fDao.salva(asMovma0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						if(!(asMovma0fDao.aggiorna(asMovma0f))){
							chiudi();
						}
						asMovma0fDao.detach(asMovma0fTmp);
					}
					asMovma0fDao.detach(asMovma0f);
					
					// gestione ardep0f
					AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(vcoda, vndep);
					if(asArdep0f == null){ // nuova quindi insert
						String dcoda = vcoda;
						Integer dcode = vndep;
						AsArdep0fPKey idard = new AsArdep0fPKey();
						idard.setDcoda(dcoda);
						idard.setDcode(dcode);
						asArdep0f = new AsArdep0f();
						asArdep0f.setId(idard);
						asArdep0f.setDgdif(new BigDecimal(0));
						asArdep0f.setDatuc("0");
						asArdep0f.setDatus("0");
						asArdep0f.setDatin("0");
						asArdep0f.setDscmi(new BigDecimal(0));
						asArdep0f.setDscma(new BigDecimal(0));
						asArdep0f.setDauco(new BigDecimal(0));
						asArdep0f.setDamma(new BigDecimal(0));
						switch(caus){
							case "V":
								asArdep0f.setDgiac((new BigDecimal(0)).subtract(vquan));
								asArdep0f.setDamma((new BigDecimal(0)).add(vquan));
								break;
							case "G":
								asArdep0f.setDgiac((new BigDecimal(0)).subtract(vquan));
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						if(!(asArdep0fDao.salva(asArdep0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						BigDecimal qta = asArdep0f.getDgiac();
						switch(caus){
							case "V":
								qta = qta.subtract(vquan);
								asArdep0f.setDgiac(qta);
								qta = asArdep0f.getDamma();
								qta = qta.add(vquan);
								asArdep0f.setDamma(qta);
								break;
							case "G":
								qta = qta.subtract(vquan);
								asArdep0f.setDgiac(qta);
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						if(!(asArdep0fDao.aggiorna(asArdep0f))){
							chiudi();
						}
					}
					asArdep0fDao.detach(asArdep0f);
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiRighe.getTipoOperazione(), 2));
				msvOA_MovimentiRighe.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiRigheDao.aggiorna(msvOA_MovimentiRighe);
				msvOA_MovimentiRigheDao.detach(msvOA_MovimentiRighe);
			}
			
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
			msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
			msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
			msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
		}
		
		asMovma0fDao.close();
		asPrzac0fDao.close();
		
		log.info("]" + "oasi2asMovimentiMagazzino2");
	}
	
	private void oasi2asMovimentiMagazzinoDep008(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asMovimentiMagazzinoDep008");
		
		AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
		AsBofor0fDao asBofor0fDao = new AsBofor0fDaoMng();
		MsvOA_CarichiTestateDao msvOA_CarichiTestateDao = new MsvOA_CarichiTestateDaoMng();
		List<MsvOA_CarichiTestate> msvOA_CarichiTestateLs;
		MsvOA_CarichiRigheDao msvOA_CarichiRigheDao = new MsvOA_CarichiRigheDaoMng();
		List<MsvOA_CarichiRighe> msvOA_CarichiRigheLs;
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(39); // 39 - dataSync oasi2as movimentiMagazzinoDep008
		
		MsvOA_CarichiTestate msvOA_CarichiTestate = new MsvOA_CarichiTestate();
		
		msvOA_CarichiTestateLs = msvOA_CarichiTestateDao.getAll();
		
		// aggiungo i carichi testate che sono gi� state elaborate, ma hanno carichi righe in stato UPD
		msvOA_CarichiTestateLs.addAll(msvOA_CarichiTestateDao.getTestateConRigheAggiornate());
		
		// solo alcuni carichi
		// msvOA_CarichiTestateLs.clear();
		// msvOA_CarichiTestateLs.addAll(msvOA_CarichiTestateDao.getDaIdUnivocoTes("C01816039"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_CarichiTestate> iter_msvOA_CarichiTestateLs = msvOA_CarichiTestateLs.iterator();
		iter_msvOA_CarichiTestateLs = msvOA_CarichiTestateLs.iterator();
		while(iter_msvOA_CarichiTestateLs.hasNext()){
			msvOA_CarichiTestate = iter_msvOA_CarichiTestateLs.next();
			
			Integer vdatr = 0;
			String vcaus = "";
			Integer vnura = 0;
			Integer vnumd = 0;
			Integer vprog = 0;
			Integer vdain = 0;
			Integer vorin = 0;
			String vcoda = "";
			String vdesc = "";
			Integer vcocf = null;
			Integer vricl = 0;
			Integer vndep = 0;
			BigDecimal vquan = new BigDecimal(0);
			BigDecimal vprez = new BigDecimal(0);
			BigDecimal vsco1 = new BigDecimal(0);
			BigDecimal vsco2 = new BigDecimal(0);
			BigDecimal vsco3 = new BigDecimal(0);
			BigDecimal vsco4 = new BigDecimal(0);
			String vciva = "";
			BigDecimal valiv = new BigDecimal(0);
			BigDecimal vimps = new BigDecimal(0);
			String vcocr = "";
			String voven = "";
			String vtcve = "";
			BigDecimal vcost = new BigDecimal(0);
			String vtpac = "";
			String vvkit = "";
			String vcusr = "";
			String vcven = "";
			String vidoa = "";
			String vtimo = "";
			String vvfit = "";
			
			BigDecimal segnoQty = new BigDecimal(1);
			
			String causaleOasi = msvOA_CarichiTestate.getCausaleOasi();
			Integer tipoDocumento = msvOA_CarichiTestate.getDocumAccomp();
			
			vcaus = transCausaliMag(causaleOasi, "oasi2as");
			if(StringUtils.isBlank(vcaus)){
				continue; // non e' tra le causali contemplate
			}
			
			vcaus = "";
			if(StringUtils.equals(causaleOasi, "CARF") || StringUtils.equals(causaleOasi, "CFOR")){
				if(Integer.compare(tipoDocumento, 0) == 0){
					vcaus = "B";
				}else if(Integer.compare(tipoDocumento, -1) == 0){
					vcaus = "B";
				}else{
					log.error("Codice: " + tipoDocumento + " non gestito");
					vcaus = "";
				}
				
				vtimo = "F";
			}
			
			if(StringUtils.isBlank(vcaus)){
				log.error("Codice: " + causaleOasi + " non gestito");
				continue;
			}
			
			log.info("Elaboro: " + msvOA_CarichiTestate.getIdUnivocoTes());
			
			String vdatrTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_CarichiTestate.getDataReg());
			vdatr = Integer.parseInt(vdatrTxt);
			vdain = vdatr;
			vorin = 1;
			
			if(vcocf == null){
				vcocf = Integer.parseInt(StringUtils.trim(msvOA_CarichiTestate.getCodCliFor()));
				if(Integer.compare(vcocf, 999999) == 0){
					vcocf = 0;
				}
				
				if(StringUtils.equals(vcaus, "I")){
					vricl = vcocf;
					vcocf = 0;
				}
			}
			
			if(!(StringUtils.equals(vcaus, "S"))){
				vndep = Integer.parseInt(transDeposito(msvOA_CarichiTestate.getCodMag(), "oasi2as"));
				vcaus = StringUtils.join(vcaus, StringUtils.leftPad(vndep.toString(), 2, "0"));
			}
			
			String caus = StringUtils.left(vcaus, 1);
			
			vnura = vndep;
			
			voven = "NG";
			
			vcocr = "R";
			
			if(StringUtils.equals(caus, "B")){
				String bfido = StringUtils.join(causaleOasi, "-", StringUtils.trim(msvOA_CarichiTestate.getnMovDdt()), "-", StringUtils.trim(msvOA_CarichiTestate.getCodMag()));
				List<AsBofor0f> asBofor0fTmp = asBofor0fDao.getDaBfdatBfcofBfido(vdatr, new BigDecimal(vcocf), bfido);
				if(asBofor0fTmp.size() > 1){
					log.error("Piu' di una bolla con lo stesso identificativo " + vdatr + " " + vcocf + " " + bfido);
					chiudi();
				}
				
				if(asBofor0fTmp.isEmpty()){
					AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("A", StringUtils.leftPad(vndep.toString(), 2, "0")));
					String tcomm = StringUtils.trim(asTabel0f.getTcomm());
					String tcommmtnum = StringUtils.left(tcomm, 5);
					String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
					String tcommmtnuz = StringUtils.right(tcomm, 2);
					
					BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
					mtnumBD = mtnumBD.add(new BigDecimal(1));
					
					tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
					tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_CarichiTestate.getDataReg());
					
					vnumd = mtnumBD.intValue();
					
					tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
					
					asTabel0f.setTcomm(tcomm);
					if(!(asTabel0fDao.aggiorna(asTabel0f))){
						chiudi();
					}
					asTabel0fDao.detach(asTabel0f);
				}else{
					vnumd = asBofor0fTmp.get(0).getId().getBfnum();
				}
			}
			
			vprog = 0;
			
			Boolean prezzoIvato = false;
			if(Integer.compare(msvOA_CarichiTestate.getTipoPrezzo(), 1) == 0){
				prezzoIvato = true;
			}
			
			Boolean primoRigo = true;
			BigDecimal importoDocumento = new BigDecimal(0);
			String utente = "";
			
			MsvOA_CarichiRighe msvOA_CarichiRighe = new MsvOA_CarichiRighe();
			
			msvOA_CarichiRigheLs = msvOA_CarichiRigheDao.getDaIdUnivocoTesNonElaborate(msvOA_CarichiTestate.getIdUnivocoTes());
			
			Iterator<MsvOA_CarichiRighe> iter_msvOA_CarichiRigheLs = msvOA_CarichiRigheLs.iterator();
			iter_msvOA_CarichiRigheLs = msvOA_CarichiRigheLs.iterator();
			while(iter_msvOA_CarichiRigheLs.hasNext()){
				msvOA_CarichiRighe = iter_msvOA_CarichiRigheLs.next();
				
				if(primoRigo){
					primoRigo = false;
					utente = StringUtils.left(msvOA_CarichiRighe.getCodOperatore(), 5);
					importoDocumento = new BigDecimal(0);
				}
				
				vprog = Integer.parseInt(StringUtils.removeStart(msvOA_CarichiRighe.getId().getIdUnivocoRiga(), msvOA_CarichiRighe.getId().getIdUnivocoTes()));
				
				vcoda = StringUtils.upperCase(StringUtils.trim(msvOA_CarichiRighe.getCodArticoloCascino()));
				if(StringUtils.isBlank(vcoda)){
					vcoda = StringUtils.join("OA", StringUtils.trim(msvOA_CarichiRighe.getCodArticoloOasi()));
				}
				
				vquan = msvOA_CarichiRighe.getQta().multiply(segnoQty);
				
				vprez = msvOA_CarichiRighe.getPrezzoNetto();
				vsco1 = new BigDecimal(0);
				vsco2 = new BigDecimal(0);
				vsco3 = new BigDecimal(0);
				vsco4 = new BigDecimal(0);
				vcost = msvOA_CarichiRighe.getCosto();
				
				importoDocumento = importoDocumento.add(vprez.multiply(vquan));
				
				vciva = StringUtils.trim(msvOA_CarichiRighe.getCodIvaRiga());
				if(StringUtils.endsWith(vciva, ".") && !(StringUtils.equals(vciva, "BU."))){
					vciva = StringUtils.removeEnd(vciva, ".");
				}else{
					vciva = transCodiciIva(vciva, "oasi2as");
					if(StringUtils.isBlank(vciva)){
						log.error("Codice: " + msvOA_CarichiRighe.getCodIvaRiga() + " non gestito");
						vciva = "22";
					}
				}
				
				valiv = new BigDecimal(asTabge00fDao.getAliquotaIva(vciva));
				valiv = valiv.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
				if(prezzoIvato && (!(StringUtils.equals(msvOA_CarichiRighe.getCodArticoloCascino(), "/ACCO")))){
					try{
						vprez = vprez.divide((new BigDecimal(1)).add(valiv.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)), 4, RoundingMode.HALF_UP);
					}catch(ArithmeticException e){
						log.error("calcolo vprez " + "vprez: " + vprez + ", vciva: " + vciva);
					}
				}
				vprez = Support.arrotonda(vprez, 4);
				
				// e' importante che sia stato gia' fatto lo scorporo al 22% e poi applicato cod iva 88
				if(StringUtils.equals(msvOA_CarichiTestate.getCodIvaTes(), "88") || StringUtils.equals(msvOA_CarichiTestate.getCodIvaTes(), "88.")){
					log.info("forzato con iva 88");
					vciva = "88";
				}
				
				vimps = new BigDecimal(0);
				
				vtcve = "";
				vtpac = "F";
				
				// il costo e' gia' senza iva
				if(vcost.compareTo(new BigDecimal(-999999)) == 0){
					log.warn("costo non definito, messo al prezzo");
					vcost = vprez; // margine 0
				}
				
				vvkit = "";
				vvfit = "";
				AsAnmag0f asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(vcoda);
				if(asAnmag0f != null){
					vdesc = asAnmag0f.getMdesc();
					if(StringUtils.equals(asAnmag0f.getMckit(), "KT")){
						vvkit = "K";
					}
					if(StringUtils.equals(asAnmag0f.getMclin(), "0") || StringUtils.equals(asAnmag0f.getMclin(), "1") || StringUtils.equals(asAnmag0f.getMclin(), "2") || StringUtils.equals(asAnmag0f.getMclin(), "3") || StringUtils.equals(asAnmag0f.getMclin(), "Y")){
						vvfit = "S";
					}
				}else{
					log.warn(vcoda + " non presente in anmag");
					vdesc = "NON ANCORA CODIFICATO";
				}
				
				vcusr = "JAVAP";
				
				vcven = StringUtils.left(msvOA_CarichiRighe.getCodOperatore(), 5);
				
				vidoa = StringUtils.left(msvOA_CarichiRighe.getId().getIdUnivocoTes(), 10);
				
				AsMovma0fPKey id = new AsMovma0fPKey();
				id.setVdatr(vdatr);
				id.setVcaus(vcaus);
				id.setVnura(vnura);
				id.setVnumd(vnumd);
				id.setVprog(vprog);
				AsMovma0f asMovma0f = new AsMovma0f();
				asMovma0f.setId(id);
				asMovma0f.setVdain(vdain);
				asMovma0f.setVorin(vorin);
				asMovma0f.setVcoda(vcoda);
				asMovma0f.setVdesc(vdesc);
				asMovma0f.setVcocf(vcocf);
				asMovma0f.setVricl(vricl);
				asMovma0f.setVndep(vndep);
				asMovma0f.setVquan(vquan);
				asMovma0f.setVprez(vprez);
				asMovma0f.setVsco1(vsco1);
				asMovma0f.setVsco2(vsco2);
				asMovma0f.setVsco3(vsco3);
				asMovma0f.setVsco4(vsco4);
				asMovma0f.setVciva(vciva);
				asMovma0f.setValiv(valiv);
				asMovma0f.setVimps(vimps);
				asMovma0f.setVcocr(vcocr);
				asMovma0f.setVoven(voven);
				asMovma0f.setVtcve(vtcve);
				asMovma0f.setVcost(vcost);
				asMovma0f.setVtpac(vtpac);
				asMovma0f.setVvkit(vvkit);
				asMovma0f.setVcusr(vcusr);
				asMovma0f.setVcven(vcven);
				asMovma0f.setVidoa(vidoa);
				asMovma0f.setVtimo(vtimo);
				asMovma0f.setVvfit(vvfit);
				
				Boolean ardepDaAggiornare = true;
				
				AsMovma0f asMovma0fTmp = asMovma0fDao.getDaId(vdatr, vcaus, vnura, vnumd, vprog);
				if(asMovma0fTmp == null){ // nuova quindi insert
					if(!(asMovma0fDao.salva(asMovma0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					BigDecimal vquanVecchia = asMovma0fTmp.getVquan();
					
					if(!(asMovma0fDao.aggiorna(asMovma0f))){
						chiudi();
					}
					
					if(vquanVecchia.compareTo(vquan) != 0){
						log.warn("Modifica quantita', originale: " + vquanVecchia + ", nuova: " + vquan);
						vquan = vquan.subtract(vquanVecchia);
					}else{
						ardepDaAggiornare = false;
					}
					asMovma0fDao.detach(asMovma0fTmp);
				}
				asMovma0fDao.detach(asMovma0f);
				
				// gestione ardep0f
				if(ardepDaAggiornare){
					String datTxt = new SimpleDateFormat("ddMMyy").format(msvOA_CarichiTestate.getDataReg());
					AsArdep0f asArdep0f = asArdep0fDao.getDaDcodaAndDcode(vcoda, vndep);
					if(asArdep0f == null){ // nuova quindi insert
						String dcoda = vcoda;
						Integer dcode = vndep;
						AsArdep0fPKey idard = new AsArdep0fPKey();
						idard.setDcoda(dcoda);
						idard.setDcode(dcode);
						asArdep0f = new AsArdep0f();
						asArdep0f.setId(idard);
						asArdep0f.setDgdif(new BigDecimal(0));
						BigDecimal qta = new BigDecimal(0);
						switch(caus){
							case "B":
								qta = qta.add(vquan);
								asArdep0f.setDatuc(datTxt);
								asArdep0f.setDatus("0");
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						asArdep0f.setDgiac(qta);
						asArdep0f.setDatin("0");
						asArdep0f.setDscmi(new BigDecimal(0));
						asArdep0f.setDscma(new BigDecimal(0));
						asArdep0f.setDauco(new BigDecimal(0));
						asArdep0f.setDamma(new BigDecimal(0));
						if(!(asArdep0fDao.salva(asArdep0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						BigDecimal qta = asArdep0f.getDgiac();
						switch(caus){
							case "B":
								qta = qta.add(vquan);
								asArdep0f.setDatuc(datTxt);
								asArdep0f.setDatus(asArdep0f.getDatus());
								break;
							default:
								log.error(caus + " non gestita");
								break;
						}
						asArdep0f.setDgiac(qta);
						if(!(asArdep0fDao.aggiorna(asArdep0f))){
							chiudi();
						}
					}
					asArdep0fDao.detach(asArdep0f);
				}
				
				// elimina dalla tabella scritta da oasi
				// msvOA_CarichiRigheDao.elimina(msvOA_CarichiRighe);
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_CarichiRighe.getTipoOperazione(), 2));
				msvOA_CarichiRighe.setTipoOperazione(tipoOperazione);
				msvOA_CarichiRigheDao.aggiorna(msvOA_CarichiRighe);
				msvOA_CarichiRigheDao.detach(msvOA_CarichiRighe);
			}
			
			if(StringUtils.equals(caus, "B")){
				Integer bfdat = vdatr;
				Integer bfnuz = vnura;
				Integer bfnum = vnumd;
				BigDecimal bfcof = new BigDecimal(vcocf);
				BigDecimal bfftr = new BigDecimal(0);
				
				Integer bfpag = 1;
				String bfpagTxt = StringUtils.trim(msvOA_CarichiTestate.getCodPagamento());
				if(StringUtils.containsOnly(bfpagTxt, "0123456789")){
					bfpag = Integer.parseInt(bfpagTxt);
				}else{ // e' un codice oasi, devo fare transcodifica
					bfpagTxt = transPagamenti(bfpagTxt, "oasi2as");
					if(StringUtils.isBlank(bfpagTxt)){
						log.error("Codice: " + msvOA_CarichiTestate.getCodPagamento() + " non gestito");
						bfpagTxt = "1"; // contanti
					}
					bfpag = Integer.parseInt(bfpagTxt);
				}
				
				String bfcau = vcaus;
				Integer bfdep = vndep;
				
				String bfdbfTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_CarichiTestate.getDataDoc());
				Integer bfdbf = Integer.parseInt(bfdbfTxt);
				
				String bfnbf = StringUtils.left(StringUtils.trim(msvOA_CarichiTestate.getNroDoc()), 50);
				
				String bfnom = "OASI";
				String bfute = utente;
				String bfnot = StringUtils.left(StringUtils.trim(msvOA_CarichiTestate.getNroDoc()), 50);
				String bfido = StringUtils.join(causaleOasi, "-", StringUtils.trim(msvOA_CarichiTestate.getnMovDdt()), "-", StringUtils.trim(msvOA_CarichiTestate.getCodMag()));
				
				AsBofor0fPKey id = new AsBofor0fPKey();
				id.setBfdat(bfdat);
				id.setBfnuz(bfnuz);
				id.setBfnum(bfnum);
				AsBofor0f asBofor0f = new AsBofor0f();
				asBofor0f.setId(id);
				asBofor0f.setBfcof(bfcof);
				asBofor0f.setBfftr(bfftr);
				asBofor0f.setBfpag(bfpag);
				asBofor0f.setBfcau(bfcau);
				asBofor0f.setBfdep(bfdep);
				asBofor0f.setBfdbf(bfdbf);
				asBofor0f.setBfnbf(bfnbf);
				asBofor0f.setBfnom(bfnom);
				asBofor0f.setBfute(bfute);
				asBofor0f.setBfnot(bfnot);
				asBofor0f.setBfido(bfido);
				
				AsBofor0f asBofor0fTmp = asBofor0fDao.getDaId(bfdat, bfnuz, bfnum);
				if(asBofor0fTmp == null){ // nuova quindi insert
					if(!(asBofor0fDao.salva(asBofor0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
						// non modifico i valori che non ricevo definiti
					if(!(asBofor0fDao.aggiorna(asBofor0f))){
						chiudi();
					}
					asBofor0fDao.detach(asBofor0fTmp);
				}
				asBofor0fDao.detach(asBofor0f);
				
				// asMovma0fDao.aggiornaVcomm(vdatr, vcaus, vnura, vnumd, "0000000FF0F0F0F0F0F04040");
			}
			
			vimps = Support.arrotonda(importoDocumento, 2);
			asMovma0fDao.aggiornaVimps(vdatr, vcaus, vnura, vnumd, vimps);
			
			// elimina dalla tabella scritta da oasi
			// msvOA_CarichiTestateDao.elimina(msvOA_CarichiTestate);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_CarichiTestate.getTipoOperazione(), 2));
			msvOA_CarichiTestate.setTipoOperazione(tipoOperazione);
			msvOA_CarichiTestateDao.aggiorna(msvOA_CarichiTestate);
			msvOA_CarichiTestateDao.detach(msvOA_CarichiTestate);
		}
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asMovma0fDao.close();
		asBofor0fDao.close();
		msvOA_CarichiTestateDao.close();
		msvOA_CarichiRigheDao.close();
		
		log.info("]" + "oasi2asMovimentiMagazzinoDep008");
	}
	
	private void as2oasiTrasferimenti(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "as2oasiTrasferimenti");
		
		AsMovtr0fDao asMovtr0fDao = new AsMovtr0fDaoMng();
		List<AsMovtr0f> asMovtr0fLs;
		MsvAS_TrasferimentiDao msvAS_TrasferimentiDao = new MsvAS_TrasferimentiDaoMng();
		
		stringBuilder = new StringBuilder();
		
		// per i trasferimenti non ha senso parlare di completo o aggiornati
		// // se e' completa, prima svuoto la tabella mssql
		// if(!(soloAggiornati)){
		// msvAs_TrasferimentiDao.svuotaTabella();
		// log.info("svuotata tabella");
		// }
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(24); // 24 - dataSync as2oasi trasferimenti
		String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		Integer oraSync = Integer.parseInt(StringUtils.left(StringUtils.right(ultimoSync, 6), 4));
		
		asMovtr0fLs = asNativeQueryDao.getMovtrDaIngrossoAexpert(depositiIngrosso, depositiExpert, dataSync, oraSync);
		
		log.info("Trasferimenti successivi al: " + dataSync + " " + oraSync);
		
		// per evitare che tra l'inizio e la fine elaborazione (es. 3-4 minuti) venga salvato un trasferimento da as400, il timestamp lo rilevo subito
		// capitava che ad esempio iniziava alle 16:00 l'elaborazione, nella select quindi prendevo tutti i trasferimenti prima delle 16, nel frattempo finivo l'elaborazione
		// alle 16:05 e prendevo il timestamp. Quindi la prossima volta avrei cercato tutti itrasferimenti successivi alle 16:05. In questo modo perdevo tutti i trasferimenti
		// salvati in As400 tra le 16:01 e le 16:05
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		
		if(asMovtr0fLs.size() > 0){
			String strTimestampAs400Mov = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
			// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
			strTimestampAs400Mov = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400Mov, "."), " "), "-"), ":");
			
			AsMovtr0f asMovtr0f = new AsMovtr0f();
			Iterator<AsMovtr0f> iter_asMovtr0fLs = asMovtr0fLs.iterator();
			iter_asMovtr0fLs = asMovtr0fLs.iterator();
			while(iter_asMovtr0fLs.hasNext()){
				asMovtr0f = iter_asMovtr0fLs.next();
				
				Timestamp data = null;
				String idTes = "";
				String idRig = "";
				String codArticolo = "";
				BigDecimal qta = new BigDecimal(0);
				String codMagPartenza = "";
				String codMagDestinazione = "";
				String nota = "";
				
				String timestampMovimentoData = StringUtils.trim(String.valueOf(asMovtr0f.getId().getMtdat()));
				timestampMovimentoData = StringUtils.join(StringUtils.left(timestampMovimentoData, 4), "-", StringUtils.substring(timestampMovimentoData, 4, 6), "-", StringUtils.right(timestampMovimentoData, 2));
				String timestampMovimentoOra = StringUtils.leftPad(StringUtils.trim(String.valueOf(asMovtr0f.getMtime())), 4, "0");
				timestampMovimentoOra = StringUtils.join(StringUtils.left(timestampMovimentoOra, 2), ":", StringUtils.right(timestampMovimentoOra, 2), ":", "00");
				String timestampMovimento = StringUtils.join(timestampMovimentoData, " ", timestampMovimentoOra);
				data = Timestamp.valueOf(timestampMovimento);
				
				idTes = StringUtils.join(Integer.toString(asMovtr0f.getId().getMtdat()), "-", Integer.toString(asMovtr0f.getId().getMtnuz()), "-", Integer.toString(asMovtr0f.getId().getMtnum()));
				idRig = Integer.toString(asMovtr0f.getId().getMtnur());
				codArticolo = StringUtils.trim(asMovtr0f.getMtcod());
				qta = asMovtr0f.getMtqua();
				
				codMagPartenza = transDeposito(asMovtr0f.getMtdpp().toString(), "as2oasi");
				codMagDestinazione = transDeposito(asMovtr0f.getMtdpa().toString(), "as2oasi");
				
				nota = StringUtils.join(asMovtr0f.getMtute(), "-", asMovtr0f.getMtutr());
				
				MsvAS_TrasferimentiPKey id = new MsvAS_TrasferimentiPKey();
				id.setIdTes(idTes);
				id.setIdRig(idRig);
				MsvAS_Trasferimenti msvAS_Trasferimenti = new MsvAS_Trasferimenti();
				msvAS_Trasferimenti.setData(data);
				msvAS_Trasferimenti.setId(id);
				msvAS_Trasferimenti.setCodArticolo(codArticolo);
				msvAS_Trasferimenti.setQta(qta);
				msvAS_Trasferimenti.setCodMagPartenza(codMagPartenza);
				msvAS_Trasferimenti.setCodMagDestinazione(codMagDestinazione);
				msvAS_Trasferimenti.setNota(nota);
				
				msvAS_TrasferimentiDao.salva(msvAS_Trasferimenti);
				msvAS_TrasferimentiDao.detach(msvAS_Trasferimenti);
				
				// una volta scritto in SqlSrv, scrivo in movtr, con stato OK e utente OASI
				asMovtr0f.setMtsta("OK");
				asMovtr0f.setMtutr("OASI");
				asMovtr0f.setMtdar(Integer.parseInt(StringUtils.left(strTimestampAs400Mov, 8)));
				asMovtr0f.setMtimr(Integer.parseInt(StringUtils.left(StringUtils.right(strTimestampAs400Mov, 6), 4)));
				if(!(asMovtr0fDao.aggiorna(asMovtr0f))){
					chiudi();
				}
				asMovtr0fDao.detach(asMovtr0f);
			}
		}
		
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asMovtr0fDao.close();
		msvAS_TrasferimentiDao.close();
		
		log.info("]" + "as2oasiTrasferimenti");
	}
	
	private void oasi2asTrasferimenti(Boolean soloAggiornati, AsOasic0f cmd){
		log.info("[" + "oasi2asTrasferimenti");
		
		AsMovtr0fDao asMovtr0fDao = new AsMovtr0fDaoMng();
		MsvOA_TrasferimentiDao msvOA_TrasferimentiDao = new MsvOA_TrasferimentiDaoMng();
		List<MsvOA_Trasferimenti> msvOA_TrasferimentiLs;
		
		stringBuilder = new StringBuilder();
		
		AsOasic0f asOasic0f = asOasic0fDao.getDaOaidtr(34); // 34 - dataSync oasi2as trasferimenti
		// String ultimoSync = StringUtils.trim(asOasic0f.getOaris1());
		// Integer dataSync = Integer.parseInt(StringUtils.left(ultimoSync, 8));
		// Integer oraSync = Integer.parseInt(StringUtils.right(ultimoSync, 6));
		
		MsvOA_Trasferimenti msvOA_Trasferimenti = new MsvOA_Trasferimenti();
		
		msvOA_TrasferimentiLs = msvOA_TrasferimentiDao.getAll();
		
		String idTrasfPrecedente = "";
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Integer mtnuz = 0;
		Integer mtnum = 0;
		
		Iterator<MsvOA_Trasferimenti> iter_msvOA_TrasferimentiLs = msvOA_TrasferimentiLs.iterator();
		iter_msvOA_TrasferimentiLs = msvOA_TrasferimentiLs.iterator();
		while(iter_msvOA_TrasferimentiLs.hasNext()){
			msvOA_Trasferimenti = iter_msvOA_TrasferimentiLs.next();
			
			String idTrasf = StringUtils.join(msvOA_Trasferimenti.getData().toString(), msvOA_Trasferimenti.getId().getIdTes());
			
			Integer mtdat = 0;
			// Integer mtnuz = 0;
			// Integer mtnum = 0;
			Integer mtnur = 0;
			String mtcod = "";
			BigDecimal mtqua = new BigDecimal(0);
			BigDecimal mtqri = new BigDecimal(0);
			Integer mtdpp = 0;
			Integer mtdpa = 0;
			Integer mtime = 0;
			String mtute = "";
			String mtutr = "";
			String mtsta = "";
			Integer mtdar = 0;
			Integer mtimr = 0;
			String mtumi = "";
			
			String mtdatTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_Trasferimenti.getData());
			mtdat = Integer.parseInt(mtdatTxt);
			
			mtdpp = Integer.parseInt(transDeposito(msvOA_Trasferimenti.getCodMagPartenza(), "oasi2as"));
			mtdpa = Integer.parseInt(transDeposito(msvOA_Trasferimenti.getCodMagDestinazione(), "oasi2as"));
			
			if(!(StringUtils.equals(idTrasf, idTrasfPrecedente))){
				idTrasfPrecedente = idTrasf;
				
				AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("T", StringUtils.leftPad(mtdpp.toString(), 2, "0")));
				String tcomm = StringUtils.trim(asTabel0f.getTcomm());
				String tcommmtnum = StringUtils.left(tcomm, 5);
				String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
				String tcommmtnuz = StringUtils.right(tcomm, 2);
				
				BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
				mtnumBD = mtnumBD.add(new BigDecimal(1));
				
				tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
				tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_Trasferimenti.getData());
				
				mtnuz = Integer.parseInt(tcommmtnuz);
				mtnum = mtnumBD.intValue();
				
				tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz);
				
				asTabel0f.setTcomm(tcomm);
				if(!(asTabel0fDao.aggiorna(asTabel0f))){
					chiudi();
				}
				asTabel0fDao.detach(asTabel0f);
			}
			
			mtnur = Integer.parseInt(msvOA_Trasferimenti.getId().getIdRig());
			
			mtcod = StringUtils.upperCase(StringUtils.trim(msvOA_Trasferimenti.getCodCascino()));
			if(StringUtils.isBlank(mtcod)){
				mtcod = StringUtils.join("OA", StringUtils.trim(msvOA_Trasferimenti.getCodBreveOasi()));
			}
			
			mtqua = msvOA_Trasferimenti.getQta();
			mtqri = new BigDecimal(0);
			
			mtime = 1;
			
			// mtute = msvOA_Trasferimenti.getId().getIdTes();
			mtute = StringUtils.split(msvOA_Trasferimenti.getNota(), "/")[1];
			
			mtutr = "";
			mtsta = "";
			mtdar = 0;
			mtimr = 0;
			
			mtumi = "";
			AsAnmag0f asAnmag0f = asAnmag0fDao.getArticoloDaMcoda(mtcod);
			if(asAnmag0f != null){
				mtumi = asAnmag0f.getMumis();
			}else{
				mtumi = "PZ";
				log.error(mtcod + " non e' in anmag0f, non e' possibile");
			}
			
			AsMovtr0fPKey id = new AsMovtr0fPKey();
			id.setMtdat(mtdat);
			id.setMtnuz(mtnuz);
			id.setMtnum(mtnum);
			id.setMtnur(mtnur);
			AsMovtr0f asMovtr0f = new AsMovtr0f();
			asMovtr0f.setId(id);
			asMovtr0f.setMtcod(mtcod);
			asMovtr0f.setMtqua(mtqua);
			asMovtr0f.setMtqri(mtqri);
			asMovtr0f.setMtdpp(mtdpp);
			asMovtr0f.setMtdpa(mtdpa);
			asMovtr0f.setMtime(mtime);
			asMovtr0f.setMtute(mtute);
			asMovtr0f.setMtutr(mtutr);
			asMovtr0f.setMtsta(mtsta);
			asMovtr0f.setMtdar(mtdar);
			asMovtr0f.setMtimr(mtimr);
			asMovtr0f.setMtumi(mtumi);
			
			AsMovtr0f asMovtr0fTmp = asMovtr0fDao.getDaId(mtdat, mtnuz, mtnum, mtnur);
			if(asMovtr0fTmp == null){ // nuova quindi insert
				// log.info("salva: " + asMovtr0f.toString());
				if(!(asMovtr0fDao.salva(asMovtr0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
					// non modifico i valori che non ricevo definiti
					// asMovtr0f.setClcpor(asMovtr0fTmp.getClcpor());
				if(!(asMovtr0fDao.aggiorna(asMovtr0f))){
					chiudi();
				}
				log.error("non deve essere possibile, sempre trasferimenti nuovi");
				asMovtr0fDao.detach(asMovtr0fTmp);
			}
			asMovtr0fDao.detach(asMovtr0f);
			
			// elimina dalla tabella scritta da oasi
			msvOA_TrasferimentiDao.elimina(msvOA_Trasferimenti);
			msvOA_TrasferimentiDao.detach(msvOA_Trasferimenti);
		}
		
		strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		asOasic0f.setOaris1(strTimestampAs400);
		if(!(asOasic0fDao.aggiorna(asOasic0f))){
			chiudi();
		}
		asOasic0fDao.detach(asOasic0f);
		
		stringBuilder.append("OK");
		scriviRispostaInDb(cmd);
		
		asMovtr0fDao.close();
		msvOA_TrasferimentiDao.close();
		
		log.info("]" + "oasi2asTrasferimenti");
	}
	
	private void getArticoliPerOasi(){
		log.info("[" + "getArticoliPerOasi");
		
		// setta la lista di articoli cascino che sono in oasi
		// ovvero
		// tutti gli articoli attivi (atama = ' ')
		// piu' gli annullati ma movimentati da dataPartenza
		// ma non passo comunque gli articoli che non sono mai stati movimentati nei depositi expert (quindi tolgo piastrelle, sanitari e roba di showroom)
		
		if(primoAvvio){
			asAnmag0fLs = new ArrayList<>();
			
			asAnmag0fLs = asAnmag0fDao.getArticoliDaAS400aOasi();
			
			// asAnmag0fLs = asAnmag0fDao.getArticoliAttivi();
			// asAnmag0fLs = asAnmag0fDao.getArticoliIngrosso();
			
			// aggiungo gli annullati ma che comunque sono stati movimentati (per lo storico movimenti)
			// a regime non ci sar� pi� bisogno
			// asAnmag0fLs.addAll(asAnmag0fDao.getArticoliAnnulatiMaMovimentatiDal(dataPartenza));
			
			// asAnmag0fLs.removeAll(asAnmag0fDao.getArticoliDaNonPassare(dataPartenza, depositiExpert));
			
			// popolo pure un arraylist con i codici marchi (non duplicati)
			codiciMarchiLs = new ArrayList<>();
			AsAnmag0f asAnmag0f = new AsAnmag0f();
			Iterator<AsAnmag0f> iter_asAnmag0fLs = asAnmag0fLs.iterator();
			iter_asAnmag0fLs = asAnmag0fLs.iterator();
			while(iter_asAnmag0fLs.hasNext()){
				asAnmag0f = iter_asAnmag0fLs.next();
				
				String codiceMarchio = "";
				
				codiceMarchio = asAnmag0f.getMarch();
				
				if(!(codiciMarchiLs.contains(codiceMarchio))){
					codiciMarchiLs.add(codiceMarchio);
				}
			}
			codiciMarchiLs.remove("    ");
			
			primoAvvio = false;
		}
		
		log.info("Numero Articoli: " + asAnmag0fLs.size());
		
		log.info("]" + "getArticoliPerOasi");
	}
	
	private AsTabe20f getCodiceMarchio(String codice){
		// log.info("[" + "getCodiceMarchio");
		
		AsTabe20fDao asTabe20fDao = new AsTabe20fDaoMng();
		
		codice = StringUtils.trim(codice);
		
		if(StringUtils.isBlank(codice)){
			return null;
		}
		
		AsTabe20f asTabe20fSup = asTabe20fDao.getDaTbnotTbele("MARC", codice);
		
		AsTabe20fPKey id = asTabe20fSup.getId();
		AsTabe20f asTabe20f = new AsTabe20f();
		asTabe20f.setId(id);
		asTabe20f.setTbdes(asTabe20fSup.getTbdes());
		asTabe20f.setTbcom(asTabe20fSup.getTbcom());
		
		if(asTabe20f.getId().getTbele() == null){
			log.warn("Marchio: " + codice + ", non esistente in tabe20f");
			return null;
		}
		
		if(StringUtils.equals(StringUtils.substring(StringUtils.trim(asTabe20f.getTbdes()), 49), "C")){
			asTabe20f.getId().setTbele(StringUtils.join(codice, "."));
			asTabe20f.setTbdes(StringUtils.left(asTabe20f.getTbdes(), 49));
		}
		
		asTabe20fDao.close();
		
		// log.info("]" + "getCodiceMarchio");
		return asTabe20f;
	}
	
	private void elaboraFatture(){
		log.info("[" + "elaboraFatture");
		
		AsFatem0fDao asFatem0fDao = new AsFatem0fDaoMng();
		
		MsvOA_MovimentiTestate msvOA_MovimentiTestate = new MsvOA_MovimentiTestate();
		
		msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getFatture("'CORC', 'VEND', 'VEDD', 'ACFF', 'RSCL', 'RSCO', 'RSCM'");
		
		// solo una fattura
		// msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C03745900");
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_MovimentiTestate> iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		while(iter_msvOA_MovimentiTestateLs.hasNext()){
			msvOA_MovimentiTestate = iter_msvOA_MovimentiTestateLs.next();
			
			Integer fdatd = 0;
			Integer fnura = 0;
			Integer fnumd = 0;
			BigDecimal fcocl = new BigDecimal(0);
			BigDecimal fndep = new BigDecimal(0);
			String ftifa = "";
			Integer fcopa = 0;
			BigDecimal fimpf = new BigDecimal(0);
			BigDecimal fmer1 = new BigDecimal(0);
			BigDecimal fmer2 = new BigDecimal(0);
			BigDecimal fmer3 = new BigDecimal(0);
			BigDecimal fmer4 = new BigDecimal(0);
			BigDecimal fmer5 = new BigDecimal(0);
			String fcos1 = "";
			BigDecimal fisp1 = new BigDecimal(0);
			String fcos2 = "";
			BigDecimal fisp2 = new BigDecimal(0);
			String fcos3 = "";
			BigDecimal fisp3 = new BigDecimal(0);
			String fciv1 = "";
			BigDecimal fimp1 = new BigDecimal(0);
			BigDecimal fiva1 = new BigDecimal(0);
			String fciv2 = "";
			BigDecimal fimp2 = new BigDecimal(0);
			BigDecimal fiva2 = new BigDecimal(0);
			String fciv3 = "";
			BigDecimal fimp3 = new BigDecimal(0);
			BigDecimal fiva3 = new BigDecimal(0);
			String fciv4 = "";
			BigDecimal fimp4 = new BigDecimal(0);
			BigDecimal fiva4 = new BigDecimal(0);
			String fciv5 = "";
			BigDecimal fimp5 = new BigDecimal(0);
			BigDecimal fiva5 = new BigDecimal(0);
			String fces1 = "";
			BigDecimal fime1 = new BigDecimal(0);
			String fces2 = "";
			BigDecimal fime2 = new BigDecimal(0);
			BigDecimal fipos = new BigDecimal(0);
			BigDecimal fnupa = new BigDecimal(0);
			BigDecimal fanpa = new BigDecimal(0);
			String futen = "";
			String fnote = "";
			String fdeme = "";
			String fcauc = "";
			String fcapa = "";
			String ftpag = "";
			String fccam = "";
			BigDecimal facco = new BigDecimal(0);
			
			String causaleOasi = msvOA_MovimentiTestate.getCausaleOasi();
			
			Boolean acconto = false;
			if(StringUtils.equals(causaleOasi, "ACFF")){
				acconto = true;
			}
			
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = null;
			try{
				if(acconto){
					// se e' acconto, non c'e' stato il caricamento delle righe e quindi non sono elaborate e non iniziano con *
					msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTes(msvOA_MovimentiTestate.getIdUnivocoTes());
					msvOA_MovimentiRighe = msvOA_MovimentiRigheLs.get(0);
				}else{
					msvOA_MovimentiRighe = msvOA_MovimentiRigheDao.getDaIdUnivocoTesElaborate(msvOA_MovimentiTestate.getIdUnivocoTes()).get(0);
				}
			}catch(IndexOutOfBoundsException e){
				log.info("Elaboro: " + msvOA_MovimentiTestate.getIdUnivocoTes());
				chiudi();
			}
			
			Boolean notaCredito = false;
			Boolean abbuono = false;
			if(StringUtils.equals(causaleOasi, "RSCL") || StringUtils.equals(causaleOasi, "RSCO") || StringUtils.equals(causaleOasi, "RSCM")){
				notaCredito = true;
				
				// controllo se e' abbuono
				if(StringUtils.equals(msvOA_MovimentiRighe.getCodArticoloOasi(), "G0XLX")){ // articolo abbuono
					abbuono = true;
				}
			}
			
			Boolean notaDebito = false;
			// controllo se e' onere finanziario
			if(StringUtils.equals(msvOA_MovimentiRighe.getCodArticoloCascino(), "ONERIFIN")){
				notaDebito = true;
			}
			
			MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = msvOA_PrimaNota_TesDao.getDaNReg(msvOA_MovimentiTestate.getIdPntNReg());
			
			if((msvOA_PrimaNota_Tes == null) || (StringUtils.startsWith(msvOA_PrimaNota_Tes.getTipoOperazione(), "*"))){
				continue;
			}
			
			String fdatdTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_MovimentiTestate.getDataReg());
			fdatd = Integer.parseInt(fdatdTxt);
			
			fnura = Integer.parseInt(transDeposito(msvOA_MovimentiTestate.getCodMag(), "oasi2as"));
			if(StringUtils.equals(causaleOasi, "VEND") || StringUtils.equals(causaleOasi, "RSCM")){
				fnura = 91;
			}
			fnumd = Integer.parseInt(msvOA_PrimaNota_Tes.getDocumento());
			fcocl = new BigDecimal(msvOA_MovimentiTestate.getCodCliFor());
			fndep = new BigDecimal(transDeposito(msvOA_MovimentiTestate.getCodMag(), "oasi2as"));
			
			fccam = StringUtils.join("D", StringUtils.leftPad(transDeposito(msvOA_MovimentiTestate.getCodMag(), "oasi2as"), 2, "0"));
			ftifa = "I";
			if(notaCredito){
				ftifa = "R";
				fccam = StringUtils.join("M", StringUtils.leftPad(transDeposito(msvOA_MovimentiTestate.getCodMag(), "oasi2as"), 2, "0"));
			}
			if(acconto){
				ftifa = "A";
				fccam = "";
			}
			if(abbuono){
				ftifa = "S";
				fccam = "";
			}
			if(notaDebito){
				ftifa = "P";
				fccam = "";
			}
			
			String fcopaTxt = StringUtils.trim(msvOA_PrimaNota_Tes.getfPagamento());
			if(StringUtils.containsOnly(fcopaTxt, "0123456789")){
				fcopa = Integer.parseInt(fcopaTxt);
			}else{ // e' un codice oasi, devo fare transcodifica
				fcopaTxt = transPagamenti(fcopaTxt, "oasi2as");
				if(StringUtils.isBlank(fcopaTxt)){
					log.error("Codice: " + msvOA_PrimaNota_Tes.getfPagamento() + " non gestito");
					fcopaTxt = "1"; // contanti
				}
				fcopa = Integer.parseInt(fcopaTxt);
				
				if(Integer.compare(fcopa, 1) == 0){
					fcopa = 899; // il pagamento viene inserito in ccmca0f
				}
			}
			
			fimpf = new BigDecimal(0);
			BigDecimal importoOmaggio = new BigDecimal(0);
			
			MsvOA_PrimaNota_Iva msvOA_PrimaNota_Iva = new MsvOA_PrimaNota_Iva();
			
			msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg());
			
			Iterator<MsvOA_PrimaNota_Iva> iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
			iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
			Integer numGiroAliquota = 1;
			while(iter_msvOA_PrimaNota_IvaLs.hasNext()){
				msvOA_PrimaNota_Iva = iter_msvOA_PrimaNota_IvaLs.next();
				
				fimpf = fimpf.add(msvOA_PrimaNota_Iva.getImponibile());
				fimpf = fimpf.add(msvOA_PrimaNota_Iva.getImposta());
				
				// BigDecimal importo = new BigDecimal(0);
				BigDecimal imponibile = new BigDecimal(0);
				BigDecimal iva = new BigDecimal(0);
				String codIva = "";
				
				imponibile = Support.arrotonda(msvOA_PrimaNota_Iva.getImponibile(), 2);
				iva = Support.arrotonda(msvOA_PrimaNota_Iva.getImposta(), 2);
				codIva = StringUtils.trim(msvOA_PrimaNota_Iva.getCodIva());
				if(StringUtils.endsWith(codIva, ".") && !(StringUtils.equals(codIva, "BU."))){
					codIva = StringUtils.removeEnd(codIva, ".");
				}else{
					codIva = transCodiciIva(codIva, "oasi2as");
					if(StringUtils.isBlank(codIva)){
						log.error("Codice: " + msvOA_PrimaNota_Iva.getCodIva() + " non gestito");
						codIva = "22";
					}
				}
				
				if(StringUtils.equals(codIva, "90") || StringUtils.equals(codIva, "91")){ // reverse charge - 90 cellulari - 91 informatica
					// se il cliente non ha partita iva e in clcnor ne 90 e nemmeno 91, allora faccio iva ordinaria
					AsClien00f asClien00f = asClien00fDao.getDaClccli(fcocl);
					if((asClien00f != null) && (Integer.compare(asClien00f.getClcpiv().intValue(), 0) > 0)){
						if(!(StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "90") || StringUtils.equals(StringUtils.trim(asClien00f.getClcnor()), "91"))){
							// codIva = "22"; se oasi l'ha aftto in reverse, non lo trasformo in 22%
							log.warn("In oasi il cliente e' con reverse, controllare perche' in sirio non lo e'!");
						}
					}else{
						codIva = "22";
					}
					// siamo nelle fatture, e' impossibile che siano queste altre causali
//					if(StringUtils.equals(caus, "G") || StringUtils.equals(caus, "I")){
//						codIva = "22";
//					}
				}
				
				if(StringUtils.equals(codIva, "62")){
					// MsvOA_MovimentiTestate msvOA_MovimentiTestate = msvOA_MovimentiTestateDao.getDaIdPntNReg(msvOA_PrimaNota_Tes.getnReg());
					if(msvOA_MovimentiTestate != null){
						msvOA_MovimentiRighe = null;
						msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTes(msvOA_MovimentiTestate.getIdUnivocoTes());
						Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
						iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
						while(iter_msvOA_MovimentiRigheLs.hasNext()){
							msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
							
							if((msvOA_MovimentiRighe.getPrezzoNetto().compareTo(new BigDecimal(0)) == 0) && (msvOA_MovimentiRighe.getValoreOmaggio().compareTo(new BigDecimal(0)) > 0)){
								importoOmaggio = importoOmaggio.add(Support.arrotonda(msvOA_MovimentiRighe.getQta().multiply(msvOA_MovimentiRighe.getValoreOmaggio()), 2));
							}
						}
						log.info("Omaggio: " + importoOmaggio);
						if(importoOmaggio.compareTo(new BigDecimal(0)) > 0){
							imponibile = new BigDecimal(0);
							iva = new BigDecimal(0);
							fimpf = fimpf.subtract(importoOmaggio);
						}
					}
				}
				
				if(notaCredito){
					imponibile = imponibile.multiply(new BigDecimal(-1));
					iva = iva.multiply(new BigDecimal(-1));
				}
				
				if(StringUtils.equals(codIva, "22")){
					fmer1 = fmer1.add(imponibile);
					fimp1 = fimp1.add(imponibile); // sarebbe fmer (importo merce) + fisp (importo spesa) a parit� di aliquota
					fiva1 = fiva1.add(iva);
					fciv1 = codIva;
				}else{
					numGiroAliquota++;
					switch(numGiroAliquota){
						case 2:
							fmer2 = imponibile;
							fimp2 = imponibile;
							fiva2 = iva;
							fciv2 = codIva;
							if(imponibile.compareTo(new BigDecimal(0)) == 0){
								fciv2 = "";
							}
							break;
						case 3:
							fmer3 = imponibile;
							fimp3 = imponibile;
							fiva3 = iva;
							fciv3 = codIva;
							if(imponibile.compareTo(new BigDecimal(0)) == 0){
								fciv3 = "";
							}
							break;
						case 4:
							fmer4 = imponibile;
							fimp4 = imponibile;
							fiva4 = iva;
							fciv4 = codIva;
							if(imponibile.compareTo(new BigDecimal(0)) == 0){
								fciv4 = "";
							}
							break;
						case 5:
							fmer5 = imponibile;
							fimp5 = imponibile;
							fiva5 = iva;
							fciv5 = codIva;
							if(imponibile.compareTo(new BigDecimal(0)) == 0){
								fciv5 = "";
							}
							break;
						default:
							log.error("fattura con piu' di 5 aliquote iva - gestire manulamente");
							break;
					}
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Iva.getTipoOperazione(), 2));
				msvOA_PrimaNota_Iva.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_IvaDao.aggiorna(msvOA_PrimaNota_Iva);
				msvOA_PrimaNota_IvaDao.detach(msvOA_PrimaNota_Iva);
			}
			
			fcos1 = "";
			fisp1 = msvOA_MovimentiTestate.getValTrasporto();
			if(fisp1.compareTo(new BigDecimal(0)) > 0){
				fcos1 = "TRA";
			}
			
			if(notaDebito){
				fcos1 = "IQ";
				fisp1 = fimp1;
				fdeme = "ONERI BANCARI SU CESSIONE CREDITO";
				ftpag = "PC";
			}
			
			fmer1 = fimp1.subtract(fisp1);
			
			fimpf = Support.arrotonda(fimpf, 2);
			if(notaCredito){
				fimpf = fimpf.multiply(new BigDecimal(-1));
			}
			
			fcos2 = "";
			fisp2 = new BigDecimal(0);
			fcos3 = "";
			fisp3 = new BigDecimal(0);
			
			fces1 = "";
			fime1 = new BigDecimal(0);
			fces2 = "";
			fime2 = new BigDecimal(0);
			
			fipos = new BigDecimal(0);
			fnupa = new BigDecimal(fnumd);
			fdatdTxt = new SimpleDateFormat("yyyy").format(msvOA_MovimentiTestate.getDataReg());
			fanpa = new BigDecimal(fdatdTxt);
			
			futen = "";
			futen = msvOA_MovimentiRighe.getCodOperatore();
			
			fcauc = "";
			AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", StringUtils.join("F", StringUtils.leftPad(fnura.toString(), 2, "0")));
			String tcomm = StringUtils.trim(asTabel0f.getTcomm());
			String tcommmtnum = StringUtils.left(tcomm, 5);
			String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
			String tcommmtnuz = StringUtils.substring(tcomm, 11, 13);
			String tcommresto = StringUtils.substring(tcomm, 13);
			String tcommcauc = "";
			switch(ftifa){ // se e' Immediata I = 1� campo; Reso R = 3� campo; acconto A = 2� campo; abbuono S = 4� campo;
				case "I":
					tcommcauc = StringUtils.substring(tcomm, 13, 15);
					break;
				case "R":
					tcommcauc = StringUtils.substring(tcomm, 19, 21);
					break;
				case "A":
					tcommcauc = StringUtils.substring(tcomm, 16, 18);
					break;
				case "S":
					tcommcauc = StringUtils.substring(tcomm, 22, 24);
					break;
				case "P":
					tcommcauc = "DY";
					break;
				default:
					tcommcauc = StringUtils.substring(tcomm, 13, 15);
					break;
			}
			
			BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
			mtnumBD = mtnumBD.add(new BigDecimal(1));
			
			tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
			tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_MovimentiTestate.getDataReg());
			
			if(Integer.compare(fnumd, mtnumBD.intValue()) != 0){
				log.warn("Il numero di fattura non coincide - Fnumd: " + fnumd + ", in tabel: " + mtnumBD.intValue());
			}
			
			tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz, tcommresto);
			
			asTabel0f.setTcomm(tcomm);
			if(!(asTabel0fDao.aggiorna(asTabel0f))){
				chiudi();
			}
			asTabel0fDao.detach(asTabel0f);
			
			fcauc = tcommcauc;
			
			fcapa = "";
			if(Integer.compare(fcopa, 1) == 0){
				fcapa = "IG";
			}
			
			// gestione cessione del credito
			if(Integer.compare(fcopa, 55) == 0){ // 50%
				facco = fimpf.multiply(new BigDecimal(0.5));
				facco = Support.arrotonda(facco, 2);
			}else if(Integer.compare(fcopa, 56) == 0){ // 65%
				facco = fimpf.multiply(new BigDecimal(0.65));
				facco = Support.arrotonda(facco, 2);
			}else if(Integer.compare(fcopa, 57) == 0){ // 40%
				facco = fimpf.multiply(new BigDecimal(0.4));
				facco = Support.arrotonda(facco, 2);
			}else if(Integer.compare(fcopa, 58) == 0){ // 52%
				facco = fimpf.multiply(new BigDecimal(0.52));
				facco = Support.arrotonda(facco, 2);
			}
			
			AsFatem0fPKey id = new AsFatem0fPKey();
			id.setFdatd(fdatd);
			id.setFnura(fnura);
			id.setFnumd(fnumd);
			AsFatem0f asFatem0f = new AsFatem0f();
			asFatem0f.setId(id);
			asFatem0f.setFcocl(fcocl);
			asFatem0f.setFndep(fndep);
			asFatem0f.setFtifa(ftifa);
			asFatem0f.setFcopa(fcopa);
			asFatem0f.setFimpf(fimpf);
			asFatem0f.setFmer1(fmer1);
			asFatem0f.setFmer2(fmer2);
			asFatem0f.setFmer3(fmer3);
			asFatem0f.setFmer4(fmer4);
			asFatem0f.setFmer5(fmer5);
			asFatem0f.setFcos1(fcos1);
			asFatem0f.setFisp1(fisp1);
			asFatem0f.setFcos2(fcos2);
			asFatem0f.setFisp2(fisp2);
			asFatem0f.setFcos3(fcos3);
			asFatem0f.setFisp3(fisp3);
			asFatem0f.setFciv1(fciv1);
			asFatem0f.setFimp1(fimp1);
			asFatem0f.setFiva1(fiva1);
			asFatem0f.setFciv2(fciv2);
			asFatem0f.setFimp2(fimp2);
			asFatem0f.setFiva2(fiva2);
			asFatem0f.setFciv3(fciv3);
			asFatem0f.setFimp3(fimp3);
			asFatem0f.setFiva3(fiva3);
			asFatem0f.setFciv4(fciv4);
			asFatem0f.setFimp4(fimp4);
			asFatem0f.setFiva4(fiva4);
			asFatem0f.setFciv5(fciv5);
			asFatem0f.setFimp5(fimp5);
			asFatem0f.setFiva5(fiva5);
			asFatem0f.setFces1(fces1);
			asFatem0f.setFime1(fime1);
			asFatem0f.setFces2(fces2);
			asFatem0f.setFime2(fime2);
			asFatem0f.setFipos(fipos);
			asFatem0f.setFnupa(fnupa);
			asFatem0f.setFanpa(fanpa);
			asFatem0f.setFuten(futen);
			asFatem0f.setFnote(fnote);
			asFatem0f.setFdeme(fdeme);
			asFatem0f.setFcauc(fcauc);
			asFatem0f.setFcapa(fcapa);
			asFatem0f.setFtpag(ftpag);
			asFatem0f.setFccam(fccam);
			asFatem0f.setFacco(facco);
			
			AsFatem0f asFatem0fTmp = asFatem0fDao.getDaId(fdatd, fnura, fnumd);
			if(asFatem0fTmp == null){ // nuova quindi insert
				if(!(asFatem0fDao.salva(asFatem0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
				if(!(asFatem0fDao.aggiorna(asFatem0f))){
					chiudi();
				}
				asFatem0fDao.detach(asFatem0fTmp);
			}
			asFatem0fDao.detach(asFatem0f);
			
			String fPagamento = StringUtils.trim(msvOA_PrimaNota_Tes.getfPagamento());
			Boolean finanziaria = false;
			if(StringUtils.equals(fPagamento, "FAGI") || StringUtils.equals(fPagamento, "FCOI") || StringUtils.equals(fPagamento, "FINI") || StringUtils.equals(fPagamento, "FPAI") || StringUtils.equals(fPagamento, "FFLO")){
				finanziaria = true;
			}else{
				if((StringUtils.equals(fPagamento, "055") || StringUtils.equals(fPagamento, "056")) && (!(StringUtils.isBlank(msvOA_MovimentiTestate.getNotaFN())) || !(StringUtils.isBlank(msvOA_MovimentiTestate.getNotaFZ())))){
					finanziaria = true;
				}
			}
			if(finanziaria){
				BigDecimal importoDocumento = fimpf;
				BigDecimal importoFinanziaria = fimpf;
				Integer dataFin = null;
				Integer numFin = null;
				Object paramRitorno[] = new Object[3];
				elaboraFinanziaria(msvOA_PrimaNota_Tes, msvOA_MovimentiTestate, fcocl.intValue(), true, importoDocumento, importoFinanziaria, fnupa.intValue(), fndep.intValue(), futen, paramRitorno);
				importoFinanziaria = (BigDecimal)paramRitorno[0];
				dataFin = (Integer)paramRitorno[1];
				numFin = (Integer)paramRitorno[2];
				fnote = StringUtils.join("FIN ", numFin, " ", dataFin);
				asFatem0f = asFatem0fDao.getDaId(fdatd, fnura, fnumd);
				asFatem0f.setFnote(fnote);
				if(!(asFatem0fDao.aggiorna(asFatem0f))){
					chiudi();
				}
				asFatem0fDao.detach(asFatem0f);
			}
			
			// elimina dalla tabella scritta da oasi
			// msvOA_MovimentiTestateDao.elimina(msvOA_MovimentiTestate);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
			if(acconto){
				// se e' acconto, dato che il pagamento lo gestisco con elaboraPagamenti con le FACx, non gli devo mettere l'asterisco di elaborato
				tipoOperazione = msvOA_PrimaNota_Tes.getTipoOperazione();
			}
			msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
			msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
			msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
		}
		
		asFatem0fDao.close();
		
		log.info("]" + "elaboraFatture");
	}
	
	private void elaboraCrediti(){
		log.info("[" + "elaboraCrediti");
		
		AsFatem0fDao asFatem0fDao = new AsFatem0fDaoMng();
		AsScocr0fDao asScocr0fDao = new AsScocr0fDaoMng();
		MsvOA_AnagCausContDao msvOA_AnagCausContDao = new MsvOA_AnagCausContDaoMng();
		
		MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = new MsvOA_PrimaNota_Tes();
		
		msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesDao.getDaRegIva("03");
		
		// solo alcuni movimenti
		// msvOA_PrimaNota_TesLs.clear();
		// msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00182975"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_PrimaNota_Tes> iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
		iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
		while(iter_msvOA_PrimaNota_TesLs.hasNext()){
			msvOA_PrimaNota_Tes = iter_msvOA_PrimaNota_TesLs.next();
			
			Integer scdat = 0;
			Integer scnuz = 0;
			Integer scnum = 0;
			String sccau = "";
			Integer scnzs = 0;
			Integer scnus = 0;
			Integer scdep = 0;
			Integer sccoc = 0;
			BigDecimal scims = new BigDecimal(0);
			String sctpc = "";
			Integer scdaf = 0;
			Integer scnuf = 0;
			String scute = "";
			String scnot = "";
			String sccag = "";
			Integer scpag = 0;
			
			String causale = msvOA_PrimaNota_Tes.getCausale();
			String fPagamento = StringUtils.trim(msvOA_PrimaNota_Tes.getfPagamento());
			
			if(StringUtils.isBlank(fPagamento)){
				continue;
			}
			
			Boolean finanziaria = false;
			if(StringUtils.equals(fPagamento, "FAGI") || StringUtils.equals(fPagamento, "FCOI") || StringUtils.equals(fPagamento, "FINI") || StringUtils.equals(fPagamento, "FPAI") || StringUtils.equals(fPagamento, "FFLO")){
				finanziaria = true;
			}
			
			Boolean telefoniaContratto = false;
			if(StringUtils.equals(fPagamento, "WW") || StringUtils.equals(fPagamento, "W3") || StringUtils.equals(fPagamento, "WT") || StringUtils.equals(fPagamento, "WV")){
				telefoniaContratto = true;
			}
			
			Boolean reso = false;
			if(StringUtils.equals(causale, "NRFW")){
				reso = true;
			}
			
			log.info("Elaboro: " + msvOA_PrimaNota_Tes.getnReg());
			
			MsvOA_AnagCausCont msvOA_AnagCausCont = msvOA_AnagCausContDao.getDaCatCodice(causale);
			if((msvOA_AnagCausCont != null) && (StringUtils.startsWith(msvOA_AnagCausCont.getCatDescrizione(), "Storno Acconto"))){
				log.warn("Trascuro la causale " + causale + ", " + msvOA_PrimaNota_RigheDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg()).get(0).toString());
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
				msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
				msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
				continue;
			}else if((msvOA_AnagCausCont != null) && (StringUtils.startsWith(msvOA_AnagCausCont.getCatDescrizione(), "Nota Credito Corrispettivi"))){ // if(StringUtils.equals(StringUtils.left(causale, 3), "NCC")){
				log.warn("Trascuro la causale " + causale);
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
				msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
				msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
				continue;
			}
			
			Boolean fattura = false;
			
			AsClien00f asClien00f = null;
			
			String scdatTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_Tes.getDataReg());
			scdat = Integer.parseInt(scdatTxt);
			
			BigDecimal importoAcconto = new BigDecimal(0);
			
			MsvOA_PrimaNota_Righe msvOA_PrimaNota_Righe = new MsvOA_PrimaNota_Righe();
			
			msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg());
			if(msvOA_PrimaNota_RigheLs.isEmpty()){
				msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNRegElaborate(msvOA_PrimaNota_Tes.getnReg());
			}
			
			Boolean gestisciTradein00174 = false;
			
			Iterator<MsvOA_PrimaNota_Righe> iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			while(iter_msvOA_PrimaNota_RigheLs.hasNext()){
				msvOA_PrimaNota_Righe = iter_msvOA_PrimaNota_RigheLs.next();
				
				if(StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "C")){
					asClien00f = asClien00fDao.getDaClccli(new BigDecimal(msvOA_PrimaNota_Righe.getCliFor()));
					
					String nota1 = StringUtils.normalizeSpace(StringUtils.replace(StringUtils.trim(msvOA_PrimaNota_Righe.getNota1()), ".", " "));
					primaNotaData = null;
					primaNotaDocumento = null;
					primaNotaNumDepo = 0;
					determinaNumDocumentoDataDepo(nota1);
					String data = primaNotaData;
					String documento = primaNotaDocumento;
					scdep = primaNotaNumDepo;
					
					data = StringUtils.join(StringUtils.right(data, 4), StringUtils.substring(data, 3, 5), StringUtils.left(data, 2));
					
					// se entro qui e' perche' e' una fattura e per sapere il deposito vado a cercare direttamente la fattura
					if(Integer.compare(scdep, 0) == 0){
						fattura = true;
						
						Integer fdatd = Integer.parseInt(data);
						Integer fnumd = Integer.parseInt(documento);
						BigDecimal fcocl = asClien00f.getClccli();
						AsFatem0f asFatem0f = asFatem0fDao.getDaFdatdFnumdFcocl(fdatd, fnumd, fcocl);
						if(asFatem0f == null){
							log.error("Fattura non trovata: " + fdatd + ", " + fnumd + ", " + fcocl);
							scdep = 2; // suppongo che sia amazon (e' una forzatura brutta ma mi sa che funziona)
						}else{
							scdep = asFatem0f.getFndep().intValue();
						}
					}
					scnus = Integer.parseInt(documento);
					scnus = scnus % 100000; // sempre sotto 99999
				}
				
				if(StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "G") && StringUtils.equals(StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor()), "02290")){
					importoAcconto = importoAcconto.add(msvOA_PrimaNota_Righe.getDare());
					// importoAcconto = importoAcconto.add(msvOA_PrimaNota_Righe.getAvere());
				}
				
				// trade in super valutazione
				if(StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "G") && StringUtils.equals(StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor()), "00174")){
					gestisciTradein00174 = true;
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
				msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
				msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
			}
			
			importoAcconto = Support.arrotonda(importoAcconto, 2);
			if(importoAcconto.compareTo(new BigDecimal(0)) > 0){
				// scims = scims.add(importoAcconto);
				scims = scims.add(new BigDecimal(0));
			}
			
			scnuz = scdep;
			
			// nuovo deposito - definire il nuovo valore
			// in tabel0f, NUZ
			scnum = 0;
			String tcoel = StringUtils.join("SC", scdep.toString());
			switch(tcoel){
				case "SC11":
					tcoel = "SCA";
					break;
				case "SC13":
					tcoel = "SCC";
					break;
				case "SC14":
					tcoel = "SCD";
					break;
				case "SC15":
					tcoel = "SCE";
					break;
				default:
					break;
			}
			AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", tcoel);
			String tcomm = StringUtils.trim(asTabel0f.getTcomm());
			String tcommmtnum = StringUtils.left(tcomm, 5);
			String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
			String tcommmtnuz = StringUtils.substring(tcomm, 11, 13);
			String tcommresto = StringUtils.substring(tcomm, 13);
			String tcommcauc = StringUtils.substring(tcomm, 13, 15);
			if(reso){
				tcommcauc = StringUtils.substring(tcomm, 19, 21);
			}
			
			BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
			mtnumBD = mtnumBD.add(new BigDecimal(1));
			
			tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
			tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_PrimaNota_Tes.getDataReg());
			
			tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz, tcommresto);
			
			asTabel0f.setTcomm(tcomm);
			if(!(asTabel0fDao.aggiorna(asTabel0f))){
				chiudi();
			}
			asTabel0fDao.detach(asTabel0f);
			
			scnum = mtnumBD.intValue();
			sccag = tcommcauc;
			
			sccau = StringUtils.join("G", StringUtils.leftPad(scdep.toString(), 2, "0"));
			scnzs = 1;
			
			// String numDoc = msvOA_MovimentiTestate.getNroDoc();
			// if(StringUtils.isNotBlank(numDoc)){
			// scnus = Integer.parseInt(StringUtils.left(msvOA_MovimentiTestate.getNroDoc(), 6));
			// }else{
			// scnus = Integer.parseInt(StringUtils.right(msvOA_MovimentiTestate.getIdUnivocoTes(), 5));
			// }
			// scnus = scnus % 100000; // sempre sotto 99999
			
			sccoc = asClien00f.getClccli().intValue();
			
			scims = new BigDecimal(0);
			BigDecimal importoOmaggio = new BigDecimal(0);
			
			MsvOA_PrimaNota_Iva msvOA_PrimaNota_Iva = new MsvOA_PrimaNota_Iva();
			
			msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg());
			
			Iterator<MsvOA_PrimaNota_Iva> iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
			iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
			while(iter_msvOA_PrimaNota_IvaLs.hasNext()){
				msvOA_PrimaNota_Iva = iter_msvOA_PrimaNota_IvaLs.next();
				
				scims = scims.add(msvOA_PrimaNota_Iva.getImponibile());
				scims = scims.add(msvOA_PrimaNota_Iva.getImposta());
				
				String codIva = "";
				codIva = StringUtils.trim(msvOA_PrimaNota_Iva.getCodIva());
				if(StringUtils.endsWith(codIva, ".") && !(StringUtils.equals(codIva, "BU."))){
					codIva = StringUtils.removeEnd(codIva, ".");
				}else{
					codIva = transCodiciIva(codIva, "oasi2as");
					if(StringUtils.isBlank(codIva)){
						log.error("Codice: " + msvOA_PrimaNota_Iva.getCodIva() + " non gestito");
						codIva = "22";
					}
				}
				if(StringUtils.equals(codIva, "62")){
					MsvOA_MovimentiTestate msvOA_MovimentiTestate = msvOA_MovimentiTestateDao.getDaIdPntNReg(msvOA_PrimaNota_Tes.getnReg());
					if(msvOA_MovimentiTestate != null){
						MsvOA_MovimentiRighe msvOA_MovimentiRighe = null;
						msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTes(msvOA_MovimentiTestate.getIdUnivocoTes());
						Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
						iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
						while(iter_msvOA_MovimentiRigheLs.hasNext()){
							msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
							
							if((msvOA_MovimentiRighe.getPrezzoNetto().compareTo(new BigDecimal(0)) == 0) && (msvOA_MovimentiRighe.getValoreOmaggio().compareTo(new BigDecimal(0)) > 0)){
								importoOmaggio = importoOmaggio.add(Support.arrotonda(msvOA_MovimentiRighe.getQta().multiply(msvOA_MovimentiRighe.getValoreOmaggio()), 2));
							}
						}
						log.info("Omaggio: " + importoOmaggio);
						scims = scims.subtract(importoOmaggio);
					}
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Iva.getTipoOperazione(), 2));
				msvOA_PrimaNota_Iva.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_IvaDao.aggiorna(msvOA_PrimaNota_Iva);
				msvOA_PrimaNota_IvaDao.detach(msvOA_PrimaNota_Iva);
			}
			scims = Support.arrotonda(scims, 2);
			
			if(reso){
				scims = scims.multiply(new BigDecimal(-1));
			}
			
			scute = "";
			MsvOA_MovimentiTestate msvOA_MovimentiTestate = msvOA_MovimentiTestateDao.getDaIdPntNReg(msvOA_PrimaNota_Tes.getnReg());
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = null;
			if(msvOA_MovimentiTestate != null){
				msvOA_MovimentiRighe = msvOA_MovimentiRigheDao.getDaIdUnivocoTes(msvOA_MovimentiTestate.getIdUnivocoTes()).get(0);
				scute = msvOA_MovimentiRighe.getCodOperatore();
			}
			
			sctpc = "C";
			scdaf = 0; // finaz0f.fndat
			scnuf = 0; // finaz0f.fnnum
			if(finanziaria){
				BigDecimal importoDocumento = scims;
				BigDecimal importoFinanziaria = scims.subtract(importoAcconto);
				Integer dataFin = null;
				Integer numFin = null;
				Object paramRitorno[] = new Object[3];
				sctpc = "F";
				sccoc = 0;
				elaboraFinanziaria(msvOA_PrimaNota_Tes, msvOA_MovimentiTestate, asClien00f.getClccli().intValue(), fattura, importoDocumento, importoFinanziaria, scnum, scdep, scute, paramRitorno);
				// se importo scontrino a credito e importo finanziaria non coincidono, allora sia lo scocr0f che finaz0f le intesto al codice cliente
				importoFinanziaria = (BigDecimal)paramRitorno[0];
				dataFin = (Integer)paramRitorno[1];
				numFin = (Integer)paramRitorno[2];
				if(importoDocumento.compareTo(importoFinanziaria) != 0){
					sccoc = asClien00f.getClccli().intValue();
				}
				scdaf = dataFin;
				scnuf = numFin;
			}
			
			scnot = StringUtils.left(msvOA_PrimaNota_Tes.getProtocollo(), 25);
			if(StringUtils.isBlank(scnot)){
				scnot = StringUtils.left(msvOA_PrimaNota_Tes.getnReg(), 25);
			}
			
			if(telefoniaContratto){
				sccoc = 12888; // cliente Wind-Tre
				scnot = StringUtils.left(StringUtils.join(scnot, "-", asClien00f.getCldrso()), 25);
			}
			
			String scpagTxt = StringUtils.trim(msvOA_PrimaNota_Tes.getfPagamento());
			if(StringUtils.containsOnly(scpagTxt, "0123456789")){
				scpag = Integer.parseInt(scpagTxt);
			}else{ // e' un codice oasi, devo fare transcodifica
				scpagTxt = transPagamenti(scpagTxt, "oasi2as");
				if(StringUtils.isBlank(scpagTxt)){
					log.error("Codice: " + msvOA_PrimaNota_Tes.getfPagamento() + " non gestito");
					scpagTxt = "1"; // contanti
				}
				scpag = Integer.parseInt(scpagTxt);
			}
			
			AsScocr0fPKey idS = new AsScocr0fPKey();
			idS.setScdat(scdat);
			idS.setScnuz(scnuz);
			idS.setScnum(scnum);
			AsScocr0f asScocr0f = new AsScocr0f();
			asScocr0f.setId(idS);
			asScocr0f.setSccau(sccau);
			asScocr0f.setScnzs(scnzs);
			asScocr0f.setScnus(scnus);
			asScocr0f.setScdep(scdep);
			asScocr0f.setSccoc(sccoc);
			asScocr0f.setScims(scims);
			asScocr0f.setSctpc(sctpc);
			asScocr0f.setScdaf(scdaf);
			asScocr0f.setScnuf(scnuf);
			asScocr0f.setScute(scute);
			asScocr0f.setScnot(scnot);
			asScocr0f.setSccag(sccag);
			asScocr0f.setScpag(scpag);
			
			AsScocr0f asScocr0fTmp = asScocr0fDao.getDaId(scdat, scnuz, scnum);
			if(asScocr0fTmp == null){ // nuova quindi insert
				if(!(asScocr0fDao.salva(asScocr0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
				if(!(asScocr0fDao.aggiorna(asScocr0f))){
					chiudi();
				}
				asScocr0fDao.detach(asScocr0fTmp);
			}
			
			if(StringUtils.equals(StringUtils.left(causale, 2), "AC")){
				elaboraPagamenti(msvOA_PrimaNota_Tes);
				asScocr0f.setSccag(causaleContSccag);
				if(!(asScocr0fDao.aggiorna(asScocr0f))){
					chiudi();
				}
			}
			asScocr0fDao.detach(asScocr0f);
			
			// satispay
			if((!(StringUtils.equals(StringUtils.left(causale, 2), "AC"))) && StringUtils.equals(msvOA_PrimaNota_Tes.getfPagamento(), "SATI")){
				elaboraPagamenti(msvOA_PrimaNota_Tes);
			}
			
			// trade in
			if(gestisciTradein00174){
				elaboraPagamenti(msvOA_PrimaNota_Tes);
			}
			
			// elimina dalla tabella scritta da oasi
			// msvOA_PrimaNota_TesDao.elimina(msvOA_PrimaNota_Tes);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
			msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
			msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
			msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
		}
		
		asFatem0fDao.close();
		asScocr0fDao.close();
		msvOA_AnagCausContDao.close();
		
		log.info("]" + "elaboraCrediti");
	}
	
	private void elaboraPagamenti(){
		elaboraPagamenti(null);
	}
	
	private void elaboraPagamenti(MsvOA_PrimaNota_Tes o){
		log.info("[" + "elaboraPagamenti");
		
		AsFatem0fDao asFatem0fDao = new AsFatem0fDaoMng();
		AsCcmca0fDao asCcmca0fDao = new AsCcmca0fDaoMng();
		List<AsCcmca0f> asCcmca0fLs;
		AsScocr0fDao asScocr0fDao = new AsScocr0fDaoMng();
		
		MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = new MsvOA_PrimaNota_Tes();
		
		// msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesDao.getDaRegIva("03");
		
		msvOA_PrimaNota_TesLs = new ArrayList<MsvOA_PrimaNota_Tes>();
		
		if(o == null){
			// nuovo deposito - definire il nuovo valore
			// Causali Contabili 1096
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("PACA")); // Registrazione pagamenti Cassa
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL1")); // Incasso P.V. 1 - Termini
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INCF")); // Incasso P.V. 2 - Lascari
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL2")); // Incasso P.V. 3 - Bagheria
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL4")); // Incasso P.V. 4 - Brolo
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL9")); // Incasso P.V. 9 - Palermo GDM
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL6")); // Incasso P.V. 011 - Milazzo
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL5")); // Incasso P.V. 5 - Sciacca (ex Enna)
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INL7")); // Incasso P.V. 7 - Palermo Dante
			// msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("ACL1"));
			// msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("ACCF"));
			// msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("ACL2"));
			// msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("ACL4"));
			// msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("ACL5"));
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("INB1")); // Incasso Buoni pv1
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC1")); // Fattura per Acconto PV 1 - Termini
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC2")); // Fattura per Acconto PV 2 - Lascari
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC3")); // Fattura per Acconto PV 3 - Bagheria
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC4")); // Fattura per Acconto PV 4 - Brolo
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC9")); // Fattura per Acconto PV 9 - Palermo GDM
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC6")); // Fattura per Acconto PV 011 - Milazzo
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC5")); // Fattura per Acconto PV 5 - Sciacca (ex Enna)
			msvOA_PrimaNota_TesLs.addAll(msvOA_PrimaNota_TesDao.getDaCausale("FAC7")); // Fattura per Acconto PV 7 - Palermo Dante
		}else{
			msvOA_PrimaNota_TesLs.add(o);
		}
		
		// solo alcuni movimenti
		// msvOA_PrimaNota_TesLs.clear();
		// msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00324084")); // lo puo lanciare elaboraCrediti, per gestire 00174
		// msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00324085")); // questo gestisce 00164
				
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_PrimaNota_Tes> iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
		iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
		while(iter_msvOA_PrimaNota_TesLs.hasNext()){
			msvOA_PrimaNota_Tes = iter_msvOA_PrimaNota_TesLs.next();
			
			String fPagamento = StringUtils.trim(msvOA_PrimaNota_Tes.getfPagamento());
			
			Boolean telefoniaContratto = false;
			if(StringUtils.equals(fPagamento, "WW") || StringUtils.equals(fPagamento, "W3") || StringUtils.equals(fPagamento, "WT") || StringUtils.equals(fPagamento, "WV")){
				telefoniaContratto = true;
			}
			
			Integer cadar = 0;
			Integer canum = 0;
			Integer carig = 0;
			Integer cadad = 0;
			Integer cadap = 0;
			String canup = "";
			Integer canrp = 0;
			String canud = "";
			String cacre = "";
			String cadav = "";
			BigDecimal caimp = new BigDecimal(0);
			String cacon = "";
			String cacoa = "";
			String cadmo = "";
			
			cadar = 0;
			String cadarTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_Tes.getDataReg());
			cadar = Integer.parseInt(cadarTxt);
			
			canum = 0;
			canum = asCcmca0fDao.getUltimoCanum(cadar).intValue();
			canum = canum + 1;
			
			Integer scdep = 0;
			
			canrp = 0;
			
			MsvOA_PrimaNota_Righe msvOA_PrimaNota_Righe = new MsvOA_PrimaNota_Righe();
			
			msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg());
			if(msvOA_PrimaNota_RigheLs.isEmpty()){
				msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNRegElaborate(msvOA_PrimaNota_Tes.getnReg());
			}
			
			// satispay, dato che dalla prima nota ricevo solo la riga con dare, duplico la stessa riga facendola diventare in avere e la aggiungo prima di dare
			if(StringUtils.equals(msvOA_PrimaNota_Tes.getfPagamento(), "SATI")){
				msvOA_PrimaNota_Righe = msvOA_PrimaNota_RigheLs.get(0);
				MsvOA_PrimaNota_RighePKey msvOA_PrimaNota_RighePKeyDuplicata = new MsvOA_PrimaNota_RighePKey();
				msvOA_PrimaNota_RighePKeyDuplicata.setnReg(msvOA_PrimaNota_Righe.getId().getnReg());
				// msvOA_PrimaNota_RighePKeyDuplicata.setnRiga(msvOA_PrimaNota_Righe.getId().getnRiga());
				msvOA_PrimaNota_RighePKeyDuplicata.setnRiga("000");
				MsvOA_PrimaNota_Righe msvOA_PrimaNota_RigheDuplicata = new MsvOA_PrimaNota_Righe();
				msvOA_PrimaNota_RigheDuplicata.setId(msvOA_PrimaNota_RighePKeyDuplicata);
				msvOA_PrimaNota_RigheDuplicata.setTipoConto(msvOA_PrimaNota_Righe.getTipoConto());
				msvOA_PrimaNota_RigheDuplicata.setCliFor(msvOA_PrimaNota_Righe.getCliFor());
				msvOA_PrimaNota_RigheDuplicata.setDare(msvOA_PrimaNota_Righe.getAvere()); // dare e avere invertiti
				msvOA_PrimaNota_RigheDuplicata.setAvere(msvOA_PrimaNota_Righe.getDare());
				msvOA_PrimaNota_RigheDuplicata.setNota1(msvOA_PrimaNota_Righe.getNota1());
				msvOA_PrimaNota_RigheDuplicata.setNota2(StringUtils.join(msvOA_PrimaNota_Righe.getNota2(), " ", "rigo aggiunto da java"));
				msvOA_PrimaNota_RigheDuplicata.setTipoOperazione(msvOA_PrimaNota_Righe.getTipoOperazione());
				msvOA_PrimaNota_RigheLs.add(0, msvOA_PrimaNota_RigheDuplicata);
			}
			
			Iterator<MsvOA_PrimaNota_Righe> iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			Integer numeroGiro = 0;
			while(iter_msvOA_PrimaNota_RigheLs.hasNext()){
				msvOA_PrimaNota_Righe = iter_msvOA_PrimaNota_RigheLs.next();
				
				Boolean daEliminare = false;
				
				if((StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "G") && StringUtils.equals(StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor()), "02290")) || (StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "G") && (msvOA_PrimaNota_Righe.getAvere().compareTo(new BigDecimal(0)) > 0))){
					tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
					msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
					msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
					msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
					continue;
				}
				
				caimp = new BigDecimal(0);
				
				if(StringUtils.equals(msvOA_PrimaNota_Righe.getTipoConto(), "C")){
					AsClien00f asClien00f = asClien00fDao.getDaClccli(new BigDecimal(msvOA_PrimaNota_Righe.getCliFor()));
					cadmo = StringUtils.left(asClien00f.getCldrso(), 25);
					
					String nota1 = StringUtils.normalizeSpace(StringUtils.replace(StringUtils.trim(msvOA_PrimaNota_Righe.getNota1()), ".", " "));
					primaNotaData = null;
					primaNotaDocumento = null;
					primaNotaNumDepo = 0;
					determinaNumDocumentoDataDepo(nota1);
					String data = primaNotaData;
					String documento = primaNotaDocumento;
					scdep = primaNotaNumDepo;
					
					data = StringUtils.join(StringUtils.right(data, 4), StringUtils.substring(data, 3, 5), StringUtils.left(data, 2));
					
					cadad = Integer.parseInt(data);
					cadap = Integer.parseInt(StringUtils.join(StringUtils.left(data, 4), "0101"));
					
					canup = "";
					// se entro qui e' perche' e' una fattura e per sapere il deposito vado a cercare direttamente la fattura
					if(Integer.compare(scdep, 0) == 0){
						Integer fdatd = Integer.parseInt(data);
						Integer fnumd = Integer.parseInt(documento);
						BigDecimal fcocl = asClien00f.getClccli();
						AsFatem0f asFatem0f = asFatem0fDao.getDaFdatdFnumdFcocl(fdatd, fnumd, fcocl);
						if(asFatem0f == null){
							log.error("Fattura non trovata: " + fdatd + ", " + fnumd + ", " + fcocl);
						}else{
							scdep = asFatem0f.getFndep().intValue();
						}
						canup = StringUtils.leftPad(documento, 6, "0");
					}
					Integer scnus = Integer.parseInt(documento);
					scnus = scnus % 100000; // sempre sotto 99999
					
					AsScocr0f asScocr0f = asScocr0fDao.getDaScdatScnusScdep(Integer.parseInt(data), scnus, scdep);
					if(asScocr0f != null){
						canup = StringUtils.leftPad(asScocr0f.getId().getScnum().toString(), 6, "0");
					}
					canud = canup;
				}
				
				numeroGiro++;
				
				carig = numeroGiro;
				
				caimp = caimp.add(msvOA_PrimaNota_Righe.getDare());
				caimp = caimp.add(msvOA_PrimaNota_Righe.getAvere());
				
				if(msvOA_PrimaNota_Righe.getDare().compareTo(new BigDecimal(0)) > 0){
					cadav = "D";
					cacre = "";
					cacon = "";
					String contoStr = StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor());
					
					// satispay
					if(StringUtils.equals(msvOA_PrimaNota_Tes.getfPagamento(), "SATI")){
						contoStr = "SATI";
					}
					
					// per gestire ad esempio un pagamento effettuato in un deposito diverso da quello della commissione
					// nuovo deposito - definire il nuovo valore
					// Tabella Registratori Cassa 0524
					switch(contoStr){
						// termini
						case "00900": // cassa
						case "00930": // pos cassa 1
						case "00931": // pos cassa 2
						case "00932": // pos cassa 3
							scdep = 2;
							break;
						// lascari
						case "00910": // cassa
						case "00933": // pos cassa 1
						case "00934": // pos cassa 2
							scdep = 5;
							break;
						// bagheria
						case "00915": // cassa
						case "00935": // pos cassa 1
						case "00936": // pos cassa 2
							scdep = 6;
							break;
						// brolo
						case "00920": // cassa
						case "00937": // pos cassa 1
						case "00938": // pos cassa 2
							scdep = 8;
							break;
						// enna
						// case "00922": // cassa
						// case "00939": // pos cassa 1
						// scdep = 9;
						// break;
						// palermo gdm
						case "00929": // cassa
						case "00944": // pos cassa 1
						case "00945": // pos cassa 2
						case "00946": // pos cassa 3/4
							scdep = 11;
							break;
						// milazzo
						case "00947": // cassa
						case "00948": // pos cassa 1
						case "00949": // pos cassa 2
							scdep = 13;
							break;
						// sciacca
						case "00922": // cassa
						case "00939": // pos cassa 1
						case "00951": // pos cassa 2
							scdep = 14;
							break;
						// palermo dante
						case "00952": // cassa
						case "00953": // pos cassa 1
							scdep = 15;
							break;
						default:
							// non modifico scdep;
							break;
					}
					
					AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("DEC", StringUtils.join(" ", StringUtils.leftPad(scdep.toString(), 2, "0")));
					String tcomm = StringUtils.trim(asTabel0f.getTcomm());
					
					causaleContSccag = StringUtils.substring(tcomm, 68, 70); // , 76, 78);
					
					String contoMcoStr = StringUtils.join("cco", contoStr);	// cco=conto contabile oasi
					if(StringUtils.equals(contoStr, "00174")){	// trade in super valutazione che e' ivato
						contoMcoStr = "cco00164";	//  trade in esente iva
					}
					asTabel0f = asTabel0fDao.getDaTnotaTcom2("MCO", contoMcoStr);
					String tcommMco = "";
					if(asTabel0f != null){
						tcommMco = StringUtils.trim(asTabel0f.getTcomm());
					}
					
					// nuovo deposito - definire il nuovo valore
					// Tabella Registratori Cassa 0524
					switch(contoStr){
						// cassa corrispettivi
						case "00900": // termini
						case "00910": // lascari
						case "00915": // bagheria
						case "00920": // brolo
						case "00929": // palermo gdm
						case "00947": // milazzo
						case "00922": // sciacca (ex enna)
						case "00952": // palermo dante
							cacre = StringUtils.substring(tcomm, 60, 62);
							cacon = StringUtils.substring(tcomm, 0, 10);
							break;
						// pos cassa 1
						case "00930": // termini
						case "00933": // lascari
						case "00935": // bagheria
						case "00937": // brolo
						case "00944": // palermo gdm
						case "00948": // milazzo
						case "00939": // sciacca (ex enna)
						case "00953": // palermo dante
							cacre = StringUtils.substring(tcomm, 62, 64);
							cacon = StringUtils.substring(tcomm, 30, 40);
							switch(contoStr){
								case "00930": // termini
									cadmo = "CASSA 0101";
									break;
								case "00933": // lascari
									cadmo = "CASSA 0201";
									break;
								case "00935": // bagheria
									cadmo = "CASSA 0301";
									break;
								case "00937": // brolo
									cadmo = "CASSA 0401";
									break;
								case "00944": // palermo gdm
									cadmo = "CASSA 0901";
									break;
								case "00948": // milazzo
									cadmo = "CASSA 1101";
									break;
								case "00939": // sciacca
									cadmo = "CASSA 0501";
									break;
								case "00953": // palermo dante
									cadmo = "CASSA 1501";
									break;
								default:
									cadmo = "CASSA INDEFINITA";
									break;
							}
							break;
						// pos cassa 2
						case "00931": // termini
						case "00934": // lascari
						case "00936": // bagheria
						case "00938": // brolo
						case "00945": // palermo gdm
						case "00949": // milazzo
						case "00951": // sciacca (ex enna)
							cacre = StringUtils.substring(tcomm, 64, 66);
							cacon = StringUtils.substring(tcomm, 40, 50);
							switch(contoStr){
								case "00931": // termini
									cadmo = "CASSA 0102";
									break;
								case "00934": // lascari
									cadmo = "CASSA 0202";
									break;
								case "00936": // bagheria
									cadmo = "CASSA 0302";
									break;
								case "00938": // brolo
									cadmo = "CASSA 0402";
									break;
								case "00945": // palermo gdm
									cadmo = "CASSA 0902";
									break;
								case "00949": // milazzo
									cadmo = "CASSA 1102";
									break;
								case "00951": // sciacca
									cadmo = "CASSA 0502";
									break;
								default:
									cadmo = "CASSA INDEFINITA";
									break;
							}
							break;
						// pos cassa 3
						case "00932": // termini
						case "00946": // palermo gdm
							cacre = StringUtils.substring(tcomm, 66, 68);
							cacon = StringUtils.substring(tcomm, 50, 60);
							switch(contoStr){
								case "00932": // termini
									cadmo = "CASSA 0103";
									break;
								case "00946": // palermo gdm
									cadmo = "CASSA 0903";
									break;
								default:
									cadmo = "CASSA INDEFINITA";
									break;
							}
							break;
						// pos cassa 4 - dismesso e portato a milazzo
						// case "00947": // palermo gdm
						// cacre = StringUtils.substring(tcomm, 66, 68);
						// cacon = StringUtils.substring(tcomm, 50, 60);
						// switch(contoStr){
						// case "00947": // palermo gdm
						// cadmo = "CASSA 0904";
						// break;
						// default:
						// cadmo = "CASSA INDEFINITA";
						// break;
						// }
						// break;
						// abbuono passivo
						case "01300":
							cacre = "NP";
							cacon = "6705000001";
							break;
						// buono reso merce 0407449 - mclin=1
						case "00350":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// ER
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 3210000220
							break;
						// gift card
						case "08010":
							cacre = "IH";
							cacon = "1620060100";
							break;
						// gift card e buono interno 0407448 - mclin=Y
						case "00381":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// IH
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 3210000200
							break;
						// bonus tv - mclin=2
						case "00160":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// F1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1620005000
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							break;
						// bonus rottamazione tv
						case "00161":
							cacre = "F1";
							cacon = "1620005001";
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							break;
						// incasso SumUp
						case "00905":
							cacre = "L2";
							cacon = "1605040000";
							cadap = cadad;
							canup = "000001";
							break;
						// edenred - mclin=5
						case "00163":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// L3
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040010
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							break;
						// satispay
						case "SATI": // non e' un conto reale passato da oasi, ma forzato manualmente piu' sopra
							cacre = "L4";
							cacon = "1605040020";
							break;
						// mig for you, amilon, epipoli, jakala, tre cuori - mclin=7
						case "00168":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// L5
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040011
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							break;
						// trade in estendo/dg esente iva - mclin=8
						case "00164":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// I1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040009
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							cadmo = StringUtils.left(StringUtils.join("ESENTE", " | ", cadmo), 25);
							break;
						// trade in estendo/dg ivato - mclin=8
						case "00174":
							carig = 1;
							caimp = msvOA_PrimaNota_Righe.getDare();
							cacre = StringUtils.substring(tcommMco, 22, 24);	// I1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040009
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							cadmo = StringUtils.left(StringUtils.join("OLTRE IVA", " | ", cadmo), 25);
							gestisciTradein00174(scdep, cadar, canum, carig, cadad, cadap, canup, canrp, canud, cacre, caimp, cacon, cacoa, cadmo);
							cacon = "00174DELET";
							canum = 9999;
							canup = "00174D";
							daEliminare = true;
							break;
						case "09999":
							log.info("da eliminare perche' il conto e': " + contoStr);
							cacon = "%";
							daEliminare = true;
							break;
						default:
							log.info("da eliminare perche' il conto e': " + contoStr);
							cacon = "";
							daEliminare = true;
							break;
					}
				}else if(msvOA_PrimaNota_Righe.getAvere().compareTo(new BigDecimal(0)) > 0){
					cadav = "A";
					cacre = "IE";
					cacon = StringUtils.join("C", "   ", StringUtils.leftPad(StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor()), 6, "0"));
					
					if(telefoniaContratto){
						Integer cli = 12888; // cliente Wind-Tre
						cacon = StringUtils.join("C", "   ", StringUtils.leftPad(cli.toString(), 6, "0"));
					}
				}else{
					log.error("Non e' possibile ne dare e ne avere");
				}
				
				AsCcmca0fPKey idC = new AsCcmca0fPKey();
				idC.setCadar(cadar);
				idC.setCanum(canum);
				idC.setCarig(carig);
				AsCcmca0f asCcmca0f = new AsCcmca0f();
				asCcmca0f.setId(idC);
				asCcmca0f.setCadad(cadad);
				asCcmca0f.setCadap(cadap);
				asCcmca0f.setCanup(canup);
				asCcmca0f.setCanrp(canrp);
				asCcmca0f.setCanud(canud);
				asCcmca0f.setCacre(cacre);
				asCcmca0f.setCadav(cadav);
				asCcmca0f.setCaimp(caimp);
				asCcmca0f.setCacon(cacon);
				asCcmca0f.setCacoa(cacoa);
				asCcmca0f.setCadmo(cadmo);
				
				AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
				if(asCcmca0fTmp == null){ // nuova quindi insert
					if(!(asCcmca0fDao.salva(asCcmca0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					if(!(asCcmca0fDao.aggiorna(asCcmca0f))){
						chiudi();
					}
					asCcmca0fDao.detach(asCcmca0fTmp);
				}
				asCcmca0fDao.detach(asCcmca0f);
				
				if(StringUtils.equals(cacre, "L2") || StringUtils.equals(cacre, "L3") || StringUtils.equals(cacre, "L4") || StringUtils.equals(cacre, "L5")){
					log.info("modifico il pagamento precedente");
					asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, (carig - 1)); // il rigo prima
					asCcmca0fTmp.setCacre(cacre);
					if(StringUtils.equals(cacre, "L3")){
						asCcmca0fTmp.setCanup(canup);
						asCcmca0fTmp.setCanud(canud);
					}
					if(!(asCcmca0fDao.aggiorna(asCcmca0fTmp))){
						chiudi();
					}
					asCcmca0fDao.detach(asCcmca0fTmp);
				}
				
				if(daEliminare){
					// log.info("elimino ccmca - cadar: " + cadar + ", canum: " + canum + ", canup: " + canup + ", cacon: " + cacon);
					// asCcmca0fLs = asCcmca0fDao.getDaCadarCanumCanupCacon(cadar, canum, canup, cacon);
					log.info("elimino ccmca - cadar: " + cadar + ", canum: " + canum + ", canup: " + canup);
					asCcmca0fLs = asCcmca0fDao.getDaCadarCanumCanup(cadar, canum, canup);
					Iterator<AsCcmca0f> iter_asCcmca0fLs = asCcmca0fLs.iterator();
					iter_asCcmca0fLs = asCcmca0fLs.iterator();
					while(iter_asCcmca0fLs.hasNext()){
						AsCcmca0f asCcmca0fElim = iter_asCcmca0fLs.next();
						asCcmca0fDao.elimina(asCcmca0fElim);
					}
				}
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
				msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
				msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
			}
			
			// elimina dalla tabella scritta da oasi
			// msvOA_PrimaNota_TesDao.elimina(msvOA_PrimaNota_Tes);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
			msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
			msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
			msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
		}
		
		asFatem0fDao.close();
		asCcmca0fDao.close();
		asScocr0fDao.close();
		
		log.info("]" + "elaboraPagamenti");
	}
	
	private void elaboraFinanziaria(MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes, MsvOA_MovimentiTestate msvOA_MovimentiTestate, Integer codCliente, Boolean fattura, BigDecimal importoDocumento, BigDecimal importoFinanziaria, Integer numPartita, Integer deposito, String utente, Object paramRitorno[]){
		log.info("[" + "elaboraFinanziaria");
		
		AsFinaz0fDao asFinaz0fDao = new AsFinaz0fDaoMng();
		
		paramRitorno[0] = new BigDecimal(0);
		paramRitorno[1] = Integer.valueOf(0);
		paramRitorno[2] = Integer.valueOf(0);
		
		Integer fndat = 0;
		Integer fnnum = 0;
		Integer fncoc = 0;
		String fnnoc = "";
		String fnloc = "";
		String fncfi = "";
		Integer fnnur = 0;
		BigDecimal fnifi = new BigDecimal(0);
		String fncag = "";
		String fnnup = "";
		Integer fndep = 0;
		String fnute = "";
		String fntab = "";
		String fnta2 = "";
		Integer fnnpa = 0;
		
		fnifi = importoFinanziaria;
		
		if(fnifi.compareTo(new BigDecimal(0)) > 0){
			String fndatTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_Tes.getDataReg());
			fndat = Integer.parseInt(fndatTxt);
			
			fnnum = 0;
			AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("NUZ", "PFI");
			String tcomm = StringUtils.trim(asTabel0f.getTcomm());
			String tcommmtnum = StringUtils.left(tcomm, 5);
			String tcommmtdat = StringUtils.substring(tcomm, 5, 11);
			String tcommmtnuz = StringUtils.substring(tcomm, 11, 13);
			String tcommresto = StringUtils.substring(tcomm, 13);
			// String tcommcauc = StringUtils.substring(tcomm, 13, 15);
			
			BigDecimal mtnumBD = new BigDecimal(tcommmtnum);
			mtnumBD = mtnumBD.add(new BigDecimal(1));
			
			tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
			tcommmtdat = new SimpleDateFormat("ddMMyy").format(msvOA_PrimaNota_Tes.getDataReg());
			
			tcomm = StringUtils.join(tcommmtnum, tcommmtdat, tcommmtnuz, tcommresto);
			
			asTabel0f.setTcomm(tcomm);
			if(!(asTabel0fDao.aggiorna(asTabel0f))){
				chiudi();
			}
			asTabel0fDao.detach(asTabel0f);
			
			fnnum = mtnumBD.intValue();
			// fncag = tcommcauc;
			
			AsClien00f asClien00f = asClien00fDao.getDaClccli(new BigDecimal(codCliente));
			
			fncoc = 0;
			if(fattura){
				fncoc = asClien00f.getClccli().intValue();
			}
			
			fncfi = transFinanziarie(msvOA_PrimaNota_Tes.getfPagamento(), "oasi2as");
			
			fnloc = asClien00f.getCldloc();
			
			fnnoc = StringUtils.trim(asClien00f.getCldrso());
			
			fnnup = "";
			fntab = "";
			fnta2 = "";
			
			if(msvOA_MovimentiTestate != null){
				String notaFN = msvOA_MovimentiTestate.getNotaFN();
				String notaFZ = msvOA_MovimentiTestate.getNotaFZ();
				BigDecimal paramFinDecimal[] = new BigDecimal[1];
				paramFinDecimal[0] = fnifi;
				String paramFinString[] = new String[5];
				paramFinString[0] = fnnoc;
				paramFinString[1] = fnnup;
				paramFinString[2] = fntab;
				paramFinString[3] = fncfi;
				paramFinString[4] = fnnum.toString();
				decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
				fnifi = paramFinDecimal[0];
				fnnoc = paramFinString[0];
				fnnup = paramFinString[1];
				fntab = paramFinString[2];
			}
			
			fnta2 = fntab;
			
			fndep = deposito;
			fnute = utente;
			
			importoFinanziaria = fnifi;
			paramRitorno[0] = importoFinanziaria;
			// se importo scontrino a credito e importo finanziaria non coincidono, allora sia lo scocr0f che finaz0f le intesto al codice cliente
			if(importoDocumento.compareTo(importoFinanziaria) != 0){
				fncoc = asClien00f.getClccli().intValue();
			}
			fnnpa = numPartita;
			
			// nel caso che con la stessa pratica, vengano chiuse diverse commissioni (anche a nomi diversi), si devono registrare piu' finaz con fnnur uguale
			// per determinare se la finanziaria e' la stessa faccio la selezione per tipo finanziaria (fncfi) e codice finanziaria (fnnup)
			AsFinaz0f asFinaz0fFnnur = asFinaz0fDao.getDaFndatFncfiFnnup(fndat, fncfi, fnnup);
			if(asFinaz0fFnnur == null){
				fnnur = 0;
				asTabel0f = asTabel0fDao.getDaTnotaTcoel("FIN", fncfi);
				tcomm = StringUtils.trim(asTabel0f.getTcomm());
				String tcomminit = StringUtils.left(tcomm, 3);
				tcommmtnum = StringUtils.substring(tcomm, 3, 8);
				tcommresto = StringUtils.substring(tcomm, 8);
				
				mtnumBD = new BigDecimal(tcommmtnum);
				mtnumBD = mtnumBD.add(new BigDecimal(1));
				
				tcommmtnum = StringUtils.leftPad(mtnumBD.toString(), 5, "0");
				
				tcomm = StringUtils.join(tcomminit, tcommmtnum, tcommresto);
				
				asTabel0f.setTcomm(tcomm);
				if(!(asTabel0fDao.aggiorna(asTabel0f))){
					chiudi();
				}
				asTabel0fDao.detach(asTabel0f);
				
				fnnur = mtnumBD.intValue();
				fncag = StringUtils.left(tcomminit, 2);
			}else{
				log.info("Finanziaria gia' esistente, uso lo stesso FNNUR - " + asFinaz0fFnnur);
				fnnur = asFinaz0fFnnur.getFnnur();
				fncag = asFinaz0fFnnur.getFncag();
				asFinaz0fDao.detach(asFinaz0fFnnur);
			}
			
			AsFinaz0fPKey idF = new AsFinaz0fPKey();
			idF.setFndat(fndat);
			idF.setFnnum(fnnum);
			AsFinaz0f asFinaz0f = new AsFinaz0f();
			asFinaz0f.setId(idF);
			asFinaz0f.setFncoc(fncoc);
			asFinaz0f.setFnnoc(fnnoc);
			asFinaz0f.setFnloc(fnloc);
			asFinaz0f.setFncfi(fncfi);
			asFinaz0f.setFnnur(fnnur);
			asFinaz0f.setFnifi(fnifi);
			asFinaz0f.setFncag(fncag);
			asFinaz0f.setFnnup(fnnup);
			asFinaz0f.setFndep(fndep);
			asFinaz0f.setFnute(fnute);
			asFinaz0f.setFntab(fntab);
			asFinaz0f.setFnta2(fnta2);
			asFinaz0f.setFnnpa(fnnpa);
			
			AsFinaz0f asFinaz0fTmp = asFinaz0fDao.getDaId(fndat, fnnum);
			if(asFinaz0fTmp == null){ // nuova quindi insert
				if(!(asFinaz0fDao.salva(asFinaz0f))){
					chiudi();
				}
			}else{ // gia' presente, quindi update
				if(!(asFinaz0fDao.aggiorna(asFinaz0f))){
					chiudi();
				}
				asFinaz0fDao.detach(asFinaz0fTmp);
			}
			asFinaz0fDao.detach(asFinaz0f);
			
			// dataFin = fndat;
			// numFin = fnnum;
			paramRitorno[1] = fndat;
			paramRitorno[2] = fnnum;
		}
		
		asFinaz0fDao.close();
		
		log.info("]" + "elaboraFinanziaria");
	}
	
	private void elaboraChiusuraCassa(){
		log.info("[" + "elaboraChiusuraCassa");
		
		corrispettiviDaElaborareLs = new ArrayList<String>();
		
		AsCcmca0fDao asCcmca0fDao = new AsCcmca0fDaoMng();
		
		MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = new MsvOA_PrimaNota_Tes();
		
		// nuovo deposito - definire il nuovo valore
		// Causali Contabili 1096
		// CRL1 - Corrispettivi Contanti P.V. 1 - Termini
		// CRCF - Corrispettivi Contanti P.V. 2 - Lascari
		// CRL2 - Corrispettivi Contanti P.V. 3 - Bagheria
		// CRL4 - Corrispettivi Contanti P.V.4 - Brolo
		// CRL9 - Corrispettivi Contanti P.V.9 - Palermo GDM
		// CRL6 - Corrispettivi Contanti P.V. 011 - Milazzo
		// CRL5 - Corrispettivi Contanti P.V.5 - Sciacca (ex Enna)
		// CRL7 - Corrispettivi Contanti P.V.7 - Palermo Dante
		msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesDao.getDaCausali("'CRL1', 'CRCF', 'CRL2', 'CRL4', 'CRL9', 'CRL6', 'CRL5', 'CRL7'");
		
		// solo alcuni movimenti
		// msvOA_PrimaNota_TesLs.clear();
		// msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00324206"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		BigDecimal importoTotale = new BigDecimal(0);
		
		String cadarTxtPrecedente = "";
		String cadarTxtSuccessiva = "";
		Boolean inserisciTotale = true;
		
		Integer numeroGiro = 0;
		Integer canum = 0;
		
		MsvOA_PrimaNota_Tes arrayMsvOA_PrimaNota_Tes[] = msvOA_PrimaNota_TesLs.toArray(new MsvOA_PrimaNota_Tes[msvOA_PrimaNota_TesLs.size()]);
		
		for(int i = 0; i < arrayMsvOA_PrimaNota_Tes.length; i++){
			msvOA_PrimaNota_Tes = arrayMsvOA_PrimaNota_Tes[i];
			MsvOA_PrimaNota_Tes msvOA_PrimaNota_TesSuccessiva = null;
			
			if(i < (arrayMsvOA_PrimaNota_Tes.length - 1)){
				msvOA_PrimaNota_TesSuccessiva = arrayMsvOA_PrimaNota_Tes[i + 1];
				cadarTxtSuccessiva = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_TesSuccessiva.getDataReg());
			}else if(i == (arrayMsvOA_PrimaNota_Tes.length - 1)){
				cadarTxtSuccessiva = "19990101";
			}
			
			String cadarTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_Tes.getDataReg());
			
			String corrispettivoDaElaborare = StringUtils.join(cadarTxt, "|", msvOA_PrimaNota_Tes.getRegIva(), "|", msvOA_PrimaNota_Tes.getSezionale());
			if(!(corrispettiviDaElaborareLs.contains(corrispettivoDaElaborare))){
				corrispettiviDaElaborareLs.add(corrispettivoDaElaborare);				
			}
			
			Integer cadar = 0;
			Integer carig = 0;
			Integer cadad = 0;
			Integer cadap = 0;
			String canup = "";
			Integer canrp = 0;
			String canud = "";
			String cacre = "";
			String cadav = "";
			BigDecimal caimp = new BigDecimal(0);
			String cacon = "";
			String cacoa = "";
			String cadmo = "";
			
			cadar = 0;
			cadar = Integer.parseInt(cadarTxt);
			
			inserisciTotale = true;
			if(StringUtils.equals(cadarTxt, cadarTxtSuccessiva)){
				inserisciTotale = false;
			}
			
			if(!(StringUtils.equals(cadarTxt, cadarTxtPrecedente))){
				cadarTxtPrecedente = cadarTxt;
				importoTotale = new BigDecimal(0);
				canum = 0;
				canum = asCcmca0fDao.getUltimoCanum(cadar).intValue();
				canum = canum + 1;
				numeroGiro = 0;
			}
			
			cadad = cadar;
			cadap = Integer.parseInt(StringUtils.join(StringUtils.left(cadarTxt, 4), "0101"));
			
			canup = "";
			canud = "";
			
			cadav = "D";
			
			cadmo = StringUtils.left(msvOA_PrimaNota_Tes.getDocumento(), 25);
			
			canrp = 0;
			
			// nuovo deposito - definire il nuovo valore
			String sezionaleOasi = StringUtils.leftPad(msvOA_PrimaNota_Tes.getSezionale(), 3, "0");
			switch(sezionaleOasi){
				case "006": // milazzo
					sezionaleOasi = "011";
					break;
				case "007": // palermo dante
					sezionaleOasi = "012";
					break;
				default:
					// gli altri sezionali, coincidono con il numero di deposito
					break;
			}
			Integer scdep = Integer.parseInt(transDeposito(sezionaleOasi, "oasi2as"));
			
			MsvOA_PrimaNota_Righe msvOA_PrimaNota_Righe = new MsvOA_PrimaNota_Righe();
			
			msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNReg(msvOA_PrimaNota_Tes.getnReg());
			if(msvOA_PrimaNota_RigheLs.isEmpty()){
				msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheDao.getDaNRegElaborate(msvOA_PrimaNota_Tes.getnReg());
			}
			
			Iterator<MsvOA_PrimaNota_Righe> iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			iter_msvOA_PrimaNota_RigheLs = msvOA_PrimaNota_RigheLs.iterator();
			while(iter_msvOA_PrimaNota_RigheLs.hasNext()){
				msvOA_PrimaNota_Righe = iter_msvOA_PrimaNota_RigheLs.next();

				log.info("Elaboro: " + msvOA_PrimaNota_Righe);

				cacon = null;
				cacoa = "";
				
				cadmo = StringUtils.left(msvOA_PrimaNota_Tes.getDocumento(), 25);
				
				if(msvOA_PrimaNota_Righe.getDare().compareTo(new BigDecimal(0)) > 0){
					String contoStr = StringUtils.trim(msvOA_PrimaNota_Righe.getCliFor());
					
					AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("DEC", StringUtils.join(" ", StringUtils.leftPad(scdep.toString(), 2, "0")));
					String tcomm = StringUtils.trim(asTabel0f.getTcomm());
					
					String contoMcoStr = StringUtils.join("cco", contoStr);	// cco=conto contabile oasi
					if(StringUtils.equals(contoStr, "00174")){	// trade in super valutazione che e' al 22%
						contoMcoStr = "cco00164";	//  trade in esente iva
					}
					asTabel0f = asTabel0fDao.getDaTnotaTcom2("MCO", contoMcoStr);
					String tcommMco = "";
					if(asTabel0f != null){
						tcommMco = StringUtils.trim(asTabel0f.getTcomm());
					}

					// nuovo deposito - definire il nuovo valore
					// Tabella Registratori Cassa 0524
					switch(contoStr){
						// cassa corrispettivi
						case "00900": // termini
						case "00910": // lascari
						case "00915": // bagheria
						case "00920": // brolo
						case "00929": // palermo gdm
						case "00947": // milazzo
						case "00922": // sciacca (ex enna)
						case "00952": // palermo dante
							cacre = "IZ";
							cacon = StringUtils.substring(tcomm, 0, 10);
							break;
						// pos cassa 1
						case "00930": // termini
						case "00933": // lascari
						case "00935": // bagheria
						case "00937": // brolo
						case "00944": // palermo gdm
						case "00948": // milazzo
						case "00939": // sciacca (ex enna)
						case "00953": // palermo dante
							cacre = StringUtils.substring(tcomm, 62, 64);
							cacon = StringUtils.substring(tcomm, 30, 40);
							break;
						// pos cassa 2
						case "00931": // termini
						case "00934": // lascari
						case "00936": // bagheria
						case "00938": // brolo
						case "00945": // palermo gdm
						case "00949": // milazzo
						case "00951": // sciacca
							cacre = StringUtils.substring(tcomm, 64, 66);
							cacon = StringUtils.substring(tcomm, 40, 50);
							break;
						// pos cassa 3
						case "00932": // termini
						case "00946": // palermo gdm
							cacre = StringUtils.substring(tcomm, 66, 68);
							cacon = StringUtils.substring(tcomm, 50, 60);
							break;
						// pos cassa 4
						// case "00947": // palermo gdm
						// cacre = StringUtils.substring(tcomm, 66, 68);
						// cacon = StringUtils.substring(tcomm, 50, 60);
						// break;
						// buono reso merce 0407449 - mclin=1
						case "00350":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// ER
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 3210000220
							break;
						// gift card e buono interno 0407448 - mclin=Y
						case "00381":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// IH
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 3210000200
							break;
						// bonus tv - mclin=2
						case "00160":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// F1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1620005000
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							break;
						// bonus rottamazione tv
						case "00161":
							cacre = "F1";
							cacon = "1620005001";
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							break;
						// // buono estensione garanzia
						// case "00622":
						// cacre = "NT";
						// cacon = "6705000050";
						// cacoa = StringUtils.substring(tcomm, 20, 27);
						// break;
						// edenred - mclin=5
						case "00163":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// L3
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040010
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							break;
						// mig for you, amilon, epipoli, jakala, tre cuori - mclin=7
						case "00168":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// L5
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040011
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							break;
						// trade in estendo/dg esente iva - mclin=8
						case "00164":
							cacre = StringUtils.substring(tcommMco, 22, 24);	// I1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040009
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							cadmo = StringUtils.left(StringUtils.join("ESENTE", " | ", cadmo), 25);
							break;
						// trade in estendo/dg ivato - mclin=8
						case "00174":
							carig = 1;
							caimp = msvOA_PrimaNota_Righe.getDare();
							cacre = StringUtils.substring(tcommMco, 22, 24);	// I1
							cacon = StringUtils.substring(tcommMco, 0, 10);		// 1605040009
							canup = StringUtils.substring(Integer.toString(cadad), 4, 6);
							canud = canup;
							cadmo = StringUtils.left(StringUtils.join("OLTRE IVA", " | ", cadmo), 25);
							gestisciTradein00174(scdep, cadar, canum + 1, carig, cadad, cadap, canup, canrp, canud, cacre, caimp, cacon, cacoa, cadmo);
							cacon = "";	// continue
							break;
						default:
							break;
					}
				}
				
				if(StringUtils.isBlank(cacon)){
					tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
					msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
					msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
					msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
					continue;
				}
				
				caimp = new BigDecimal(0);
				
				numeroGiro++;
				
				carig = numeroGiro;
				
				caimp = msvOA_PrimaNota_Righe.getDare();
				
				importoTotale = importoTotale.add(caimp);
				
				AsCcmca0fPKey idC = new AsCcmca0fPKey();
				idC.setCadar(cadar);
				idC.setCanum(canum);
				idC.setCarig(carig);
				AsCcmca0f asCcmca0f = new AsCcmca0f();
				asCcmca0f.setId(idC);
				asCcmca0f.setCadad(cadad);
				asCcmca0f.setCadap(cadap);
				asCcmca0f.setCanup(canup);
				asCcmca0f.setCanrp(canrp);
				asCcmca0f.setCanud(canud);
				asCcmca0f.setCacre(cacre);
				asCcmca0f.setCadav(cadav);
				asCcmca0f.setCaimp(caimp);
				asCcmca0f.setCacon(cacon);
				asCcmca0f.setCacoa(cacoa);
				asCcmca0f.setCadmo(cadmo);
				
				AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
				if(asCcmca0fTmp == null){ // nuova quindi insert
					if(!(asCcmca0fDao.salva(asCcmca0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					if(!(asCcmca0fDao.aggiorna(asCcmca0f))){
						chiudi();
					}
					asCcmca0fDao.detach(asCcmca0fTmp);
				}
				asCcmca0fDao.detach(asCcmca0f);
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Righe.getTipoOperazione(), 2));
				msvOA_PrimaNota_Righe.setTipoOperazione(tipoOperazione);
				msvOA_PrimaNota_RigheDao.aggiorna(msvOA_PrimaNota_Righe);
				msvOA_PrimaNota_RigheDao.detach(msvOA_PrimaNota_Righe);
			}
			
			if(inserisciTotale){
				// inserisco pure le chiusure della cassa crisone
				List<Object[]> asMocac0fLs = asNativeQueryDao.getChiusuraCassaSede(cadar);
				
				Object[] asMocac0f = new Object[3];
				Iterator<Object[]> iter_asMocac0fLs = asMocac0fLs.iterator();
				iter_asMocac0fLs = asMocac0fLs.iterator();
				while(iter_asMocac0fLs.hasNext()){
					asMocac0f = iter_asMocac0fLs.next();
					
					cacoa = "";
					
					String codCasssa = asMocac0f[2].toString();
					cadmo = StringUtils.join("CASSA SEDE ", codCasssa);
					
					// corrispettivi
					caimp = (BigDecimal)asMocac0f[0];
					if(caimp == null){
						caimp = new BigDecimal(0);
					}
					if(caimp.compareTo(new BigDecimal(0)) != 0){
						AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("DEC", " 01");
						String tcomm = StringUtils.trim(asTabel0f.getTcomm());
						
						cacre = "IZ";
						cacon = StringUtils.substring(tcomm, 0, 10);
						// cacre = StringUtils.substring(tcomm, 62, 64);
						// cacon = StringUtils.substring(tcomm, 30, 40);
						
						numeroGiro++;
						
						carig = numeroGiro;
						
						importoTotale = importoTotale.add(caimp);
						
						AsCcmca0fPKey idC = new AsCcmca0fPKey();
						idC.setCadar(cadar);
						idC.setCanum(canum);
						idC.setCarig(carig);
						AsCcmca0f asCcmca0f = new AsCcmca0f();
						asCcmca0f.setId(idC);
						asCcmca0f.setCadad(cadad);
						asCcmca0f.setCadap(cadap);
						asCcmca0f.setCanup(canup);
						asCcmca0f.setCanrp(canrp);
						asCcmca0f.setCanud(canud);
						asCcmca0f.setCacre(cacre);
						asCcmca0f.setCadav(cadav);
						asCcmca0f.setCaimp(caimp);
						asCcmca0f.setCacon(cacon);
						asCcmca0f.setCacoa(cacoa);
						asCcmca0f.setCadmo(cadmo);
						
						AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
						if(asCcmca0fTmp == null){ // nuova quindi insert
							if(!(asCcmca0fDao.salva(asCcmca0f))){
								chiudi();
							}
						}else{ // gia' presente, quindi update
							if(!(asCcmca0fDao.aggiorna(asCcmca0f))){
								chiudi();
							}
							asCcmca0fDao.detach(asCcmca0fTmp);
						}
						asCcmca0fDao.detach(asCcmca0f);
					}
					
					// pos
					caimp = (BigDecimal)asMocac0f[1];
					if(caimp == null){
						caimp = new BigDecimal(0);
					}
					if(caimp.compareTo(new BigDecimal(0)) != 0){
						AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("DEC", " 01");
						String tcomm = StringUtils.trim(asTabel0f.getTcomm());
						
						switch(codCasssa){
							// pos cassa 1
							case "101":
								cacre = StringUtils.substring(tcomm, 62, 64);
								cacon = StringUtils.substring(tcomm, 30, 40);
								break;
							// pos cassa 2
							case "102":
								cacre = StringUtils.substring(tcomm, 64, 66);
								cacon = StringUtils.substring(tcomm, 40, 50);
								break;
							default:
								break;
						}
						
						numeroGiro++;
						
						carig = numeroGiro;
						
						cacoa = "";
						
						importoTotale = importoTotale.add(caimp);
						
						AsCcmca0fPKey idC = new AsCcmca0fPKey();
						idC.setCadar(cadar);
						idC.setCanum(canum);
						idC.setCarig(carig);
						AsCcmca0f asCcmca0f = new AsCcmca0f();
						asCcmca0f.setId(idC);
						asCcmca0f.setCadad(cadad);
						asCcmca0f.setCadap(cadap);
						asCcmca0f.setCanup(canup);
						asCcmca0f.setCanrp(canrp);
						asCcmca0f.setCanud(canud);
						asCcmca0f.setCacre(cacre);
						asCcmca0f.setCadav(cadav);
						asCcmca0f.setCaimp(caimp);
						asCcmca0f.setCacon(cacon);
						asCcmca0f.setCacoa(cacoa);
						asCcmca0f.setCadmo(cadmo);
						
						AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
						if(asCcmca0fTmp == null){ // nuova quindi insert
							if(!(asCcmca0fDao.salva(asCcmca0f))){
								chiudi();
							}
						}else{ // gia' presente, quindi update
							if(!(asCcmca0fDao.aggiorna(asCcmca0f))){
								chiudi();
							}
							asCcmca0fDao.detach(asCcmca0fTmp);
						}
						asCcmca0fDao.detach(asCcmca0f);
					}
				}
				
				// dopo aver inserito tutti i D, inserisco in A con la somma dei precedenti
				numeroGiro++;
				
				carig = numeroGiro;
				
				cacre = "IZ";
				
				cadav = "A";
				cacon = "1605000100";
				cacoa = "";
				cadmo = "CASSE TOTALI";
				
				caimp = importoTotale;
				
				AsCcmca0fPKey idC = new AsCcmca0fPKey();
				idC.setCadar(cadar);
				idC.setCanum(canum);
				idC.setCarig(carig);
				AsCcmca0f asCcmca0f = new AsCcmca0f();
				asCcmca0f.setId(idC);
				asCcmca0f.setCadad(cadad);
				asCcmca0f.setCadap(cadap);
				asCcmca0f.setCanup(canup);
				asCcmca0f.setCanrp(canrp);
				asCcmca0f.setCanud(canud);
				asCcmca0f.setCacre(cacre);
				asCcmca0f.setCadav(cadav);
				asCcmca0f.setCaimp(caimp);
				asCcmca0f.setCacon(cacon);
				asCcmca0f.setCacoa(cacoa);
				asCcmca0f.setCadmo(cadmo);
				
				AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
				if(asCcmca0fTmp == null){ // nuova quindi insert
					if(!(asCcmca0fDao.salva(asCcmca0f))){
						chiudi();
					}
				}else{ // gia' presente, quindi update
					if(!(asCcmca0fDao.aggiorna(asCcmca0f))){
						chiudi();
					}
					asCcmca0fDao.detach(asCcmca0fTmp);
				}
				asCcmca0fDao.detach(asCcmca0f);
			}
			
			// elimina dalla tabella scritta da oasi
			// msvOA_PrimaNota_TesDao.elimina(msvOA_PrimaNota_Tes);
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_PrimaNota_Tes.getTipoOperazione(), 2));
			msvOA_PrimaNota_Tes.setTipoOperazione(tipoOperazione);
			msvOA_PrimaNota_TesDao.aggiorna(msvOA_PrimaNota_Tes);
			msvOA_PrimaNota_TesDao.detach(msvOA_PrimaNota_Tes);
		}
		
		asCcmca0fDao.close();
		
		log.info("]" + "elaboraChiusuraCassa");
		
		elaboraCorrispettiviContabilizzazione();
	}

	private void elaboraCorrispettiviContabilizzazione(){
		log.info("[" + "elaboraCorrispettiviContabilizzazione");
		
		Integer codat = 0;
		Integer codep = 0;
		String coiva = "";
		BigDecimal coimp = new BigDecimal(0);
		BigDecimal coimi = new BigDecimal(0);
		String cofla = "";
		
		// solo alcuni movimenti
//		corrispettiviDaElaborareLs = new ArrayList<String>();
//		corrispettiviDaElaborareLs.clear();
//		corrispettiviDaElaborareLs.add("20240528|03|01"); // termini
//		corrispettiviDaElaborareLs.add("20240528|03|02"); // lascari
//		corrispettiviDaElaborareLs.add("20240528|03|03"); // bagheria
//		corrispettiviDaElaborareLs.add("20240528|03|04"); // brolo
//		corrispettiviDaElaborareLs.add("20240528|03|06"); // milazzo
//		corrispettiviDaElaborareLs.add("20240528|03|09"); // palermo gdm
//		corrispettiviDaElaborareLs.add("20240528|03|05"); // sciacca (ex enna)
//		corrispettiviDaElaborareLs.add("20240528|03|07"); // palermo dante
		
		Iterator<String> iter_corrispettiviDaElaborareLs = corrispettiviDaElaborareLs.iterator();
		while(iter_corrispettiviDaElaborareLs.hasNext()){
			String corrispettivoDaElaborare = iter_corrispettiviDaElaborareLs.next();
			
			log.info("Elaboro: " + corrispettivoDaElaborare);
			
			String corrispettivoDaElaborareArr[] = StringUtils.split(corrispettivoDaElaborare, "|");
			
			MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = new MsvOA_PrimaNota_Tes();
			
			codat = Integer.parseInt(corrispettivoDaElaborareArr[0]);
			
			DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date codatDate = null;
			Timestamp codatTimestamp = null;
			try{
				codatDate = formatter.parse(codat.toString());
			}catch(ParseException e){
				log.error("eccezione in conversione data");
				chiudi();
			}
			codatTimestamp = new Timestamp(codatDate.getTime());
			
			msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesDao.getDaDataRegRegIvaSezionale(codatTimestamp, corrispettivoDaElaborareArr[1], corrispettivoDaElaborareArr[2]);
			
			Iterator<MsvOA_PrimaNota_Tes> iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
			iter_msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesLs.iterator();
			while(iter_msvOA_PrimaNota_TesLs.hasNext()){
				msvOA_PrimaNota_Tes = iter_msvOA_PrimaNota_TesLs.next();
				
				log.info("Elaboro: " + msvOA_PrimaNota_Tes);

				// nuovo deposito - definire il nuovo valore
				String sezionaleOasi = StringUtils.leftPad(msvOA_PrimaNota_Tes.getSezionale(), 3, "0");
				switch(sezionaleOasi){
					case "006": // milazzo
						sezionaleOasi = "011";
						break;
					case "007": // palermo dante
						sezionaleOasi = "012";
						break;
					default:
						// gli altri sezionali, coincidono con il numero di deposito
						break;
				}
				codep = Integer.parseInt(transDeposito(sezionaleOasi, "oasi2as"));
		
				MsvOA_PrimaNota_Iva msvOA_PrimaNota_Iva = new MsvOA_PrimaNota_Iva();
				
				msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaDao.getDaNRegNoTipoOperazione(msvOA_PrimaNota_Tes.getnReg());
				
				Iterator<MsvOA_PrimaNota_Iva> iter_msvOA_PrimaNota_IvaLs = msvOA_PrimaNota_IvaLs.iterator();
				while(iter_msvOA_PrimaNota_IvaLs.hasNext()){
					msvOA_PrimaNota_Iva = iter_msvOA_PrimaNota_IvaLs.next();
					
					log.info("Elaboro: " + msvOA_PrimaNota_Iva);
					
					coimp = msvOA_PrimaNota_Iva.getImponibile().multiply(new BigDecimal(msvOA_PrimaNota_Tes.getSegnoDoc()));
					coimi = msvOA_PrimaNota_Iva.getImposta().multiply(new BigDecimal(msvOA_PrimaNota_Tes.getSegnoDoc()));
					
					String codIva = "";
					codIva = StringUtils.trim(msvOA_PrimaNota_Iva.getCodIva());
					if(StringUtils.endsWith(codIva, ".") && !(StringUtils.equals(codIva, "BU."))){
						codIva = StringUtils.removeEnd(codIva, ".");
					}else{
						codIva = transCodiciIva(codIva, "oasi2as");
						if(StringUtils.isBlank(codIva)){
							log.error("Codice: " + msvOA_PrimaNota_Iva.getCodIva() + " non gestito");
							codIva = "22";
						}
					}
					if(StringUtils.equals(codIva, "Y5")){
						codIva = "22";
					}
					coiva = codIva;
					
					AsCorri0fPKey idC = new AsCorri0fPKey();
					idC.setCodat(codat);
					idC.setCodep(codep);
					idC.setCoiva(coiva);
					AsCorri0f asCorri0f = new AsCorri0f();
					asCorri0f.setId(idC);
					asCorri0f.setCoimp(coimp);
					asCorri0f.setCoimi(coimi);
					asCorri0f.setCofla(cofla);
					
					AsCorri0f asCorri0fTmp = asCorri0fDao.getDaId(codat, codep, coiva);
					if(asCorri0fTmp == null){ // nuova quindi insert
						if(!(asCorri0fDao.salva(asCorri0f))){
							chiudi();
						}
					}else{ // gia' presente, quindi update
						BigDecimal coimpVecchio = asCorri0fTmp.getCoimp();
						BigDecimal coimiVecchio = asCorri0fTmp.getCoimi();
						
						asCorri0f.setCoimp(coimpVecchio.add(coimp));
						asCorri0f.setCoimi(coimiVecchio.add(coimi));
						
						if(!(asCorri0fDao.aggiorna(asCorri0f))){
							chiudi();
						}
						asCorri0fDao.detach(asCorri0fTmp);
					}
					asCorri0fDao.detach(asCorri0f);
				}
			}			
		}
		
		asCorri0fDao.close();
		
		log.info("]" + "elaboraCorrispettiviContabilizzazione");
	}
	
	private void elaboraAssistenzeInterne(){
		log.info("[" + "elaboraAssistenzeInterne");
		
		AsMovma0fDao asMovma0fDao = new AsMovma0fDaoMng();
		
		stringBuilder = new StringBuilder();
		
		MsvOA_MovimentiTestate msvOA_MovimentiTestate = new MsvOA_MovimentiTestate();
		
		// prendo i movimenti #INT# che sono gia' stati elaborati (tipoOperazione = '*IN' impostato da oasi2asMovimentiMagazzino)
		msvOA_MovimentiTestateLs = msvOA_MovimentiTestateDao.getAssistenzeInterne();
		
		// solo alcuni movimenti
		// msvOA_MovimentiTestateLs.clear();
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C05318168"));
		// msvOA_MovimentiTestateLs.addAll(msvOA_MovimentiTestateDao.getDaIdUnivocoTes("C05318173"));
		
		String strTimestampAs400 = asNativeQueryDao.getDaSysdummy1_TimestampAs400().toString();
		// e' in formato "yyyy-MM-dd HH:mm:ss.SSSSSS"
		strTimestampAs400 = StringUtils.remove(StringUtils.remove(StringUtils.remove(StringUtils.substringBefore(strTimestampAs400, "."), " "), "-"), ":");
		
		Iterator<MsvOA_MovimentiTestate> iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		iter_msvOA_MovimentiTestateLs = msvOA_MovimentiTestateLs.iterator();
		while(iter_msvOA_MovimentiTestateLs.hasNext()){
			msvOA_MovimentiTestate = iter_msvOA_MovimentiTestateLs.next();
			
			log.info("Elaboro: " + msvOA_MovimentiTestate.getIdUnivocoTes());
			
			String vcaus = "";
			String vidoa = "";
			String vcoda = "";
			String vdesc = "";
			BigDecimal vprez = new BigDecimal(0);
			BigDecimal vcost = new BigDecimal(0);
			String vtimo = "";
			
			String tipoAssistenzaInternaConOSenzaGaranzia = "NonAncoraDeterminato";
			BigDecimal valDiff = new BigDecimal(0);
			
			Object[] asMov = null;
			List<Object[]> asMovLs = new ArrayList<Object[]>();
			
			vidoa = msvOA_MovimentiTestate.getIdUnivocoTes();
			
			MsvOA_MovimentiRighe msvOA_MovimentiRighe = new MsvOA_MovimentiRighe();
			
			msvOA_MovimentiRigheLs = msvOA_MovimentiRigheDao.getDaIdUnivocoTesElaborateGaranzia(vidoa);
			
			Iterator<MsvOA_MovimentiRighe> iter_msvOA_MovimentiRigheLs = msvOA_MovimentiRigheLs.iterator();
			while(iter_msvOA_MovimentiRigheLs.hasNext()){
				msvOA_MovimentiRighe = iter_msvOA_MovimentiRigheLs.next();
				
				log.info("Elaboro: " + msvOA_MovimentiRighe.getId().getIdUnivocoRiga());
				
				vcoda = StringUtils.upperCase(StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloCascino()));
				if(StringUtils.isBlank(vcoda)){
					vcoda = StringUtils.join("OA", StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloOasi()));
				}
				
				// non c'e' bisogno, gia' nella getDaIdUnivocoTesElaborateGaranzia viene esclusa la riga RIPARAZIONE
				// if(StringUtils.equals(vcoda, "OAG0008") && StringUtils.equals(StringUtils.trim(msvOA_MovimentiRighe.getCodArticoloOasi()), "RIPARAZIONE")){
				// continue;
				// }
				
				vprez = msvOA_MovimentiRighe.getPrezzoNetto();
				try{
					vprez = vprez.divide(new BigDecimal(1.22), 4, RoundingMode.HALF_UP);
				}catch(ArithmeticException e){
					log.error("calcolo vprez " + "vprez: " + vprez);
				}
				vprez = Support.arrotonda(vprez, 4);
				// il costo e' gia' non ivato
				vcost = msvOA_MovimentiRighe.getCosto();
				
				vdesc = null;
				if(StringUtils.equals(vcoda, "OAG0004") || StringUtils.equals(vcoda, "OAG0008")){
					log.info("articolo riparazione");
					if(vprez.compareTo(new BigDecimal(0)) == 0){ // se prezzo e' 0 -> Garanzia Interna
						log.info("riparazione in garanzia");
						tipoAssistenzaInternaConOSenzaGaranzia = "Garanzia";
						vcoda = "OAG0004INT";
						vdesc = "RIPARAZIONE INTERNA CASCINO";
						vcost = vprez; // pure a 0
					}else if(vprez.compareTo(new BigDecimal(0)) > 0){ // se prezzo e' definito -> Senza Garanzia, quindi il cliente paga
						log.info("riparazione a pagamento fuori garanzia");
						tipoAssistenzaInternaConOSenzaGaranzia = "SenzaGaranzia";
						vcoda = "OAG0004";
						vdesc = "RIPARAZIONE";
						// ancora qui non posso sapere a quanto deve essere sia il prezzo che il costo, perche' dipende dall'articolo ricambio
					}else{
						log.warn("non e' possibile questo prezzo: " + vprez);
					}
				}else{
					log.info("articolo ricambio");
					if(StringUtils.equals(tipoAssistenzaInternaConOSenzaGaranzia, "Garanzia")){
						vprez = vcost; // il prezzo da 0 viene portato al costo e trasformato in autoconsumo
						vcaus = "S0R";
						vtimo = "A";
					}else if(StringUtils.equals(tipoAssistenzaInternaConOSenzaGaranzia, "SenzaGaranzia")){
						valDiff = valDiff.add(vprez.subtract(vcost));
						vprez = vcost; // il prezzo dal suo valore viene portato al costo
						log.info("valDiff: " + valDiff);
					}else{
						log.warn("non e' possibile: " + tipoAssistenzaInternaConOSenzaGaranzia);
					}
				}
				
				asMov = new Object[6];
				asMov[0] = vcaus;
				asMov[1] = vcoda;
				asMov[2] = vdesc;
				asMov[3] = vprez;
				asMov[4] = vcost;
				asMov[5] = vtimo;
				asMovLs.add(asMov);
				
				// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
				tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiRighe.getTipoOperazione(), 2));
				msvOA_MovimentiRighe.setTipoOperazione(tipoOperazione);
				msvOA_MovimentiRigheDao.aggiorna(msvOA_MovimentiRighe);
				msvOA_MovimentiRigheDao.detach(msvOA_MovimentiRighe);
			}
			
			Boolean primoOAG0008 = true;
			
			AsMovma0f asMovma0f = null;
			List<AsMovma0f> asMovma0fLs = asMovma0fDao.getDaVidoa(vidoa);
			Iterator<AsMovma0f> iter_asMovma0fLs = asMovma0fLs.iterator();
			while(iter_asMovma0fLs.hasNext()){
				asMovma0f = iter_asMovma0fLs.next();
				
				if(StringUtils.equals(StringUtils.trim(asMovma0f.getVcoda()), "OAG0008") && primoOAG0008){
					primoOAG0008 = false;
					continue;
				}
				
				Object[] asMovArr = null;
				Iterator<Object[]> iter_asMovLs = asMovLs.iterator();
				while(iter_asMovLs.hasNext()){
					asMovArr = iter_asMovLs.next();
					
					String vcodaMov = StringUtils.trim(asMovma0f.getVcoda());
					if(StringUtils.equals(vcodaMov, "OAG0008")){
						vcodaMov = "OAG0004";
					}
					String vcodaArr = String.valueOf(asMovArr[1]);
					String vcodaArrOrig = vcodaArr;
					if(StringUtils.equals(vcodaArrOrig, "OAG0004INT")){
						vcodaArrOrig = "OAG0004";
					}
					
					if(StringUtils.equals(vcodaMov, vcodaArrOrig)){
						if(StringUtils.equals(vcodaArr, "OAG0004INT")){
							asMovma0f.setVcoda(vcodaArr);
							asMovma0f.setVdesc(String.valueOf(asMovArr[2]));
						}
						
						BigDecimal vprezArr = (BigDecimal)asMovArr[3];
						BigDecimal vcostArr = (BigDecimal)asMovArr[4];
						
						if(StringUtils.equals(vcodaArr, "OAG0004")){
							asMovma0f.setVcoda(vcodaArr);
							vprezArr = vprezArr.add(valDiff);
							vcostArr = vprezArr;
							asMovma0f.setVdesc(String.valueOf(asMovArr[2]));
						}
						
						asMovma0f.setVprez(vprezArr);
						asMovma0f.setVcost(vcostArr);
						
						String vcausArr = String.valueOf(asMovArr[0]);
						String vtimoArr = String.valueOf(asMovArr[5]);
						if(StringUtils.equals(vtimoArr, "A")){
							asMovma0f.setVtimo(vtimoArr);
						}
						
						// quando l'articolo e' G0008, c'e' in movma il vvfit = 'S' e vvkit = 'K', quindi li sbianco
						asMovma0f.setVvfit("");
						asMovma0f.setVvkit("");
						
						if(!(asMovma0fDao.aggiorna(asMovma0f))){
							chiudi();
						}
						asMovma0fDao.detach(asMovma0f);
						
						if(StringUtils.equals(vtimoArr, "A")){
							asMovma0fDao.aggiornaVcausInAssistenzeGaranzia(vcausArr, vidoa);
						}
					}
				}
			}
			
			// al posto di eliminare metto tipoOperazione = '*XY' (elaborata)
			tipoOperazione = StringUtils.join("*", StringUtils.left(msvOA_MovimentiTestate.getTipoOperazione(), 2));
			msvOA_MovimentiTestate.setTipoOperazione(tipoOperazione);
			msvOA_MovimentiTestateDao.aggiorna(msvOA_MovimentiTestate);
			msvOA_MovimentiTestateDao.detach(msvOA_MovimentiTestate);
		}
		asMovma0fDao.close();
		
		log.info("]" + "elaboraAssistenzeInterne");
	}
	
	
	private void gestisciTradein00174(Integer scdep, Integer cadar, Integer canum, Integer carig, Integer cadad, Integer cadap, String canup, Integer canrp, String canud, String cacre, BigDecimal caimp, String caconDare, String cacoa, String cadmo){
		AsCcmca0fDao asCcmca0fDao = new AsCcmca0fDaoMng();
		
		AsTabel0f asTabel0f = asTabel0fDao.getDaTnotaTcoel("MCO", StringUtils.join(" ", StringUtils.leftPad(scdep.toString(), 2, "0")));
		String tcomm = StringUtils.trim(asTabel0f.getTcomm());

		String caconAvere = StringUtils.substring(tcomm, 0, 10);		// conto merci

		// Avere
		AsCcmca0fPKey idCA = new AsCcmca0fPKey();
		idCA.setCadar(cadar);
		idCA.setCanum(canum);
		idCA.setCarig(carig);
		AsCcmca0f asCcmca0fA = new AsCcmca0f();
		asCcmca0fA.setId(idCA);
		asCcmca0fA.setCadad(cadad);
		asCcmca0fA.setCadap(cadap);
		asCcmca0fA.setCanup(canup);
		asCcmca0fA.setCanrp(canrp);
		asCcmca0fA.setCanud(canud);
		asCcmca0fA.setCacre(cacre);
		asCcmca0fA.setCadav("A");
		asCcmca0fA.setCaimp(caimp);
		asCcmca0fA.setCacon(caconAvere);
		asCcmca0fA.setCacoa(cacoa);
		asCcmca0fA.setCadmo(cadmo);
		
		AsCcmca0f asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
		if(asCcmca0fTmp == null){ // nuova quindi insert
			if(!(asCcmca0fDao.salva(asCcmca0fA))){
				chiudi();
			}
		}else{ // gia' presente, quindi update
			if(!(asCcmca0fDao.aggiorna(asCcmca0fA))){
				chiudi();
			}
			asCcmca0fDao.detach(asCcmca0fTmp);
		}
		asCcmca0fDao.detach(asCcmca0fA);
		
		// Dare
		carig++;
		
		AsCcmca0fPKey idCD = new AsCcmca0fPKey();
		idCD.setCadar(cadar);
		idCD.setCanum(canum);
		idCD.setCarig(carig);
		AsCcmca0f asCcmca0fD = new AsCcmca0f();
		asCcmca0fD.setId(idCD);
		asCcmca0fD.setCadad(cadad);
		asCcmca0fD.setCadap(cadap);
		asCcmca0fD.setCanup(canup);
		asCcmca0fD.setCanrp(canrp);
		asCcmca0fD.setCanud(canud);
		asCcmca0fD.setCacre(cacre);
		asCcmca0fD.setCadav("D");
		asCcmca0fD.setCaimp(caimp);
		asCcmca0fD.setCacon(caconDare);
		asCcmca0fD.setCacoa(cacoa);
		asCcmca0fD.setCadmo(cadmo);
		
		asCcmca0fTmp = asCcmca0fDao.getDaId(cadar, canum, carig);
		if(asCcmca0fTmp == null){ // nuova quindi insert
			if(!(asCcmca0fDao.salva(asCcmca0fD))){
				chiudi();
			}
		}else{ // gia' presente, quindi update
			if(!(asCcmca0fDao.aggiorna(asCcmca0fD))){
				chiudi();
			}
			asCcmca0fDao.detach(asCcmca0fTmp);
		}
		asCcmca0fDao.detach(asCcmca0fD);
	}
	
	
	private void decodificaNoteTestataFinanziarieCampoFZ(String notaFN, String notaFZ, BigDecimal paramFinDecimal[], String paramFinString[]){
		if(StringUtils.isBlank(notaFN) && StringUtils.isBlank(notaFZ)){
			// vuote entrambe le note, se FN o FZ e' definita, non deve uscire e continuare l'elaborazione
			return;
		}
		
		notaFN = notaFN.replaceAll("\\P{Print}", "");	// toglie tutti i caratteri non ascii
		notaFN = StringUtils.upperCase(StringUtils.trim(StringUtils.normalizeSpace(notaFN)));
		notaFN = StringUtils.replace(notaFN, ".", "");
		notaFN = StringUtils.replace(notaFN, ",", ".");
		
		notaFZ = notaFZ.replaceAll("\\P{Print}", "");	// toglie tutti i caratteri non ascii
		notaFZ = StringUtils.upperCase(StringUtils.trim(StringUtils.normalizeSpace(notaFZ)));
		notaFZ = StringUtils.replace(notaFZ, ".", "");
		notaFZ = StringUtils.replace(notaFZ, ",", ".");
		
		notaFZ = StringUtils.replace(notaFZ, "€", "");
		notaFZ = StringUtils.replace(notaFZ, "#", "");

		Pattern patternAlfabetico = Pattern.compile("^[A-Z\\s\\']+$");
		Pattern patternAlfanumerico = Pattern.compile("^[A-Z0-9\\.\\s\\*]*[0-9]{3,}[A-Z0-9\\.\\s\\*]*$");	// Pattern patternAlfanumerico = Pattern.compile("^[A-Z0-9\\.\\s]+[0-9]+$");
		Pattern patternNumerico = Pattern.compile("^[0-9\\.]+$");
		
//		log.info(StringUtils.join("FN: ", notaFN));
//		log.info(patternAlfabetico.matcher(notaFN).matches());
//		log.info(patternAlfanumerico.matcher(notaFN).matches());
//		log.info(StringUtils.join("FZ: ", notaFZ));
//		log.info(patternAlfabetico.matcher(notaFZ).matches());
//		log.info(patternAlfanumerico.matcher(notaFZ).matches());
		
		String notaTmp = "";
		// determino se FN e FZ sono state usate invertite dall'utente per sbaglio
		if((patternAlfabetico.matcher(notaFN).matches() && patternAlfanumerico.matcher(notaFZ).matches()) ||
			(StringUtils.isBlank(notaFN) && patternAlfanumerico.matcher(notaFZ).matches()) ||
			(patternAlfabetico.matcher(notaFN).matches() && StringUtils.isBlank(notaFZ))){
			// non scambio nulla, sembra la casistica ottimale
		}else if((StringUtils.isBlank(notaFN) && patternAlfabetico.matcher(notaFZ).matches()) ||
				(patternAlfanumerico.matcher(notaFN).matches() && StringUtils.isBlank(notaFZ))){
			notaTmp = notaFN;
			notaFN = notaFZ;
			notaFZ = notaTmp;
			log.info("Inversione FN e FZ (con uno tra FN e FZ e' blank)");
		}else if((patternAlfanumerico.matcher(notaFN).matches() && patternAlfabetico.matcher(notaFZ).matches())){
			notaTmp = notaFN;
			notaFN = notaFZ;
			notaFZ = notaTmp;
			log.info("Inversione FN e FZ");			
		}else{
			log.info(StringUtils.join("Inversione non fatta, nella FN e FZ c'e' qualche anomalia. FN e FZ: ", notaFN, ", ", notaFZ));
		}
		
		BigDecimal finImporto = paramFinDecimal[0];
		String finIntestatario = paramFinString[0];
		String finCodPratica = paramFinString[1];
		String finCodTab = paramFinString[2];
		String finNome = paramFinString[3];
		String finNumero = paramFinString[4];
		
		if(!(StringUtils.isBlank(notaFN))){
			finIntestatario = StringUtils.join(notaFN, "|", finIntestatario);
			finIntestatario = StringUtils.left(finIntestatario, 30); // in tabella e' 35, ma il programma usato ne visaulizza 30, quindi considero 30
		}

		notaFZ = StringUtils.replace(notaFZ, "COMPASS", "");
		notaFZ = StringUtils.replace(notaFZ, "AGOS", "");
		notaFZ = StringUtils.replace(notaFZ, "PAGOLIGHT", "PAGO");
		notaFZ = StringUtils.replace(notaFZ, "PAGO LIGHT", "PAGO");
		notaFZ = StringUtils.replace(notaFZ, "PASS", "PASS");
		notaFZ = StringUtils.replace(notaFZ, "FASTLINE", "FAST");
		notaFZ = StringUtils.replace(notaFZ, "FAST LINE", "FAST");
		notaFZ = StringUtils.replace(notaFZ, "RATE", "");
		notaFZ = StringUtils.replace(notaFZ, "MESI", "");
		
		String notaFZarr[] = StringUtils.split(notaFZ, " ");
		String notaFZi = "";

		// importo
		Boolean finImportoTrovato = false;
		BigDecimal fnifiOriginale = finImporto;
		for(int i = 0; i < notaFZarr.length; i++){
			if(!(finImportoTrovato) && StringUtils.isNotBlank(notaFZarr[i])){
				notaFZi = notaFZarr[i];
//				log.info(StringUtils.join("notaFZi: ", notaFZi));
//				log.info(patternNumerico.matcher(notaFZi).matches());
				if(patternNumerico.matcher(notaFZi).matches()){
					try{
						finImporto = new BigDecimal(notaFZi);
					}catch(NumberFormatException e){
						log.warn("Importo: " + notaFZi + " - non convertibile");
						finImporto = new BigDecimal(0);
					}
					
					if((finImporto.compareTo(new BigDecimal(0)) <= 0) || (finImporto.compareTo(new BigDecimal(9999.99)) >= 0)){
						log.info("Mantengo il valore finanziaria a " + fnifiOriginale);
						finImporto = fnifiOriginale;
						finImportoTrovato = false;
					}else{
						finImportoTrovato = true;
						notaFZarr[i] = "";
					}
				}
			}
		}
		if(!(finImportoTrovato)){
			log.warn("Importo non identificato");
		}
		
		// codice pratica
		Boolean finCodPraticaTrovato = false;
		for(int i = 0; i < notaFZarr.length; i++){
			if(!(finCodPraticaTrovato) && StringUtils.isNotBlank(notaFZarr[i])){
				notaFZi = notaFZarr[i];
//				log.info(StringUtils.join("notaFZi: ", notaFZi));
				if(StringUtils.length(notaFZi) > 4){
					finCodPratica = StringUtils.right(notaFZi, 15);
					// se e' compass
					if(StringUtils.equals(finNome, "COM")){
						if(StringUtils.length(finCodPratica) == 6){
							finCodPratica = StringUtils.join("000000", finCodPratica);
						}else if(StringUtils.length(finCodPratica) == 8){
							finCodPratica = StringUtils.join("CO0000", finCodPratica);
						}
						// else lascio com'e'
					}
					// se e' agos
					if(StringUtils.equals(finNome, "AGO")){
						if(StringUtils.length(finCodPratica) == 8){
							finCodPratica = StringUtils.join("0", finCodPratica);
						}
						// else lascio com'e'
					}
					finCodPraticaTrovato = true;
					notaFZarr[i] = "";
				}
			}
		}
		if(!(finCodPraticaTrovato)){
			log.warn("Codice pratica non identificata");
		}
		if(StringUtils.isBlank(finCodPratica)){
			finCodPratica = StringUtils.join("ND", finNumero, "ND");
		}
		
		// codice tabella
		Boolean finCodTabTrovato = false;
		for(int i = 0; i < notaFZarr.length; i++){
			if(!(finCodTabTrovato) && StringUtils.isNotBlank(notaFZarr[i])){
				notaFZi = notaFZarr[i];
//				log.info(StringUtils.join("notaFZi: ", notaFZi));
				if(StringUtils.length(notaFZi) <= 4){
					finCodTab = StringUtils.left(notaFZi, 4);
					finCodTabTrovato = true;
					notaFZarr[i] = "";
				}
			}
		}
		if(!(finCodTabTrovato)){
			log.warn("Codice tabella non identificata");
		}		
		if(StringUtils.isBlank(finCodTab)){
			finCodTab = StringUtils.join("ND", "ND");
		}
		
		paramFinDecimal[0] = finImporto;
		paramFinString[0] = finIntestatario;
		paramFinString[1] = finCodPratica;
		paramFinString[2] = finCodTab;
	}
	
	private void initTranscodifica(){
		initTranscodificaDepositi();
		initTranscodificaUnitaMis();
		initTranscodificaCodiciIva();
		initTranscodificaPagamenti();
		initTranscodificaCausaliMag();
		initTranscodificaFinanziarie();
	}
	
	private void initTranscodificaDepositi(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "depositi.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		depositiCascino = sxLs.toArray(new String[sxLs.size()]);
		depositiOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private void initTranscodificaUnitaMis(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "unitamisura.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		unitaMisCascino = sxLs.toArray(new String[sxLs.size()]);
		unitaMisOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private void initTranscodificaCodiciIva(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "codiciiva.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		codiciIvaCascino = sxLs.toArray(new String[sxLs.size()]);
		codiciIvaOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private void initTranscodificaPagamenti(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "pagamenti.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		pagamentiCascino = sxLs.toArray(new String[sxLs.size()]);
		pagamentiOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private void initTranscodificaCausaliMag(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "causalimagazzino.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		causaliMagCascino = sxLs.toArray(new String[sxLs.size()]);
		causaliMagOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private void initTranscodificaFinanziarie(){
		List<String> sxLs = new ArrayList<String>();
		List<String> dxLs = new ArrayList<String>();
		
		String line = null;
		String linesplit[] = null;
		try{
			String fileNameConfigIni = basePathTransIni + "finanziarie.ini";
			File fileConfigIni = new File(fileNameConfigIni);
			FileReader fstream = new FileReader(fileConfigIni);
			BufferedReader in = new BufferedReader(fstream);
			
			line = in.readLine();
			while(line != null){
				linesplit = StringUtils.split(line, "|");
				sxLs.add(linesplit[0]);
				dxLs.add(linesplit[1]);
				line = in.readLine();
			}
			// Close the input stream
			in.close();
		}catch(IOException ioe){// Catch exception if any
			log.fatal("Error: " + ioe.getMessage());
		}
		finanziarieCascino = sxLs.toArray(new String[sxLs.size()]);
		finanziarieOasi = dxLs.toArray(new String[dxLs.size()]);
	}
	
	private String transDeposito(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < depositiCascino.length; i++){
					if(StringUtils.equals(depositiCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = depositiOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < depositiOasi.length; i++){
					if(StringUtils.equals(depositiOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = depositiCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private String transCodiciIva(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < codiciIvaCascino.length; i++){
					if(StringUtils.equals(codiciIvaCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = codiciIvaOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < codiciIvaOasi.length; i++){
					if(StringUtils.equals(codiciIvaOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = codiciIvaCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private String transPagamenti(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < pagamentiCascino.length; i++){
					if(StringUtils.equals(pagamentiCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = pagamentiOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < pagamentiOasi.length; i++){
					if(StringUtils.equals(pagamentiOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = pagamentiCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private String transUnitaMis(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < unitaMisCascino.length; i++){
					if(StringUtils.equals(unitaMisCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = unitaMisOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < unitaMisOasi.length; i++){
					if(StringUtils.equals(unitaMisOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = unitaMisCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private String transCausaliMag(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < causaliMagCascino.length; i++){
					if(StringUtils.equals(causaliMagCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = causaliMagOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < causaliMagOasi.length; i++){
					if(StringUtils.equals(causaliMagOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = causaliMagCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private String transFinanziarie(String daTrans, String direzione){
		String o = "";
		try{
			int indice = -1;
			if(StringUtils.equals(direzione, "as2oasi")){
				for(int i = 0; i < finanziarieCascino.length; i++){
					if(StringUtils.equals(finanziarieCascino[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = finanziarieOasi[indice];
			}else if(StringUtils.equals(direzione, "oasi2as")){
				for(int i = 0; i < finanziarieOasi.length; i++){
					if(StringUtils.equals(finanziarieOasi[i], daTrans)){
						indice = i;
						break;
					}
				}
				o = finanziarieCascino[indice];
			}else{
				o = null;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("occorrenza non gestita: " + daTrans);
			o = null;
		}
		return o;
	}
	
	private void determinaNumDocumentoDataDepo(String str){
		String strArray[] = str.split(" ");
		String strFor = "";
		for(int i = 0; i < strArray.length; i++){
			strFor = strArray[i];
			if((Integer.compare(strFor.length(), 6) == 0) && (StringUtils.containsOnly(strFor, "0123456789"))){ // fattura
				if(StringUtils.isBlank(primaNotaDocumento)){
					primaNotaDocumento = strFor;
				}
				if(primaNotaNumDepo == 0){
					primaNotaNumDepo = 0;
				}
			}else if((Integer.compare(strFor.length(), 14) == 0)){ // scontrino
				String str1 = StringUtils.substringBetween(strFor, "m", "e");
				if(StringUtils.isNotBlank(str1)){
					if(primaNotaNumDepo == 0){
						primaNotaNumDepo = Integer.parseInt(transDeposito(StringUtils.leftPad(str1, 3, "0"), "oasi2as"));
					}
					str1 = StringUtils.substringBefore(strFor, StringUtils.join("m", str1, "e"));
					if(StringUtils.isBlank(primaNotaDocumento)){
						primaNotaDocumento = StringUtils.right(str1, 6);
					}
				}
			}else if((Integer.compare(strFor.length(), 10) == 0) && (Integer.compare(StringUtils.countMatches(strFor, "/"), 2) == 0)){ // data
				primaNotaData = strFor;
			}else{
				continue;
			}
		}
	}
	
	private void inserisciInASListini(AsAnmag0f asAnmag0f, AsLisri0fDao asLisri0fDao, AsPrzac0fDao asPrzac0fDao, MsvAS_ListiniDao msvAS_ListiniDao){
		// AsLisri0fDao asLisri0fDao = new AsLisri0fDaoMng();
		// AsPrzac0fDao asPrzac0fDao = new AsPrzac0fDaoMng();
		// MsvAS_ListiniDao msvAS_ListiniDao = new MsvAS_ListiniDaoMng();
		
		String tipoListino = "";
		String codArticolo = StringUtils.trim(asAnmag0f.getMcoda());
		BigDecimal prezzoNonIvato = new BigDecimal(0);
		BigDecimal sc = new BigDecimal(0);
		BigDecimal sconto1 = new BigDecimal(0);
		BigDecimal sconto2 = new BigDecimal(0);
		BigDecimal sconto3 = new BigDecimal(0);
		// BigDecimal sconto4 = new BigDecimal(0);
		AsLisri0f asLisri0f = null;
		
		MsvAS_ListiniPKey id = null;
		MsvAS_Listini msvAS_Listini = null;
		MsvAS_Listini msvAS_ListiniTmp = null;
		
		/* prezzo al pubblico (e' ivato) */
		tipoListino = "P";
		asLisri0f = asLisri0fDao.getDaId(codArticolo, 1, tipoListino);
		if(asLisri0f != null){
			BigDecimal aliquotaIva = new BigDecimal(0);
			if(StringUtils.containsOnly(asAnmag0f.getMciva(), "0123456789")){
				aliquotaIva = new BigDecimal(asTabge00fDao.getAliquotaIva(asAnmag0f.getMciva()));
				aliquotaIva = aliquotaIva.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
			}
			
			prezzoNonIvato = new BigDecimal(0);
			try{
				prezzoNonIvato = asLisri0f.getLsprl().divide((new BigDecimal(1)).add(aliquotaIva.divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)), 4, RoundingMode.HALF_UP);
			}catch(ArithmeticException e){
				log.error("calcolo prezzoNonIvato " + "Lisri0f.Lsprl: " + asLisri0f.getLsprl() + ", Mciva: " + asAnmag0f.getMciva());
			}
			prezzoNonIvato = Support.arrotonda(prezzoNonIvato, 4);
			
			if(prezzoNonIvato.compareTo(new BigDecimal(0)) < 0){
				prezzoNonIvato = new BigDecimal(0);
			}
			
			sc = null;
			sconto1 = new BigDecimal(0);
			sconto2 = new BigDecimal(0);
			sconto3 = new BigDecimal(0);
			// sconto4 = new BigDecimal(0);
			sc = asLisri0f.getLssc1();
			if(sc != null){
				sconto1 = sc;
				sconto1 = Support.arrotonda(sconto1, 2);
			}
			sc = asLisri0f.getLssc2();
			if(sc != null){
				sconto2 = sc;
				sconto2 = Support.arrotonda(sconto2, 2);
			}
			sc = asLisri0f.getLssc3();
			if(sc != null){
				sconto3 = sc;
				sconto3 = Support.arrotonda(sconto3, 2);
			}
			// sc = asLisri0f.getLssc4();
			// if(sc != null){
			// sconto4 = sc;
			// Support.arrotonda(sconto4, 2);
			// }
			
			id = new MsvAS_ListiniPKey();
			id.setTipoListino(tipoListino);
			id.setCodArticolo(codArticolo);
			msvAS_Listini = new MsvAS_Listini();
			msvAS_Listini.setId(id);
			msvAS_Listini.setPrezzoNonIvato(prezzoNonIvato);
			msvAS_Listini.setSconto1(sconto1);
			msvAS_Listini.setSconto2(sconto2);
			msvAS_Listini.setSconto3(sconto3);
			// msvAS_Listini.setSconto4(sconto4);
			
			msvAS_ListiniTmp = msvAS_ListiniDao.getDaCodiceTipo(codArticolo, tipoListino);
			if(msvAS_ListiniTmp == null){ // nuova quindi insert
				log.info("salva: " + msvAS_Listini.toString());
				msvAS_ListiniDao.salva(msvAS_Listini);
			}else{ // gia' presente, quindi update
				msvAS_ListiniDao.aggiorna(msvAS_Listini);
				msvAS_ListiniDao.detach(msvAS_ListiniTmp);
			}
			msvAS_ListiniDao.detach(msvAS_Listini);
		}
		
		tipoListino = "I";
		asLisri0f = asLisri0fDao.getDaId(codArticolo, 2, tipoListino);
		if(asLisri0f != null){
			prezzoNonIvato = asLisri0f.getLsprl();
			prezzoNonIvato = Support.arrotonda(prezzoNonIvato, 4);
			if(prezzoNonIvato.compareTo(new BigDecimal(0)) < 0){
				prezzoNonIvato = new BigDecimal(0);
			}
			
			sc = null;
			sconto1 = new BigDecimal(0);
			sconto2 = new BigDecimal(0);
			sconto3 = new BigDecimal(0);
			// sconto4 = new BigDecimal(0);
			sc = asLisri0f.getLssc1();
			if(sc != null){
				sconto1 = sc;
				sconto1 = Support.arrotonda(sconto1, 2);
			}
			sc = asLisri0f.getLssc2();
			if(sc != null){
				sconto2 = sc;
				sconto2 = Support.arrotonda(sconto2, 2);
			}
			sc = asLisri0f.getLssc3();
			if(sc != null){
				sconto3 = sc;
				sconto3 = Support.arrotonda(sconto3, 2);
			}
			// sc = asLisri0f.getLssc4();
			// if(sc != null){
			// sconto4 = sc;
			// Support.arrotonda(sconto4, 2);
			// }
			
			id = new MsvAS_ListiniPKey();
			id.setTipoListino(tipoListino);
			id.setCodArticolo(codArticolo);
			msvAS_Listini = new MsvAS_Listini();
			msvAS_Listini.setId(id);
			msvAS_Listini.setPrezzoNonIvato(prezzoNonIvato);
			msvAS_Listini.setSconto1(sconto1);
			msvAS_Listini.setSconto2(sconto2);
			msvAS_Listini.setSconto3(sconto3);
			// msvAS_Listini.setSconto4(sconto4);
			
			msvAS_ListiniTmp = msvAS_ListiniDao.getDaCodiceTipo(codArticolo, tipoListino);
			if(msvAS_ListiniTmp == null){ // nuova quindi insert
				log.info("salva: " + msvAS_Listini.toString());
				msvAS_ListiniDao.salva(msvAS_Listini);
			}else{ // gia' presente, quindi update
				msvAS_ListiniDao.aggiorna(msvAS_Listini);
				msvAS_ListiniDao.detach(msvAS_ListiniTmp);
			}
			msvAS_ListiniDao.detach(msvAS_Listini);
		}
		
		tipoListino = "R";
		asLisri0f = asLisri0fDao.getDaId(codArticolo, 3, tipoListino);
		if(asLisri0f != null){
			prezzoNonIvato = asLisri0f.getLsprl();
			prezzoNonIvato = Support.arrotonda(prezzoNonIvato, 4);
			if(prezzoNonIvato.compareTo(new BigDecimal(0)) < 0){
				prezzoNonIvato = new BigDecimal(0);
			}
			
			sc = null;
			sconto1 = new BigDecimal(0);
			sconto2 = new BigDecimal(0);
			sconto3 = new BigDecimal(0);
			// sconto4 = new BigDecimal(0);
			sc = asLisri0f.getLssc1();
			if(sc != null){
				sconto1 = sc;
				sconto1 = Support.arrotonda(sconto1, 2);
			}
			sc = asLisri0f.getLssc2();
			if(sc != null){
				sconto2 = sc;
				sconto2 = Support.arrotonda(sconto2, 2);
			}
			sc = asLisri0f.getLssc3();
			if(sc != null){
				sconto3 = sc;
				sconto3 = Support.arrotonda(sconto3, 2);
			}
			// sc = asLisri0f.getLssc4();
			// if(sc != null){
			// sconto4 = sc;
			// Support.arrotonda(sconto4, 2);
			// }
			
			id = new MsvAS_ListiniPKey();
			id.setTipoListino(tipoListino);
			id.setCodArticolo(codArticolo);
			msvAS_Listini = new MsvAS_Listini();
			msvAS_Listini.setId(id);
			msvAS_Listini.setPrezzoNonIvato(prezzoNonIvato);
			msvAS_Listini.setSconto1(sconto1);
			msvAS_Listini.setSconto2(sconto2);
			msvAS_Listini.setSconto3(sconto3);
			// msvAS_Listini.setSconto4(sconto4);
			
			msvAS_ListiniTmp = msvAS_ListiniDao.getDaCodiceTipo(codArticolo, tipoListino);
			if(msvAS_ListiniTmp == null){ // nuova quindi insert
				log.info("salva: " + msvAS_Listini.toString());
				msvAS_ListiniDao.salva(msvAS_Listini);
			}else{ // gia' presente, quindi update
				msvAS_ListiniDao.aggiorna(msvAS_Listini);
				msvAS_ListiniDao.detach(msvAS_ListiniTmp);
			}
			msvAS_ListiniDao.detach(msvAS_Listini);
		}
		
		/* Ultimo Costo */
		tipoListino = "C";
		
		prezzoNonIvato = new BigDecimal(0);
		// if(asMovma0fDao.getUltimoCostoArticolo(codArticolo) != null){
		// prezzoNonIvato = asMovma0fDao.getUltimoCostoArticolo(codArticolo);
		// Support.arrotonda(prezzoNonIvato, 4);
		// }
		AsPrzac0f asPrzac0f = asPrzac0fDao.getDaPzcod(codArticolo);
		if(asPrzac0f != null){
			prezzoNonIvato = asPrzac0f.getPzult();
			prezzoNonIvato = Support.arrotonda(prezzoNonIvato, 4);
		}
		if(prezzoNonIvato.compareTo(new BigDecimal(0)) < 0){
			prezzoNonIvato = new BigDecimal(0);
		}
		
		sconto1 = new BigDecimal(0);
		sconto2 = new BigDecimal(0);
		sconto3 = new BigDecimal(0);
		// sconto4 = new BigDecimal(0);
		
		id = new MsvAS_ListiniPKey();
		id.setTipoListino(tipoListino);
		id.setCodArticolo(codArticolo);
		msvAS_Listini = new MsvAS_Listini();
		msvAS_Listini.setId(id);
		msvAS_Listini.setPrezzoNonIvato(prezzoNonIvato);
		msvAS_Listini.setSconto1(sconto1);
		msvAS_Listini.setSconto2(sconto2);
		msvAS_Listini.setSconto3(sconto3);
		
		msvAS_ListiniTmp = msvAS_ListiniDao.getDaCodiceTipo(codArticolo, tipoListino);
		if(msvAS_ListiniTmp == null){ // nuova quindi insert
			log.info("salva: " + msvAS_Listini.toString());
			msvAS_ListiniDao.salva(msvAS_Listini);
		}else{ // gia' presente, quindi update
			msvAS_ListiniDao.aggiorna(msvAS_Listini);
			msvAS_ListiniDao.detach(msvAS_ListiniTmp);
		}
		msvAS_ListiniDao.detach(msvAS_Listini);
		
		// asLisri0fDao.close();
		// asPrzac0fDao.close();
		// msvAS_ListiniDao.close();
	}
	
	@SuppressWarnings(
		"unused"
	)
	private void testCodice(){
//		corrispettiviDaElaborareLs = new ArrayList<String>();
//		
//		MsvOA_PrimaNota_Tes msvOA_PrimaNota_Tes = new MsvOA_PrimaNota_Tes();
//		
//		// nuovo deposito - definire il nuovo valore
//		// Causali Contabili 1096
//		// CRL1 - Corrispettivi Contanti P.V. 1 - Termini
//		// CRCF - Corrispettivi Contanti P.V. 2 - Lascari
//		// CRL2 - Corrispettivi Contanti P.V. 3 - Bagheria
//		// CRL4 - Corrispettivi Contanti P.V.4 - Brolo
//		// CRL9 - Corrispettivi Contanti P.V.9 - Palermo GDM
//		// CRL6 - Corrispettivi Contanti P.V. 011 - Milazzo
//		// CRL5 - Corrispettivi Contanti P.V.5 - Sciacca (ex Enna)
//		msvOA_PrimaNota_TesLs = msvOA_PrimaNota_TesDao.getDaCausali("'CRL1', 'CRCF', 'CRL2', 'CRL4', 'CRL9', 'CRL6', 'CRL5'");
//		// solo alcuni movimenti
//		msvOA_PrimaNota_TesLs.clear();
//		// SELECT * FROM OA_PrimaNota_Tes o WHERE datareg = '2024-02-20' and regiva = '03' and tipoconto = 'G'
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319537"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319538"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319539"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319540"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319541"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319542"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319543"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319544"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319545"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319546"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319547"));
//		msvOA_PrimaNota_TesLs.add(msvOA_PrimaNota_TesDao.getDaNReg("00319548"));
//		
//		MsvOA_PrimaNota_Tes arrayMsvOA_PrimaNota_Tes[] = msvOA_PrimaNota_TesLs.toArray(new MsvOA_PrimaNota_Tes[msvOA_PrimaNota_TesLs.size()]);
//		
//		for(int i = 0; i < arrayMsvOA_PrimaNota_Tes.length; i++){
//			msvOA_PrimaNota_Tes = arrayMsvOA_PrimaNota_Tes[i];
//			
//			String cadarTxt = new SimpleDateFormat("yyyyMMdd").format(msvOA_PrimaNota_Tes.getDataReg());
//			
//			String corrispettivoDaElaborare = StringUtils.join(cadarTxt, "|", msvOA_PrimaNota_Tes.getRegIva(), "|", msvOA_PrimaNota_Tes.getSezionale());
//			if(!(corrispettiviDaElaborareLs.contains(corrispettivoDaElaborare))){
//				corrispettiviDaElaborareLs.add(corrispettivoDaElaborare);				
//			}
//		}
//		
//		elaboraCorrispettiviContabilizzazione();
		
/*		String notaFN = null;
		String notaFZ = null;

		String fnnoc = "test nome";
		BigDecimal fnifi = new BigDecimal(123);
		String fnnup = "";
		String fntab = "";
		String fnta2 = "";
		
		String paramFinString[] = new String[5];
		BigDecimal paramFinDecimal[] = new BigDecimal[1];

		notaFN = "SCANDURRA SALVATORE ";
		notaFZ = "561,00 072863534 *U2";
		paramFinDecimal[0] = new BigDecimal(3);
		paramFinString[0] = "test nome III";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		
		notaFN = "MODO CORRETTO ";
		notaFZ = "♪444,90 0000010075435973    ♫☻   VCB   ";
		paramFinDecimal[0] = new BigDecimal(4);
		paramFinString[0] = "test nome IV";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "SCAMBIO CODICE E TABELLA ";
		notaFZ = "555,90 VCB 0000010075435973          ";
		paramFinDecimal[0] = new BigDecimal(5);
		paramFinString[0] = "test nome V";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "PRIMA TABELLA ";
		notaFZ = "VCB 666,90 0000010075435973          ";
		paramFinDecimal[0] = new BigDecimal(6);
		paramFinString[0] = "test nome VI";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "IMPORTO SENZA DECIMALI";
		notaFZ = "VCB 777 0000010075435973          ";
		paramFinDecimal[0] = new BigDecimal(7);
		paramFinString[0] = "test nome VII";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "IMP SENZA DEC ALLA FINE ";
		notaFZ = "VCB  0000010075435973         888 ";
		paramFinDecimal[0] = new BigDecimal(8);
		paramFinString[0] = "test nome VIII";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");

		notaFN = "SENZA IMPORTO ";
		notaFZ = "VCB  0000010075435973          ";
		paramFinDecimal[0] = new BigDecimal(9);
		paramFinString[0] = "test nome IX";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "TABELLA mezzo";
		notaFZ = "  0000010075435973    *U2     123 ";
		paramFinDecimal[0] = new BigDecimal(11);
		paramFinString[0] = "test nome X";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "TABELLA INIZIO";
		notaFZ = "*U2  0000010075435973         125 ";
		paramFinDecimal[0] = new BigDecimal(10);
		paramFinString[0] = "test nome X";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "TABELLA SENZA";
		notaFZ = "0000010075435973         128 ";
		paramFinDecimal[0] = new BigDecimal(10);
		paramFinString[0] = "test nome X";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		notaFN = "SOLO IMPORTO";
		notaFZ = "         155 ";
		paramFinDecimal[0] = new BigDecimal(10);
		paramFinString[0] = "test nome X";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		
		
		notaFN = "SOLO TABELLA";
		notaFZ = "         12356789 ";
		paramFinDecimal[0] = new BigDecimal(10);
		paramFinString[0] = "test nome X";
		paramFinString[1] = "";
		paramFinString[2] = "";
		paramFinString[3] = "COM";
		paramFinString[4] = "321";
		decodificaNoteTestataFinanziarieCampoFZ(notaFN, notaFZ, paramFinDecimal, paramFinString);
		fnifi = paramFinDecimal[0];
		fnnoc = paramFinString[0];
		fnnup = paramFinString[1];
		fntab = paramFinString[2];
		fnta2 = fntab;
		log.info("");
		*/
	}
}
