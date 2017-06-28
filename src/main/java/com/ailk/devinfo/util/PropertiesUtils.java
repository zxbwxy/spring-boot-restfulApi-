
package com.ailk.devinfo.util;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * properties工具类
 * 
 * @author zhuxb3(74637) Tel:187..
 * @version 1.0
 * @since 2016-9-6
 * @category com.ai.ngis.sysinf.bus.util<br>
 * @copyright 南京联创科技 网管科技部
 */
public class PropertiesUtils
{

	private static final String os = System.getProperties().getProperty("os.name");
	private static final String fileDir = (os.startsWith("win") || os.startsWith("Win"))
			? PropertiesUtils.class.getResource("/").toString().replace("file:/", "")
			: "/" + PropertiesUtils.class.getResource("/").toString().replace("file:/",
					"");
	private static final Logger LOG = Logger.getLogger(PropertiesUtils.class);
	/**
	 * 资源文件
	 */
	private static Map<String, Properties> PROPERTIES_CONTAINER = new HashMap<String, Properties>();
	/**
	 * 返回包含所有keMap
	 */
	private static Map<String, String> retMap = null;
	/**
	 * 返回包含所有key List
	 */
	private static List<String> retList = null;

	/**
	 * 解码
	 * 
	 * @param src
	 *            待解码的字符
	 * @param charset
	 *            字符集
	 * @return 解码后的字符
	 */
	static public String deCodecString(String src, String charset)
	{
		if (src == null)
		{
			return null;
		}
		try
		{
			return new String(src.getBytes(charset));
		}
		catch (Exception e)
		{
			return src;
		}
	}

	/**
	 * 编码
	 * 
	 * @param src
	 *            待转码的字符
	 * @param charset
	 *            字符集
	 * @return 转码后的字符
	 */
	static public String enCodecString(String src, String charset)
	{
		if (src == null)
		{
			return null;
		}
		try
		{
			return new String(src.getBytes(), charset);
		}
		catch (Exception e)
		{
			return src;
		}
	}

	/**
	 * 在给定的文件中根据键获取对应的属性值
	 * 
	 * @param file
	 *            需要解析的文件
	 * @param keyName
	 *            属性键
	 * @return 对应的属性value
	 */
	public static String getValue(String file, String keyName)
	{
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		return PROPERTIES_CONTAINER.get(file).getProperty(keyName);
	}

	/**
	 * 在给定的文件中根据键获取对应的属性值
	 * 
	 * @param file
	 *            需要解析的文件
	 * @param keyName
	 *            属性键
	 * @param charset
	 *            编码
	 * @return 对应的属性value
	 */
	public static String getValue(String file, String keyName, String charset)
	{
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		return enCodecString(PROPERTIES_CONTAINER.get(file).getProperty(keyName),
				charset);
	}

	/**
	 * 在给定的文件中根据键获取对应的属性值
	 * 
	 * @param file
	 *            文件路径+名称
	 * @param key
	 *            配置文件中的key值
	 * @param defaultValue
	 *            默认值
	 * @return 对应的属性value
	 */
	public static String getValueWithDefalt(String file, String key, String defaultValue)
	{
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		Properties pro = PROPERTIES_CONTAINER.get(file);
		return pro.getProperty(key, defaultValue);
	}

	/**
	 * 在给定的文件中根据键获取对应的属性值
	 * 
	 * @param file
	 *            文件路径+名称
	 * @param key
	 *            配置文件中的key值
	 * @param defaultValue
	 *            默认值
	 * @param charset
	 *            编码
	 * @return 对应的属性value
	 */
	public static String getValueWithDefalt(String file, String key, String defaultValue,
			String charset)
	{
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		Properties pro = PROPERTIES_CONTAINER.get(file);
		return enCodecString(pro.getProperty(key, defaultValue), charset);
	}

	/**
	 * 加载文件
	 * 
	 * @param file
	 *            文件：路径+文件名称
	 */
	public static synchronized Properties loadProperties(String file)
	{
		Properties pro = new Properties();
		InputStreamReader inputStream = null;
		try
		{
			inputStream = new InputStreamReader(
					new FileInputStream(new File(fileDir + file)), "UTF-8");
			pro.load(inputStream);
			inputStream.close();
		}
		catch (IOException e)
		{
			LOG.error("Failed to loadProperties,classpath is " + e);
		}
		PROPERTIES_CONTAINER.put(file, pro);
		return pro;
	}

	/**
	 * 加载文件，不需要重启
	 * 
	 * @param file
	 *            文件：路径+文件名称
	 * @return
	 */
	public static synchronized Properties reloadProperties(String file)
	{
		Properties pro = new Properties();
		InputStreamReader inputStream = null;
		try
		{
			inputStream = new InputStreamReader(
					new FileInputStream(new File(fileDir + file)), "UTF-8");
			pro.load(inputStream);
			inputStream.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		PROPERTIES_CONTAINER.put(file, pro);
		return pro;
	}

	/**
	 * 返回所有的key-value Map
	 * 
	 * @param file
	 * @return
	 */
	public static synchronized Map<String, String> getPropertiesMap(String file)
	{
		retMap = new HashMap<String, String>();
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		Properties pro = PROPERTIES_CONTAINER.get(file);
		for (String key : pro.stringPropertyNames())
		{
			retMap.put(key, pro.getProperty(key));
		}
		return retMap;
	}

	/**
	 * 返回所有的key-value Map
	 * 
	 * @param file
	 * @return
	 */
	public static synchronized List<String> getAllkeyList(String file)
	{
		retList = new ArrayList<String>();
		if (PROPERTIES_CONTAINER.get(file) == null)
		{
			loadProperties(file);
		}
		Properties pro = PROPERTIES_CONTAINER.get(file);
		for (String key : pro.stringPropertyNames())
		{
			retList.add(key);
		}
		return retList;
	}
	

	/**
	 * 
	 * 
	 * @param file
	 * @return
	 */
	public static synchronized String[] getArrBySplit(String file,String key,String split)
	{
		String arrayStr=getValue(file, key);
		return arrayStr.split(split);
	}

	/**
	 *
	 *
	 * @param file
	 * @return
	 */
	public static synchronized List<String> getListBySplit(String file,String key,String split)
	{
		String arrayStr=getValue(file, key);
		return Arrays.asList(arrayStr.split(split));
	}
}
