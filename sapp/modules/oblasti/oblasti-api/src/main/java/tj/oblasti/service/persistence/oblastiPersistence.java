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

package tj.oblasti.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.oblasti.exception.NoSuchoblastiException;

import tj.oblasti.model.oblasti;

/**
 * The persistence interface for the oblasti service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.oblasti.service.persistence.impl.oblastiPersistenceImpl
 * @see oblastiUtil
 * @generated
 */
@ProviderType
public interface oblastiPersistence extends BasePersistence<oblasti> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link oblastiUtil} to access the oblasti persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the oblasti in the entity cache if it is enabled.
	*
	* @param oblasti the oblasti
	*/
	public void cacheResult(oblasti oblasti);

	/**
	* Caches the oblastis in the entity cache if it is enabled.
	*
	* @param oblastis the oblastis
	*/
	public void cacheResult(java.util.List<oblasti> oblastis);

	/**
	* Creates a new oblasti with the primary key. Does not add the oblasti to the database.
	*
	* @param oblasti_id the primary key for the new oblasti
	* @return the new oblasti
	*/
	public oblasti create(long oblasti_id);

	/**
	* Removes the oblasti with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti that was removed
	* @throws NoSuchoblastiException if a oblasti with the primary key could not be found
	*/
	public oblasti remove(long oblasti_id) throws NoSuchoblastiException;

	public oblasti updateImpl(oblasti oblasti);

	/**
	* Returns the oblasti with the primary key or throws a {@link NoSuchoblastiException} if it could not be found.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti
	* @throws NoSuchoblastiException if a oblasti with the primary key could not be found
	*/
	public oblasti findByPrimaryKey(long oblasti_id)
		throws NoSuchoblastiException;

	/**
	* Returns the oblasti with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oblasti_id the primary key of the oblasti
	* @return the oblasti, or <code>null</code> if a oblasti with the primary key could not be found
	*/
	public oblasti fetchByPrimaryKey(long oblasti_id);

	@Override
	public java.util.Map<java.io.Serializable, oblasti> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the oblastis.
	*
	* @return the oblastis
	*/
	public java.util.List<oblasti> findAll();

	/**
	* Returns a range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @return the range of oblastis
	*/
	public java.util.List<oblasti> findAll(int start, int end);

	/**
	* Returns an ordered range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of oblastis
	*/
	public java.util.List<oblasti> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<oblasti> orderByComparator);

	/**
	* Returns an ordered range of all the oblastis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link oblastiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oblastis
	* @param end the upper bound of the range of oblastis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of oblastis
	*/
	public java.util.List<oblasti> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<oblasti> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the oblastis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of oblastis.
	*
	* @return the number of oblastis
	*/
	public int countAll();
}