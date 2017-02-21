/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.protokol.dlja.zakljuchenija.kontrakta.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import tj.protokol.dlja.zakljuchenija.kontrakta.model.protokol_dlja_zakljuchenija_kontrakta;

import java.util.List;

/**
 * The persistence utility for the protokol_dlja_zakljuchenija_kontrakta service. This utility wraps {@link tj.protokol.dlja.zakljuchenija.kontrakta.service.persistence.impl.protokol_dlja_zakljuchenija_kontraktaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see protokol_dlja_zakljuchenija_kontraktaPersistence
 * @see tj.protokol.dlja.zakljuchenija.kontrakta.service.persistence.impl.protokol_dlja_zakljuchenija_kontraktaPersistenceImpl
 * @generated
 */
@ProviderType
public class protokol_dlja_zakljuchenija_kontraktaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		getPersistence().clearCache(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<protokol_dlja_zakljuchenija_kontrakta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<protokol_dlja_zakljuchenija_kontrakta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<protokol_dlja_zakljuchenija_kontrakta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<protokol_dlja_zakljuchenija_kontrakta> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static protokol_dlja_zakljuchenija_kontrakta update(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return getPersistence().update(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static protokol_dlja_zakljuchenija_kontrakta update(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(protokol_dlja_zakljuchenija_kontrakta, serviceContext);
	}

	/**
	* Caches the protokol_dlja_zakljuchenija_kontrakta in the entity cache if it is enabled.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta the protokol_dlja_zakljuchenija_kontrakta
	*/
	public static void cacheResult(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		getPersistence().cacheResult(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	* Caches the protokol_dlja_zakljuchenija_kontraktas in the entity cache if it is enabled.
	*
	* @param protokol_dlja_zakljuchenija_kontraktas the protokol_dlja_zakljuchenija_kontraktas
	*/
	public static void cacheResult(
		List<protokol_dlja_zakljuchenija_kontrakta> protokol_dlja_zakljuchenija_kontraktas) {
		getPersistence().cacheResult(protokol_dlja_zakljuchenija_kontraktas);
	}

	/**
	* Creates a new protokol_dlja_zakljuchenija_kontrakta with the primary key. Does not add the protokol_dlja_zakljuchenija_kontrakta to the database.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key for the new protokol_dlja_zakljuchenija_kontrakta
	* @return the new protokol_dlja_zakljuchenija_kontrakta
	*/
	public static protokol_dlja_zakljuchenija_kontrakta create(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return getPersistence().create(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Removes the protokol_dlja_zakljuchenija_kontrakta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta that was removed
	* @throws NoSuchprotokol_dlja_zakljuchenija_kontraktaException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	public static protokol_dlja_zakljuchenija_kontrakta remove(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws tj.protokol.dlja.zakljuchenija.kontrakta.exception.NoSuchprotokol_dlja_zakljuchenija_kontraktaException {
		return getPersistence().remove(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	public static protokol_dlja_zakljuchenija_kontrakta updateImpl(
		protokol_dlja_zakljuchenija_kontrakta protokol_dlja_zakljuchenija_kontrakta) {
		return getPersistence().updateImpl(protokol_dlja_zakljuchenija_kontrakta);
	}

	/**
	* Returns the protokol_dlja_zakljuchenija_kontrakta with the primary key or throws a {@link NoSuchprotokol_dlja_zakljuchenija_kontraktaException} if it could not be found.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta
	* @throws NoSuchprotokol_dlja_zakljuchenija_kontraktaException if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	public static protokol_dlja_zakljuchenija_kontrakta findByPrimaryKey(
		long protokol_dlja_zakljuchenija_kontrakta_id)
		throws tj.protokol.dlja.zakljuchenija.kontrakta.exception.NoSuchprotokol_dlja_zakljuchenija_kontraktaException {
		return getPersistence()
				   .findByPrimaryKey(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	/**
	* Returns the protokol_dlja_zakljuchenija_kontrakta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protokol_dlja_zakljuchenija_kontrakta_id the primary key of the protokol_dlja_zakljuchenija_kontrakta
	* @return the protokol_dlja_zakljuchenija_kontrakta, or <code>null</code> if a protokol_dlja_zakljuchenija_kontrakta with the primary key could not be found
	*/
	public static protokol_dlja_zakljuchenija_kontrakta fetchByPrimaryKey(
		long protokol_dlja_zakljuchenija_kontrakta_id) {
		return getPersistence()
				   .fetchByPrimaryKey(protokol_dlja_zakljuchenija_kontrakta_id);
	}

	public static java.util.Map<java.io.Serializable, protokol_dlja_zakljuchenija_kontrakta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* @return the protokol_dlja_zakljuchenija_kontraktas
	*/
	public static List<protokol_dlja_zakljuchenija_kontrakta> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_dlja_zakljuchenija_kontraktas
	* @param end the upper bound of the range of protokol_dlja_zakljuchenija_kontraktas (not inclusive)
	* @return the range of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static List<protokol_dlja_zakljuchenija_kontrakta> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_dlja_zakljuchenija_kontraktas
	* @param end the upper bound of the range of protokol_dlja_zakljuchenija_kontraktas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static List<protokol_dlja_zakljuchenija_kontrakta> findAll(
		int start, int end,
		OrderByComparator<protokol_dlja_zakljuchenija_kontrakta> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the protokol_dlja_zakljuchenija_kontraktas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_dlja_zakljuchenija_kontraktaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_dlja_zakljuchenija_kontraktas
	* @param end the upper bound of the range of protokol_dlja_zakljuchenija_kontraktas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static List<protokol_dlja_zakljuchenija_kontrakta> findAll(
		int start, int end,
		OrderByComparator<protokol_dlja_zakljuchenija_kontrakta> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the protokol_dlja_zakljuchenija_kontraktas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of protokol_dlja_zakljuchenija_kontraktas.
	*
	* @return the number of protokol_dlja_zakljuchenija_kontraktas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static protokol_dlja_zakljuchenija_kontraktaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<protokol_dlja_zakljuchenija_kontraktaPersistence, protokol_dlja_zakljuchenija_kontraktaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(protokol_dlja_zakljuchenija_kontraktaPersistence.class);
}