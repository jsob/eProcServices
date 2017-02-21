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

package tj.goroda.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.goroda.exception.NoSuchgorodaException;

import tj.goroda.model.goroda;

/**
 * The persistence interface for the goroda service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.goroda.service.persistence.impl.gorodaPersistenceImpl
 * @see gorodaUtil
 * @generated
 */
@ProviderType
public interface gorodaPersistence extends BasePersistence<goroda> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link gorodaUtil} to access the goroda persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the goroda in the entity cache if it is enabled.
	*
	* @param goroda the goroda
	*/
	public void cacheResult(goroda goroda);

	/**
	* Caches the gorodas in the entity cache if it is enabled.
	*
	* @param gorodas the gorodas
	*/
	public void cacheResult(java.util.List<goroda> gorodas);

	/**
	* Creates a new goroda with the primary key. Does not add the goroda to the database.
	*
	* @param goroda_id the primary key for the new goroda
	* @return the new goroda
	*/
	public goroda create(long goroda_id);

	/**
	* Removes the goroda with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda that was removed
	* @throws NoSuchgorodaException if a goroda with the primary key could not be found
	*/
	public goroda remove(long goroda_id) throws NoSuchgorodaException;

	public goroda updateImpl(goroda goroda);

	/**
	* Returns the goroda with the primary key or throws a {@link NoSuchgorodaException} if it could not be found.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda
	* @throws NoSuchgorodaException if a goroda with the primary key could not be found
	*/
	public goroda findByPrimaryKey(long goroda_id) throws NoSuchgorodaException;

	/**
	* Returns the goroda with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param goroda_id the primary key of the goroda
	* @return the goroda, or <code>null</code> if a goroda with the primary key could not be found
	*/
	public goroda fetchByPrimaryKey(long goroda_id);

	@Override
	public java.util.Map<java.io.Serializable, goroda> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the gorodas.
	*
	* @return the gorodas
	*/
	public java.util.List<goroda> findAll();

	/**
	* Returns a range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @return the range of gorodas
	*/
	public java.util.List<goroda> findAll(int start, int end);

	/**
	* Returns an ordered range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of gorodas
	*/
	public java.util.List<goroda> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<goroda> orderByComparator);

	/**
	* Returns an ordered range of all the gorodas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link gorodaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of gorodas
	* @param end the upper bound of the range of gorodas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of gorodas
	*/
	public java.util.List<goroda> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<goroda> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the gorodas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of gorodas.
	*
	* @return the number of gorodas
	*/
	public int countAll();
}