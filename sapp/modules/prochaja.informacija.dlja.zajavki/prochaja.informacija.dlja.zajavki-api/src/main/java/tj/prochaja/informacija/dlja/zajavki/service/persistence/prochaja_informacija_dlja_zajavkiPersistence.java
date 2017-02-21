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

package tj.prochaja.informacija.dlja.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.prochaja.informacija.dlja.zajavki.exception.NoSuchprochaja_informacija_dlja_zajavkiException;
import tj.prochaja.informacija.dlja.zajavki.model.prochaja_informacija_dlja_zajavki;

/**
 * The persistence interface for the prochaja_informacija_dlja_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.prochaja.informacija.dlja.zajavki.service.persistence.impl.prochaja_informacija_dlja_zajavkiPersistenceImpl
 * @see prochaja_informacija_dlja_zajavkiUtil
 * @generated
 */
@ProviderType
public interface prochaja_informacija_dlja_zajavkiPersistence
	extends BasePersistence<prochaja_informacija_dlja_zajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link prochaja_informacija_dlja_zajavkiUtil} to access the prochaja_informacija_dlja_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the prochaja_informacija_dlja_zajavki in the entity cache if it is enabled.
	*
	* @param prochaja_informacija_dlja_zajavki the prochaja_informacija_dlja_zajavki
	*/
	public void cacheResult(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki);

	/**
	* Caches the prochaja_informacija_dlja_zajavkis in the entity cache if it is enabled.
	*
	* @param prochaja_informacija_dlja_zajavkis the prochaja_informacija_dlja_zajavkis
	*/
	public void cacheResult(
		java.util.List<prochaja_informacija_dlja_zajavki> prochaja_informacija_dlja_zajavkis);

	/**
	* Creates a new prochaja_informacija_dlja_zajavki with the primary key. Does not add the prochaja_informacija_dlja_zajavki to the database.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key for the new prochaja_informacija_dlja_zajavki
	* @return the new prochaja_informacija_dlja_zajavki
	*/
	public prochaja_informacija_dlja_zajavki create(
		long prochaja_informacija_dlja_zajavki_id);

	/**
	* Removes the prochaja_informacija_dlja_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	* @return the prochaja_informacija_dlja_zajavki that was removed
	* @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	*/
	public prochaja_informacija_dlja_zajavki remove(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchprochaja_informacija_dlja_zajavkiException;

	public prochaja_informacija_dlja_zajavki updateImpl(
		prochaja_informacija_dlja_zajavki prochaja_informacija_dlja_zajavki);

	/**
	* Returns the prochaja_informacija_dlja_zajavki with the primary key or throws a {@link NoSuchprochaja_informacija_dlja_zajavkiException} if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	* @return the prochaja_informacija_dlja_zajavki
	* @throws NoSuchprochaja_informacija_dlja_zajavkiException if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	*/
	public prochaja_informacija_dlja_zajavki findByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id)
		throws NoSuchprochaja_informacija_dlja_zajavkiException;

	/**
	* Returns the prochaja_informacija_dlja_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prochaja_informacija_dlja_zajavki_id the primary key of the prochaja_informacija_dlja_zajavki
	* @return the prochaja_informacija_dlja_zajavki, or <code>null</code> if a prochaja_informacija_dlja_zajavki with the primary key could not be found
	*/
	public prochaja_informacija_dlja_zajavki fetchByPrimaryKey(
		long prochaja_informacija_dlja_zajavki_id);

	@Override
	public java.util.Map<java.io.Serializable, prochaja_informacija_dlja_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the prochaja_informacija_dlja_zajavkis.
	*
	* @return the prochaja_informacija_dlja_zajavkis
	*/
	public java.util.List<prochaja_informacija_dlja_zajavki> findAll();

	/**
	* Returns a range of all the prochaja_informacija_dlja_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	* @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	* @return the range of prochaja_informacija_dlja_zajavkis
	*/
	public java.util.List<prochaja_informacija_dlja_zajavki> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the prochaja_informacija_dlja_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	* @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prochaja_informacija_dlja_zajavkis
	*/
	public java.util.List<prochaja_informacija_dlja_zajavki> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prochaja_informacija_dlja_zajavki> orderByComparator);

	/**
	* Returns an ordered range of all the prochaja_informacija_dlja_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prochaja_informacija_dlja_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prochaja_informacija_dlja_zajavkis
	* @param end the upper bound of the range of prochaja_informacija_dlja_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of prochaja_informacija_dlja_zajavkis
	*/
	public java.util.List<prochaja_informacija_dlja_zajavki> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prochaja_informacija_dlja_zajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the prochaja_informacija_dlja_zajavkis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of prochaja_informacija_dlja_zajavkis.
	*
	* @return the number of prochaja_informacija_dlja_zajavkis
	*/
	public int countAll();
}