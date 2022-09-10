<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.ang.storemanageservice.dao.StoreGoodsTypeDao">

	<resultMap id="StoreGoodsType" type="com.ang.storemanageservice.entity.StoreGoodsType">
		<result property="goodsTypeId" column="goods_type_id"/>
		<result property="goodsTypeName" column="goods_type_name"/>
	</resultMap>


	<insert id="insertStoreGoodsType" parameterType="com.ang.storemanageservice.entity.StoreGoodsType" useGeneratedKeys="true">
		INSERT INTO store_goods_type (
		<trim prefixOverrides=",">
			<if test="goodsTypeId != null"> ,goods_type_id </if>
			<if test="goodsTypeName != null"> ,goods_type_name </if>
		</trim>
		) VALUES (
		<trim prefixOverrides=",">
			<if test="goodsTypeId != null"> ,#{goodsTypeId} </if>
			<if test="goodsTypeName != null"> ,#{goodsTypeName} </if>
		</trim>
		)
	</insert>

	<update id="updateStoreGoodsTypeById" parameterType="com.ang.storemanageservice.entity.StoreGoodsType">
		UPDATE store_goods_type
		<set>
			<if test="goodsTypeName != null"> goods_type_name = #{goodsTypeName}, </if>
		</set>
		WHERE goods_type_id = #{goodsTypeId}
	</update>

	<select id="getStoreGoodsType" parameterType="java.util.Map" resultMap="StoreGoodsType">
		SELECT
			goods_type_id,
			goods_type_name
		FROM store_goods_type
		WHERE goods_type_id = #{goodsTypeId}
	</select>

	<select id="listStoreGoodsType" parameterType="java.util.Map" resultMap="StoreGoodsType">
		SELECT
		goods_type_id,
		goods_type_name
		FROM store_goods_type
		<where>
			<if test="goodsTypeId != null"> AND goods_type_id = #{goodsTypeId} </if>
			<if test="goodsTypeName != null"> AND goods_type_name = #{goodsTypeName} </if>
		</where>
	</select>
</mapper>
