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

package tj.rezultat.rassmotrenija.pretenzii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.rezultat.rassmotrenija.pretenzii.exception.NoSuchrezultat_rassmotrenija_pretenziiException;
import tj.rezultat.rassmotrenija.pretenzii.model.rezultat_rassmotrenija_pretenzii;

/**
 * The persistence interface for the rezultat_rassmotrenija_pretenzii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.rezultat.rassmotrenija.pretenzii.service.persistence.impl.rezultat_rassmotrenija_pretenziiPersistenceImpl
 * @see rezultat_rassmotrenija_pretenziiUtil
 * @generated
 */
@ProviderType
public interface rezultat_rassmotrenija_pretenziiPersistence
	extends BasePersistence<rezultat_rassmotrenija_pretenzii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link rezultat_rassmotrenija_pretenziiUtil} to access the rezultat_rassmotrenija_pretenzii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rezultat_rassmotrenija_pretenzii in the entity cache if it is enabled.
	*
	* @param rezultat_rassmotrenija_pretenzii the rezultat_rassmotrenija_pretenzii
	*/
	public void cacheResult(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii);

	/**
	* Caches the rezultat_rassmotrenija_pretenziis in the entity cache if it is enabled.
	*
	* @param rezultat_rassmotrenija_pretenziis the rezultat_rassmotrenija_pretenziis
	*/
	public void cacheResult(
		java.util.List<rezultat_rassmotrenija_pretenzii> rezultat_rassmotrenija_pretenziis);

	/**
	* Creates a new rezultat_rassmotrenija_pretenzii with the primary key. Does not add the rezultat_rassmotrenija_pretenzii to the database.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key for the new rezultat_rassmotrenija_pretenzii
	* @return the new rezultat_rassmotrenija_pretenzii
	*/
	public rezultat_rassmotrenija_pretenzii create(
		long rezultat_rassmotrenija_pretenzii_id);

	/**
	* Removes the rezultat_rassmotrenija_pretenzii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii that was removed
	* @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	*/
	public rezultat_rassmotrenija_pretenzii remove(
		long rezultat_rassmotrenija_pretenzii_id)
		throws NoSuchrezultat_rassmotrenija_pretenziiException;

	public rezultat_rassmotrenija_pretenzii updateImpl(
		rezultat_rassmotrenija_pretenzii rezultat_rassmotrenija_pretenzii);

	/**
	* Returns the rezultat_rassmotrenija_pretenzii with the primary key or throws a {@link NoSuchrezultat_rassmotrenija_pretenziiException} if it could not be found.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii
	* @throws NoSuchrezultat_rassmotrenija_pretenziiException if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	*/
	public rezultat_rassmotrenija_pretenzii findByPrimaryKey(
		long rezultat_rassmotrenija_pretenzii_id)
		throws NoSuchrezultat_rassmotrenija_pretenziiException;

	/**
	* Returns the rezultat_rassmotrenija_pretenzii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rezultat_rassmotrenija_pretenzii_id the primary key of the rezultat_rassmotrenija_pretenzii
	* @return the rezultat_rassmotrenija_pretenzii, or <code>null</code> if a rezultat_rassmotrenija_pretenzii with the primary key could not be found
	*/
	public rezultat_rassmotrenija_pretenzii fetchByPrimaryKey(
		long rezultat_rassmotrenija_pretenzii_id);

	@Override
	public java.util.Map<java.io.Serializable, rezultat_rassmotrenija_pretenzii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the rezultat_rassmotrenija_pretenziis.
	*
	* @return the rezultat_rassmotrenija_pretenziis
	*/
	public java.util.List<rezultat_rassmotrenija_pretenzii> findAll();

	/**
	* Returns a range of all the rezultat_rassmotrenija_pretenziis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	* @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	* @return the range of rezultat_rassmotrenija_pretenziis
	*/
	public java.util.List<rezultat_rassmotrenija_pretenzii> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the rezultat_rassmotrenija_pretenziis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	* @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rezultat_rassmotrenija_pretenziis
	*/
	public java.util.List<rezultat_rassmotrenija_pretenzii> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<rezultat_rassmotrenija_pretenzii> orderByComparator);

	/**
	* Returns an ordered range of all the rezultat_rassmotrenija_pretenziis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rezultat_rassmotrenija_pretenziiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rezultat_rassmotrenija_pretenziis
	* @param end the upper bound of the range of rezultat_rassmotrenija_pretenziis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rezultat_rassmotrenija_pretenziis
	*/
	public java.util.List<rezultat_rassmotrenija_pretenzii> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<rezultat_rassmotrenija_pretenzii> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the rezultat_rassmotrenija_pretenziis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of rezultat_rassmotrenija_pretenziis.
	*
	* @return the number of rezultat_rassmotrenija_pretenziis
	*/
	public int countAll();
}